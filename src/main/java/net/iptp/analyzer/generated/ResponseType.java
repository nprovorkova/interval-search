
package net.iptp.analyzer.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="bar" type="{}barType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="line" type="{}lineType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseType", propOrder = {
    "barOrLine"
})
public class ResponseType {

    @XmlElements({
        @XmlElement(name = "bar", type = BarType.class),
        @XmlElement(name = "line", type = LineType.class)
    })
    protected List<Object> barOrLine;

    /**
     * Gets the value of the barOrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barOrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarOrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BarType }
     * {@link LineType }
     * 
     * 
     */
    public List<Object> getBarOrLine() {
        if (barOrLine == null) {
            barOrLine = new ArrayList<Object>();
        }
        return this.barOrLine;
    }

}
