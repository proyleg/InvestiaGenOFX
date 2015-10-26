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
 *         The OFX element "PERIODTODATE" is of type "PeriodToDate"
 *       
 * 
 * <p>Java class for PeriodToDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodToDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTSTART" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="DTEND" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="CONTRIBUTIONS" type="{http://ofx.net/types/2003/04}Contributions" minOccurs="0"/>
 *         &lt;element name="WITHDRAWALS" type="{http://ofx.net/types/2003/04}Withdrawals" minOccurs="0"/>
 *         &lt;element name="EARNINGS" type="{http://ofx.net/types/2003/04}Earnings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodToDate", propOrder = {
    "dtstart",
    "dtend",
    "contributions",
    "withdrawals",
    "earnings"
})
public class PeriodToDate {

    @XmlElement(name = "DTSTART", required = true)
    protected String dtstart;
    @XmlElement(name = "DTEND", required = true)
    protected String dtend;
    @XmlElement(name = "CONTRIBUTIONS")
    protected Contributions contributions;
    @XmlElement(name = "WITHDRAWALS")
    protected Withdrawals withdrawals;
    @XmlElement(name = "EARNINGS")
    protected Earnings earnings;

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
     * Gets the value of the contributions property.
     * 
     * @return
     *     possible object is
     *     {@link Contributions }
     *     
     */
    public Contributions getCONTRIBUTIONS() {
        return contributions;
    }

    /**
     * Sets the value of the contributions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contributions }
     *     
     */
    public void setCONTRIBUTIONS(Contributions value) {
        this.contributions = value;
    }

    /**
     * Gets the value of the withdrawals property.
     * 
     * @return
     *     possible object is
     *     {@link Withdrawals }
     *     
     */
    public Withdrawals getWITHDRAWALS() {
        return withdrawals;
    }

    /**
     * Sets the value of the withdrawals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Withdrawals }
     *     
     */
    public void setWITHDRAWALS(Withdrawals value) {
        this.withdrawals = value;
    }

    /**
     * Gets the value of the earnings property.
     * 
     * @return
     *     possible object is
     *     {@link Earnings }
     *     
     */
    public Earnings getEARNINGS() {
        return earnings;
    }

    /**
     * Sets the value of the earnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Earnings }
     *     
     */
    public void setEARNINGS(Earnings value) {
        this.earnings = value;
    }

}
