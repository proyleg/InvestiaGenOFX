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
 * <p>Java class for AbstractOpenOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractOpenOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OO" type="{http://ofx.net/types/2003/04}GeneralOpenOrder"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractOpenOrder", propOrder = {
    "oo"
})
@XmlSeeAlso({
    OpenOrderBuyOther.class,
    OpenOrderBuyDebt.class,
    OpenOrderBuyOption.class,
    OpenOrderSellDebt.class,
    OpenOrderSellOption.class,
    OpenOrderSwitchMutualFund.class,
    OpenOrderSellStock.class,
    OpenOrderBuyStock.class,
    OpenOrderSellMutualFund.class,
    OpenOrderSellOther.class,
    OpenOrderBuyMutualFund.class
})
public abstract class AbstractOpenOrder {

    @XmlElement(name = "OO", required = true)
    protected GeneralOpenOrder oo;

    /**
     * Gets the value of the oo property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralOpenOrder }
     *     
     */
    public GeneralOpenOrder getOO() {
        return oo;
    }

    /**
     * Sets the value of the oo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralOpenOrder }
     *     
     */
    public void setOO(GeneralOpenOrder value) {
        this.oo = value;
    }

}
