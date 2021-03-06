//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "WIREXFERMSGSETV1" is of type "WireTransferMessageSetV1"
 *       
 * 
 * <p>Java class for WireTransferMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireTransferMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractMessageSetVersion">
 *       &lt;sequence>
 *         &lt;element name="PROCDAYSOFF" type="{http://ofx.net/types/2003/04}DaysEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PROCENDTM" type="{http://ofx.net/types/2003/04}TimeType"/>
 *         &lt;element name="CANSCHED" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="DOMXFERFEE" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="INTLXFERFEE" type="{http://ofx.net/types/2003/04}AmountType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireTransferMessageSetV1", propOrder = {
    "procdaysoff",
    "procendtm",
    "cansched",
    "domxferfee",
    "intlxferfee"
})
public class WireTransferMessageSetV1
    extends AbstractMessageSetVersion
{

    @XmlElement(name = "PROCDAYSOFF")
    protected List<DaysEnum> procdaysoff;
    @XmlElement(name = "PROCENDTM", required = true)
    protected String procendtm;
    @XmlElement(name = "CANSCHED", required = true)
    protected BooleanType cansched;
    @XmlElement(name = "DOMXFERFEE", required = true)
    protected String domxferfee;
    @XmlElement(name = "INTLXFERFEE", required = true)
    protected String intlxferfee;

    /**
     * Gets the value of the procdaysoff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procdaysoff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROCDAYSOFF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysEnum }
     * 
     * 
     */
    public List<DaysEnum> getPROCDAYSOFF() {
        if (procdaysoff == null) {
            procdaysoff = new ArrayList<DaysEnum>();
        }
        return this.procdaysoff;
    }

    /**
     * Gets the value of the procendtm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCENDTM() {
        return procendtm;
    }

    /**
     * Sets the value of the procendtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCENDTM(String value) {
        this.procendtm = value;
    }

    /**
     * Gets the value of the cansched property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getCANSCHED() {
        return cansched;
    }

    /**
     * Sets the value of the cansched property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setCANSCHED(BooleanType value) {
        this.cansched = value;
    }

    /**
     * Gets the value of the domxferfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMXFERFEE() {
        return domxferfee;
    }

    /**
     * Sets the value of the domxferfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMXFERFEE(String value) {
        this.domxferfee = value;
    }

    /**
     * Gets the value of the intlxferfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTLXFERFEE() {
        return intlxferfee;
    }

    /**
     * Sets the value of the intlxferfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTLXFERFEE(String value) {
        this.intlxferfee = value;
    }

}
