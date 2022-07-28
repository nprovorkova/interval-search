package net.iptp.analyzer.service;

import net.iptp.analyzer.config.Constants;
import net.iptp.analyzer.generated.BarType;
import net.iptp.analyzer.generated.ObjectFactory;
import net.iptp.analyzer.generated.ResponseType;
import net.iptp.analyzer.service.dto.IntervalDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TimeIntervalService {

    private static final SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);

    public List<IntervalDTO> analyzeTimeIntervals(InputStream inputStream) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<ResponseType> responseJAXBElement = (JAXBElement<ResponseType>) jaxbUnmarshaller.unmarshal(inputStream);
            ResponseType response = responseJAXBElement.getValue();
            List<Object> responseObjects = response.getBarOrLine();

            List<IntervalDTO> workingIntervalList = responseObjects.stream()
                .filter(el -> el instanceof BarType)
                .map(el -> createIntervalByBarType((BarType) el))
                .collect(Collectors.toList());

            return findUnassignedIntervalList(workingIntervalList);
        } catch (JAXBException e) {
            if (e.getMessage() == null) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getCause().getMessage());
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
            }
        }
    }

    private List<IntervalDTO> findUnassignedIntervalList(List<IntervalDTO> workingIntervalList) {
        List<IntervalDTO> unassignedIntervalList = new ArrayList<>();
        Optional<IntervalDTO> firstInterval = workingIntervalList.stream().min(Comparator.comparing(IntervalDTO::getStartDate));
        if (!firstInterval.isPresent()) {
            return Collections.emptyList();
        }
        boolean foundLastInterval = false;
        Date currentLastWorkingTime = firstInterval.get().getEndDate();
        while (!foundLastInterval) {
            // el.startDate <= currentLastWorkingTime && el.endDate > currentLastWorkingTime
            final Date lastWorkingTime = currentLastWorkingTime;
            Optional<IntervalDTO> workingTimeAfterCurrent = workingIntervalList.stream()
                .filter(el -> !el.getStartDate().after(lastWorkingTime) && el.getEndDate().after(lastWorkingTime))
                .max(Comparator.comparing(IntervalDTO::getEndDate));

            if (workingTimeAfterCurrent.isPresent()) {
                //found the intersection of working intervals, go to next iteration
                currentLastWorkingTime = workingTimeAfterCurrent.get().getEndDate();
            } else {
                Optional<IntervalDTO> assignedIntervalAfterCurrent = workingIntervalList.stream()
                    .filter(el -> el.getStartDate().after(lastWorkingTime))
                    .min(Comparator.comparing(IntervalDTO::getStartDate));
                if (assignedIntervalAfterCurrent.isPresent()) {
                    // unassigned interval found
                    IntervalDTO unassignedInterval = new IntervalDTO();
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

    private IntervalDTO createIntervalByBarType(BarType barType) {
        IntervalDTO interval = new IntervalDTO();
        try {
            Date startDate = formatter.parse(barType.getStartdate());
            interval.setStartDate(startDate);
            Date endDate = formatter.parse(barType.getEnddate());
            interval.setEndDate(endDate);
        } catch (ParseException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return interval;
    }
}
