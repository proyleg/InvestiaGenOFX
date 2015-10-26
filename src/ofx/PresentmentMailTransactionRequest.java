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
 *         The OFX element "PRESMAILTRNRQ" is of type "PresentmentMailTransactionRequest"
 *       
 * 
 * <p>Java class for PresentmentMailTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentMailTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="PRESMAILRQ" type="{http://ofx.net/types/2003/04}PresentmentMailRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentMailTransactionRequest", propOrder = {
    "presmailrq"
})
public class PresentmentMailTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "PRESMAILRQ", required = true)
    protected PresentmentMailRequest presmailrq;

    /**
     * Gets the value of the presmailrq property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentMailRequest }
     *     
     */
    public PresentmentMailRequest getPRESMAILRQ() {
        return presmailrq;
    }

    /**
     * Sets the value of the presmailrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentMailRequest }
     *     
     */
    public void setPRESMAILRQ(PresentmentMailRequest value) {
        this.presmailrq = value;
    }

}
