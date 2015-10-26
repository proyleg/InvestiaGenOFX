//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "PRESLISTRS" is of type "PresentmentListResponse"
 *       
 * 
 * <p>Java class for PresentmentListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLPUB" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="USERID" type="{http://ofx.net/types/2003/04}IdType"/>
 *         &lt;element name="DTSTART" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="DTEND" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="PRESLIST" type="{http://ofx.net/types/2003/04}PresentmentList" minOccurs="0"/>
 *         &lt;element name="PRESCOUNTS" type="{http://ofx.net/types/2003/04}PresentmentCounts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentListResponse", propOrder = {
    "billpub",
    "userid",
    "dtstart",
    "dtend",
    "preslist",
    "prescounts"
})
public class PresentmentListResponse {

    @XmlElement(name = "BILLPUB", required = true)
    protected String billpub;
    @XmlElement(name = "USERID", required = true)
    protected String userid;
    @XmlElement(name = "DTSTART", required = true)
    protected String dtstart;
    @XmlElement(name = "DTEND", required = true)
    protected String dtend;
    @XmlElement(name = "PRESLIST")
    protected PresentmentList preslist;
    @XmlElement(name = "PRESCOUNTS")
    protected PresentmentCounts prescounts;

    /**
     * Gets the value of the billpub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLPUB() {
        return billpub;
    }

    /**
     * Sets the value of the billpub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLPUB(String value) {
        this.billpub = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
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
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the dtstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTSTART() {
        return dtstart;
    }

    /**
     * Sets the value of the dtstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTSTART(String value) {
        this.dtstart = value;
    }

    /**
     * Gets the value of the dtend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEND() {
        return dtend;
    }

    /**
     * Sets the value of the dtend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEND(String value) {
        this.dtend = value;
    }

    /**
     * Gets the value of the preslist property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentList }
     *     
     */
    public PresentmentList getPRESLIST() {
        return preslist;
    }

    /**
     * Sets the value of the preslist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentList }
     *     
     */
    public void setPRESLIST(PresentmentList value) {
        this.preslist = value;
    }

    /**
     * Gets the value of the prescounts property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentCounts }
     *     
     */
    public PresentmentCounts getPRESCOUNTS() {
        return prescounts;
    }

    /**
     * Sets the value of the prescounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentCounts }
     *     
     */
    public void setPRESCOUNTS(PresentmentCounts value) {
        this.prescounts = value;
    }

}