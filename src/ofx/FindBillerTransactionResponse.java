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
 *         The OFX element "FINDBILLERTRNRS" is of type "FindBillerTransactionResponse"
 *       
 * 
 * <p>Java class for FindBillerTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindBillerTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionResponse">
 *       &lt;sequence>
 *         &lt;element name="FINDBILLERRS" type="{http://ofx.net/types/2003/04}FindBillerResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindBillerTransactionResponse", propOrder = {
    "findbillerrs"
})
public class FindBillerTransactionResponse
    extends AbstractTransactionResponse
{

    @XmlElement(name = "FINDBILLERRS")
    protected FindBillerResponse findbillerrs;

    /**
     * Gets the value of the findbillerrs property.
     * 
     * @return
     *     possible object is
     *     {@link FindBillerResponse }
     *     
     */
    public FindBillerResponse getFINDBILLERRS() {
        return findbillerrs;
    }

    /**
     * Sets the value of the findbillerrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindBillerResponse }
     *     
     */
    public void setFINDBILLERRS(FindBillerResponse value) {
        this.findbillerrs = value;
    }

}
