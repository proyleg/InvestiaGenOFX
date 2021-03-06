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
 *         The OFX element "WIRESYNCRQ" is of type "WireSyncRequest"
 *       
 * 
 * <p>Java class for WireSyncRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireSyncRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractSyncRequest">
 *       &lt;sequence>
 *         &lt;element name="BANKACCTFROM" type="{http://ofx.net/types/2003/04}BankAccount"/>
 *         &lt;element name="WIRETRNRQ" type="{http://ofx.net/types/2003/04}WireTransactionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireSyncRequest", propOrder = {
    "bankacctfrom",
    "wiretrnrq"
})
public class WireSyncRequest
    extends AbstractSyncRequest
{

    @XmlElement(name = "BANKACCTFROM", required = true)
    protected BankAccount bankacctfrom;
    @XmlElement(name = "WIRETRNRQ")
    protected List<WireTransactionRequest> wiretrnrq;

    /**
     * Gets the value of the bankacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBANKACCTFROM() {
        return bankacctfrom;
    }

    /**
     * Sets the value of the bankacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBANKACCTFROM(BankAccount value) {
        this.bankacctfrom = value;
    }

    /**
     * Gets the value of the wiretrnrq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wiretrnrq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWIRETRNRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireTransactionRequest }
     * 
     * 
     */
    public List<WireTransactionRequest> getWIRETRNRQ() {
        if (wiretrnrq == null) {
            wiretrnrq = new ArrayList<WireTransactionRequest>();
        }
        return this.wiretrnrq;
    }

}
