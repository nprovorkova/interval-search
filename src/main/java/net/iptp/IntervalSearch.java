package net.iptp;

import net.iptp.generated.BarType;
import net.iptp.generated.ObjectFactory;
import net.iptp.generated.ResponseType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class IntervalSearch {

    private static final String SOURCE_XML_NAME= "data_java-2";

    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        try {
            IntervalSearch intervalSearch = new IntervalSearch(); //todo remove!

            final InputStream file = IntervalSearch.class.getClassLoader().getResourceAsStream(SOURCE_XML_NAME + ".xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<ResponseType> responseJAXBElement = (JAXBElement<ResponseType>) jaxbUnmarshaller.unmarshal(file);
            ResponseType response = responseJAXBElement.getValue();
            List<Object> responseObjects = response.getBarOrLine();

            List<Interval> workingIntervalList = responseObjects.stream()
                    .filter(el -> el instanceof BarType)
                    .map(el -> intervalSearch.createIntervalByBarType((BarType) el))
                    .collect(Collectors.toList());

            List<Interval> unassignedIntervalList  = intervalSearch.findUnassignedIntervalList(workingIntervalList);
            if (unassignedIntervalList.isEmpty()) {
                System.out.println("Unassigned intervals not found!");
            } else {
                unassignedIntervalList.forEach(el -> System.out.println("Start: " + formatter.format(el.getStartDate()) + " End: " + formatter.format(el.getEndDate())));
            }

        } catch (JAXBException e) {
            if (e.getMessage() == null) {
                System.out.println("Error! " + e.getCause().getMessage());
            } else {
                System.out.println("Error! " + e.getMessage());
            }
        }

    }

    private List<Interval> findUnassignedIntervalList(List<Interval> workingIntervalList) {
        List<Interval> unassignedIntervalList = new ArrayList<>();
        Optional<Interval> firstInterval = workingIntervalList.stream().min(Comparator.comparing(Interval::getStartDate));
        if (!firstInterval.isPresent()) {
            return Collections.emptyList();
        }
        boolean foundLastInterval = false;
        Date currentLastWorkingTime = firstInterval.get().getEndDate();
        while (!foundLastInterval) {
            // el.startDate <= currentLastWorkingTime && el.endDate > currentLastWorkingTime
            final Date lastWorkingTime = currentLastWorkingTime;
            Optional<Interval> workingTimeAfterCurrent = workingIntervalList.stream()
                    .filter(el -> !el.getStartDate().after(lastWorkingTime) && el.getEndDate().after(lastWorkingTime))
                    .max(Comparator.comparing(Interval::getEndDate));

            if (workingTimeAfterCurrent.isPresent()) {
                //found the intersection of working intervals, go to next iteration
                currentLastWorkingTime = workingTimeAfterCurrent.get().getEndDate();
            } else {
                Optional<Interval> assignedIntervalAfterCurrent = workingIntervalList.stream()
                        .filter(el -> el.getStartDate().after(lastWorkingTime))
                        .min(Comparator.comparing(Interval::getStartDate));
                if (assignedIntervalAfterCurrent.isPresent()) {
                    // unassigned interval found
                    Interval unassignedInterval = new Interval();
                    unassignedInterval.setStartDate(currentLastWorkingTime);
                    unassignedInterval.setEndDate(assignedIntervalAfterCurrent.get().getStartDate());
                    unassignedIntervalList.add(unassignedInterval);
                    currentLastWorkingTime = assignedIntervalAfterCurrent.get().getEndDate();
                } else {
                    // found last working time
                    foundLastInterval = true;
                }
            }
        }
        return unassignedIntervalList;
    }

    private Interval createIntervalByBarType(BarType barType) {
        Interval interval = new Interval();
        try {
            Date startDate = formatter.parse(barType.getStartdate());
            interval.setStartDate(startDate);
            Date endDate = formatter.parse(barType.getEnddate());
            interval.setEndDate(endDate);
        } catch (ParseException e) {
            System.out.println("Error! " + e.getMessage());
        }
        return interval;
    }
}
