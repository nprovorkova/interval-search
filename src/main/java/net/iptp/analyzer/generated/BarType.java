
package net.iptp.analyzer.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for barType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="barType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="addedby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="datacenter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dateoffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dcname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enddate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isdbar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useroffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usertype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasnccduty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="skype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leaveend" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leavestart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groups" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="times" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "barType", propOrder = {
    "value"
})
public class BarType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "addedby")
    protected String addedby;
    @XmlAttribute(name = "comment")
    protected String comment;
    @XmlAttribute(name = "datacenter")
    protected String datacenter;
    @XmlAttribute(name = "dateoffset")
    protected String dateoffset;
    @XmlAttribute(name = "dcname")
    protected String dcname;
    @XmlAttribute(name = "enddate")
    protected String enddate;
    @XmlAttribute(name = "group")
    protected String group;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "isdbar")
    protected String isdbar;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "startdate")
    protected String startdate;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "useroffset")
    protected String useroffset;
    @XmlAttribute(name = "usertype")
    protected String usertype;
    @XmlAttribute(name = "hasnccduty")
    protected String hasnccduty;
    @XmlAttribute(name = "skype")
    protected String skype;
    @XmlAttribute(name = "extension")
    protected String extension;
    @XmlAttribute(name = "leaveend")
    protected String leaveend;
    @XmlAttribute(name = "leavestart")
    protected String leavestart;
    @XmlAttribute(name = "email")
    protected String email;
    @XmlAttribute(name = "groups")
    protected String groups;
    @XmlAttribute(name = "times")
    protected String times;
    @XmlAttribute(name = "userid")
    protected String userid;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the addedby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedby() {
        return addedby;
    }

    /**
     * Sets the value of the addedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedby(String value) {
        this.addedby = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the datacenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatacenter() {
        return datacenter;
    }

    /**
     * Sets the value of the datacenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatacenter(String value) {
        this.datacenter = value;
    }

    /**
     * Gets the value of the dateoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateoffset() {
        return dateoffset;
    }

    /**
     * Sets the value of the dateoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateoffset(String value) {
        this.dateoffset = value;
    }

    /**
     * Gets the value of the dcname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcname() {
        return dcname;
    }

    /**
     * Sets the value of the dcname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcname(String value) {
        this.dcname = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnddate() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnddate(String value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isdbar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdbar() {
        return isdbar;
    }

    /**
     * Sets the value of the isdbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdbar(String value) {
        this.isdbar = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartdate() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartdate(String value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the useroffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseroffset() {
        return useroffset;
    }

    /**
     * Sets the value of the useroffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseroffset(String value) {
        this.useroffset = value;
    }

    /**
     * Gets the value of the usertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * Sets the value of the usertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsertype(String value) {
        this.usertype = value;
    }

    /**
     * Gets the value of the hasnccduty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasnccduty() {
        return hasnccduty;
    }

    /**
     * Sets the value of the hasnccduty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasnccduty(String value) {
        this.hasnccduty = value;
    }

    /**
     * Gets the value of the skype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkype() {
        return skype;
    }

    /**
     * Sets the value of the skype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkype(String value) {
        this.skype = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the leaveend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaveend() {
        return leaveend;
    }

    /**
     * Sets the value of the leaveend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaveend(String value) {
        this.leaveend = value;
    }

    /**
     * Gets the value of the leavestart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeavestart() {
        return leavestart;
    }

    /**
     * Sets the value of the leavestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeavestart(String value) {
        this.leavestart = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroups(String value) {
        this.groups = value;
    }

    /**
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimes(String value) {
        this.times = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

}
