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
 *         The OFX element "RECINTRAMODRQ" is of type "RecurringIntraModRequest"
 *       
 * 
 * <p>Java class for RecurringIntraModRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringIntraModRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractRecurringIntraRequest">
 *       &lt;sequence>
 *         &lt;element name="RECSRVRTID" type="{http://ofx.net/types/2003/04}ServerIdType"/>
 *         &lt;element name="RECURRINST" type="{http://ofx.net/types/2003/04}RecurringInstructions"/>
 *         &lt;element name="INTRARQ" type="{http://ofx.net/types/2003/04}IntraRequest"/>
 *         &lt;element name="MODPENDING" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringIntraModRequest", propOrder = {
    "recsrvrtid",
    "recurrinst",
    "intrarq",
    "modpending"
})
public class RecurringIntraModRequest
    extends AbstractRecurringIntraRequest
{

    @XmlElement(name = "RECSRVRTID", required = true)
    protected String recsrvrtid;
    @XmlElement(name = "RECURRINST", required = true)
    protected RecurringInstructions recurrinst;
    @XmlElement(name = "INTRARQ", required = true)
    protected IntraRequest intrarq;
    @XmlElement(name = "MODPENDING", required = true)
    protected BooleanType modpending;

    /**
     * Gets the value of the recsrvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECSRVRTID() {
        return recsrvrtid;
    }

    /**
     * Sets the value of the recsrvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECSRVRTID(String value) {
        this.recsrvrtid = value;
    }

    /**
     * Gets the value of the recurrinst property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringInstructions }
     *     
     */
    public RecurringInstructions getRECURRINST() {
        return recurrinst;
    }

    /**
     * Sets the value of the recurrinst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringInstructions }
     *     
     */
    public void setRECURRINST(RecurringInstructions value) {
        this.recurrinst = value;
    }

    /**
     * Gets the value of the intrarq property.
     * 
     * @return
     *     possible object is
     *     {@link IntraRequest }
     *     
     */
    public IntraRequest getINTRARQ() {
        return intrarq;
    }

    /**
     * Sets the value of the intrarq property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraRequest }
     *     
     */
    public void setINTRARQ(IntraRequest value) {
        this.intrarq = value;
    }

    /**
     * Gets the value of the modpending property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getMODPENDING() {
        return modpending;
    }

    /**
     * Sets the value of the modpending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setMODPENDING(BooleanType value) {
        this.modpending = value;
    }

}
