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
 *         The OFX element "SWITCHMF" is of type "OpenOrderSwitchMutualFund"
 *       
 * 
 * <p>Java class for OpenOrderSwitchMutualFund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenOrderSwitchMutualFund">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractOpenOrder">
 *       &lt;sequence>
 *         &lt;element name="SECID" type="{http://ofx.net/types/2003/04}SecurityId"/>
 *         &lt;element name="UNITTYPE" type="{http://ofx.net/types/2003/04}UnitTypeEnum"/>
 *         &lt;element name="SWITCHALL" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOrderSwitchMutualFund", propOrder = {
    "secid",
    "unittype",
    "switchall"
})
public class OpenOrderSwitchMutualFund
    extends AbstractOpenOrder
{

    @XmlElement(name = "SECID", required = true)
    protected SecurityId secid;
    @XmlElement(name = "UNITTYPE", required = true)
    protected UnitTypeEnum unittype;
    @XmlElement(name = "SWITCHALL", required = true)
    protected BooleanType switchall;

    /**
     * Gets the value of the secid property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityId }
     *     
     */
    public SecurityId getSECID() {
        return secid;
    }

    /**
     * Sets the value of the secid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityId }
     *     
     */
    public void setSECID(SecurityId value) {
        this.secid = value;
    }

    /**
     * Gets the value of the unittype property.
     * 
     * @return
     *     possible object is
     *     {@link UnitTypeEnum }
     *     
     */
    public UnitTypeEnum getUNITTYPE() {
        return unittype;
    }

    /**
     * Sets the value of the unittype property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitTypeEnum }
     *     
     */
    public void setUNITTYPE(UnitTypeEnum value) {
        this.unittype = value;
    }

    /**
     * Gets the value of the switchall property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getSWITCHALL() {
        return switchall;
    }

    /**
     * Sets the value of the switchall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setSWITCHALL(BooleanType value) {
        this.switchall = value;
    }

}
