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
 *         The OFX element "STPCHKRQ" is of type "StopCheckRequest"
 *       
 * 
 * <p>Java class for StopCheckRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopCheckRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BANKACCTFROM" type="{http://ofx.net/types/2003/04}BankAccount"/>
 *         &lt;choice>
 *           &lt;element name="CHKRANGE" type="{http://ofx.net/types/2003/04}CheckRange"/>
 *           &lt;element name="CHKDESC" type="{http://ofx.net/types/2003/04}CheckDescription"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopCheckRequest", propOrder = {
    "bankacctfrom",
    "chkrange",
    "chkdesc"
})
public class StopCheckRequest {

    @XmlElement(name = "BANKACCTFROM", required = true)
    protected BankAccount bankacctfrom;
    @XmlElement(name = "CHKRANGE")
    protected CheckRange chkrange;
    @XmlElement(name = "CHKDESC")
    protected CheckDescription chkdesc;

    /**
     * Gets the value of the bankacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBANKACCTFROM() {
        return bankacctfrom;
    }

    /**
     * Sets the value of the bankacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBANKACCTFROM(BankAccount value) {
        this.bankacctfrom = value;
    }

    /**
     * Gets the value of the chkrange property.
     * 
     * @return
     *     possible object is
     *     {@link CheckRange }
     *     
     */
    public CheckRange getCHKRANGE() {
        return chkrange;
    }

    /**
     * Sets the value of the chkrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRange }
     *     
     */
    public void setCHKRANGE(CheckRange value) {
        this.chkrange = value;
    }

    /**
     * Gets the value of the chkdesc property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDescription }
     *     
     */
    public CheckDescription getCHKDESC() {
        return chkdesc;
    }

    /**
     * Sets the value of the chkdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDescription }
     *     
     */
    public void setCHKDESC(CheckDescription value) {
        this.chkdesc = value;
    }

}
