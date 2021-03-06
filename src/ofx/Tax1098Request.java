//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         The OFX element "TAX1098RQ" is of type "Tax1098Request"
 *       
 * 
 * <p>Java class for Tax1098Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tax1098Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCTNUM" type="{http://ofx.net/types/2003/04}AccountIdType" minOccurs="0"/>
 *         &lt;element name="SSN" type="{http://ofx.net/types/2003/04}GenericNameType" minOccurs="0"/>
 *         &lt;element name="TAXYEAR" type="{http://ofx.net/types/2003/04}YearType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax1098Request", propOrder = {
    "acctnum",
    "ssn",
    "taxyear"
})
public class Tax1098Request {

    @XmlElement(name = "ACCTNUM")
    protected String acctnum;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "TAXYEAR")
    protected List<XMLGregorianCalendar> taxyear;

    /**
     * Gets the value of the acctnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTNUM() {
        return acctnum;
    }

    /**
     * Sets the value of the acctnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTNUM(String value) {
        this.acctnum = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the taxyear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxyear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAXYEAR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getTAXYEAR() {
        if (taxyear == null) {
            taxyear = new ArrayList<XMLGregorianCalendar>();
        }
        return this.taxyear;
    }

}
