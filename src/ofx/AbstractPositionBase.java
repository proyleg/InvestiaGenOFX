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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractPositionBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPositionBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INVPOS" type="{http://ofx.net/types/2003/04}InvestmentPosition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPositionBase", propOrder = {
    "invpos"
})
@XmlSeeAlso({
    PositionOption.class,
    PositionOther.class,
    PositionStock.class,
    PositionDebt.class,
    PositionMutualFund.class
})
public abstract class AbstractPositionBase {

    @XmlElement(name = "INVPOS", required = true)
    protected InvestmentPosition invpos;

    /**
     * Gets the value of the invpos property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentPosition }
     *     
     */
    public InvestmentPosition getINVPOS() {
        return invpos;
    }

    /**
     * Sets the value of the invpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentPosition }
     *     
     */
    public void setINVPOS(InvestmentPosition value) {
        this.invpos = value;
    }

}
