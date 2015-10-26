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
 *         The OFX element "FINDBILLERTRNRQ" is of type "FindBillerTransactionRequest"
 *       
 * 
 * <p>Java class for FindBillerTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindBillerTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="FINDBILLERRQ" type="{http://ofx.net/types/2003/04}FindBillerRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindBillerTransactionRequest", propOrder = {
    "findbillerrq"
})
public class FindBillerTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "FINDBILLERRQ", required = true)
    protected FindBillerRequest findbillerrq;

    /**
     * Gets the value of the findbillerrq property.
     * 
     * @return
     *     possible object is
     *     {@link FindBillerRequest }
     *     
     */
    public FindBillerRequest getFINDBILLERRQ() {
        return findbillerrq;
    }

    /**
     * Sets the value of the findbillerrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindBillerRequest }
     *     
     */
    public void setFINDBILLERRQ(FindBillerRequest value) {
        this.findbillerrq = value;
    }

}
