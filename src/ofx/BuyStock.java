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
 *         The OFX element "BUYSTOCK" is of type "BuyStock"
 *       
 * 
 * <p>Java class for BuyStock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyStock">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractInvestmentBuyTransaction">
 *       &lt;sequence>
 *         &lt;element name="BUYTYPE" type="{http://ofx.net/types/2003/04}BuyEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyStock", propOrder = {
    "buytype"
})
public class BuyStock
    extends AbstractInvestmentBuyTransaction
{

    @XmlElement(name = "BUYTYPE", required = true)
    protected BuyEnum buytype;

    /**
     * Gets the value of the buytype property.
     * 
     * @return
     *     possible object is
     *     {@link BuyEnum }
     *     
     */
    public BuyEnum getBUYTYPE() {
        return buytype;
    }

    /**
     * Sets the value of the buytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyEnum }
     *     
     */
    public void setBUYTYPE(BuyEnum value) {
        this.buytype = value;
    }

}
