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
 *         The OFX element "PRESACCTINFO" is of type "PresentmentAccountInfo"
 *       
 * 
 * <p>Java class for PresentmentAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentAccountInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractAccountInfo">
 *       &lt;sequence>
 *         &lt;element name="PRESACCTFROM" type="{http://ofx.net/types/2003/04}PresentmentAccount"/>
 *         &lt;element name="SVCSTATUS" type="{http://ofx.net/types/2003/04}ServiceStatus2Enum"/>
 *         &lt;element name="REASON" type="{http://ofx.net/types/2003/04}MessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentAccountInfo", propOrder = {
    "presacctfrom",
    "svcstatus",
    "reason"
})
public class PresentmentAccountInfo
    extends AbstractAccountInfo
{

    @XmlElement(name = "PRESACCTFROM", required = true)
    protected PresentmentAccount presacctfrom;
    @XmlElement(name = "SVCSTATUS", required = true)
    protected ServiceStatus2Enum svcstatus;
    @XmlElement(name = "REASON")
    protected String reason;

    /**
     * Gets the value of the presacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentAccount }
     *     
     */
    public PresentmentAccount getPRESACCTFROM() {
        return presacctfrom;
    }

    /**
     * Sets the value of the presacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentAccount }
     *     
     */
    public void setPRESACCTFROM(PresentmentAccount value) {
        this.presacctfrom = value;
    }

    /**
     * Gets the value of the svcstatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus2Enum }
     *     
     */
    public ServiceStatus2Enum getSVCSTATUS() {
        return svcstatus;
    }

    /**
     * Sets the value of the svcstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus2Enum }
     *     
     */
    public void setSVCSTATUS(ServiceStatus2Enum value) {
        this.svcstatus = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASON() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASON(String value) {
        this.reason = value;
    }

}
