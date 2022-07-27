
package net.iptp.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for lineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="dateoffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groups" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="times" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addedby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="datacenter" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineType", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class LineType {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "dateoffset")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String dateoffset;
    @XmlAttribute(name = "groups")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String groups;
    @XmlAttribute(name = "times")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String times;
    @XmlAttribute(name = "userid")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String userid;
    @XmlAttribute(name = "addedby")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String addedby;
    @XmlAttribute(name = "comment")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String comment;
    @XmlAttribute(name = "datacenter")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String datacenter;
    @XmlAttribute(name = "dcname")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String dcname;
    @XmlAttribute(name = "enddate")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String enddate;
    @XmlAttribute(name = "group")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String group;
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;
    @XmlAttribute(name = "isdbar")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String isdbar;
    @XmlAttribute(name = "name")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlAttribute(name = "startdate")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String startdate;
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;
    @XmlAttribute(name = "useroffset")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String useroffset;
    @XmlAttribute(name = "usertype")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String usertype;
    @XmlAttribute(name = "hasnccduty")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String hasnccduty;
    @XmlAttribute(name = "skype")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String skype;
    @XmlAttribute(name = "extension")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String extension;
    @XmlAttribute(name = "leaveend")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String leaveend;
    @XmlAttribute(name = "leavestart")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String leavestart;
    @XmlAttribute(name = "email")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String email;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dateoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDateoffset(String value) {
        this.dateoffset = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the addedby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDatacenter(String value) {
        this.datacenter = value;
    }

    /**
     * Gets the value of the dcname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2022-07-27T10:35:31+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEmail(String value) {
        this.email = value;
    }

}
