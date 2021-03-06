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
 *         The OFX element "RECADDR" is of type "RecurringAddress"
 *       
 * 
 * <p>Java class for RecurringAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECNAME1" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="RECNAME2" type="{http://ofx.net/types/2003/04}GenericNameType" minOccurs="0"/>
 *         &lt;element name="ADDR1" type="{http://ofx.net/types/2003/04}AddressType"/>
 *         &lt;element name="ADDR2" type="{http://ofx.net/types/2003/04}AddressType" minOccurs="0"/>
 *         &lt;element name="ADDR3" type="{http://ofx.net/types/2003/04}AddressType" minOccurs="0"/>
 *         &lt;element name="CITY" type="{http://ofx.net/types/2003/04}AddressType" minOccurs="0"/>
 *         &lt;element name="STATE" type="{http://ofx.net/types/2003/04}StateType" minOccurs="0"/>
 *         &lt;element name="POSTALCODE" type="{http://ofx.net/types/2003/04}ZipType" minOccurs="0"/>
 *         &lt;element name="COUNTRYSTRING" type="{http://ofx.net/types/2003/04}CountryStringType" minOccurs="0"/>
 *         &lt;element name="PHONE" type="{http://ofx.net/types/2003/04}PhoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringAddress", propOrder = {
    "recname1",
    "recname2",
    "addr1",
    "addr2",
    "addr3",
    "city",
    "state",
    "postalcode",
    "countrystring",
    "phone"
})
public class RecurringAddress {

    @XmlElement(name = "RECNAME1", required = true)
    protected String recname1;
    @XmlElement(name = "RECNAME2")
    protected String recname2;
    @XmlElement(name = "ADDR1", required = true)
    protected String addr1;
    @XmlElement(name = "ADDR2")
    protected String addr2;
    @XmlElement(name = "ADDR3")
    protected String addr3;
    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "POSTALCODE")
    protected String postalcode;
    @XmlElement(name = "COUNTRYSTRING")
    protected String countrystring;
    @XmlElement(name = "PHONE")
    protected String phone;

    /**
     * Gets the value of the recname1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECNAME1() {
        return recname1;
    }

    /**
     * Sets the value of the recname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECNAME1(String value) {
        this.recname1 = value;
    }

    /**
     * Gets the value of the recname2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECNAME2() {
        return recname2;
    }

    /**
     * Sets the value of the recname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECNAME2(String value) {
        this.recname2 = value;
    }

    /**
     * Gets the value of the addr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDR1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDR1(String value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDR2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDR2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the addr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDR3() {
        return addr3;
    }

    /**
     * Sets the value of the addr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDR3(String value) {
        this.addr3 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTALCODE() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTALCODE(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the countrystring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYSTRING() {
        return countrystring;
    }

    /**
     * Sets the value of the countrystring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYSTRING(String value) {
        this.countrystring = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONE() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONE(String value) {
        this.phone = value;
    }

}
