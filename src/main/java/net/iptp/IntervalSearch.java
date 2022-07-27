package net.iptp;

import net.iptp.generated.BarType;
import net.iptp.generated.ObjectFactory;
import net.iptp.generated.ResponseType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.List;

public class IntervalSearch {

    private static final String SOURCE_XML_NAME= "data_java-2";

    public static void main(String[] args) {
        try {
            final InputStream file = IntervalSearch.class.getClassLoader().getResourceAsStream(SOURCE_XML_NAME + ".xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<ResponseType> responseJAXBElement = (JAXBElement<ResponseType>) jaxbUnmarshaller.unmarshal(file);
            ResponseType response = responseJAXBElement.getValue();
            List<Object> responseObjects = response.getBarOrLine();
            for(Object data : responseObjects) {
                if (data instanceof BarType) {
                    BarType barType = (BarType) data;
                    System.out.println(barType.getStartdate());
                }
            }
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }

    }
}
