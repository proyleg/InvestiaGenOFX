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
 *         The OFX element "RECINTERTRNRQ" is of type "RecurringInterTransactionRequest"
 *       
 * 
 * <p>Java class for RecurringInterTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringInterTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="RECINTERRQ" type="{http://ofx.net/types/2003/04}RecurringInterRequest"/>
 *           &lt;element name="RECINTERMODRQ" type="{http://ofx.net/types/2003/04}RecurringInterModRequest"/>
 *           &lt;element name="RECINTERCANRQ" type="{http://ofx.net/types/2003/04}RecurringInterCancellationRequest"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringInterTransactionRequest", propOrder = {
    "recinterrq",
    "recintermodrq",
    "recintercanrq"
})
public class RecurringInterTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "RECINTERRQ")
    protected RecurringInterRequest recinterrq;
    @XmlElement(name = "RECINTERMODRQ")
    protected RecurringInterModRequest recintermodrq;
    @XmlElement(name = "RECINTERCANRQ")
    protected RecurringInterCancellationRequest recintercanrq;

    /**
     * Gets the value of the recinterrq property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringInterRequest }
     *     
     */
    public RecurringInterRequest getRECINTERRQ() {
        return recinterrq;
    }

    /**
     * Sets the value of the recinterrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringInterRequest }
     *     
     */
    public void setRECINTERRQ(RecurringInterRequest value) {
        this.recinterrq = value;
    }

    /**
     * Gets the value of the recintermodrq property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringInterModRequest }
     *     
     */
    public RecurringInterModRequest getRECINTERMODRQ() {
        return recintermodrq;
    }

    /**
     * Sets the value of the recintermodrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringInterModRequest }
     *     
     */
    public void setRECINTERMODRQ(RecurringInterModRequest value) {
        this.recintermodrq = value;
    }

    /**
     * Gets the value of the recintercanrq property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringInterCancellationRequest }
     *     
     */
    public RecurringInterCancellationRequest getRECINTERCANRQ() {
        return recintercanrq;
    }

    /**
     * Sets the value of the recintercanrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringInterCancellationRequest }
     *     
     */
    public void setRECINTERCANRQ(RecurringInterCancellationRequest value) {
        this.recintercanrq = value;
    }

}
