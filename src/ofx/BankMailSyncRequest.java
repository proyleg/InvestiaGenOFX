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
 *         The OFX element "BANKMAILSYNCRQ" is of type "BankMailSyncRequest"
 *       
 * 
 * <p>Java class for BankMailSyncRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankMailSyncRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractSyncRequest">
 *       &lt;sequence>
 *         &lt;element name="INCIMAGES" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="USEHTML" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;choice>
 *           &lt;element name="BANKACCTFROM" type="{http://ofx.net/types/2003/04}BankAccount"/>
 *           &lt;element name="CCACCTFROM" type="{http://ofx.net/types/2003/04}CreditCardAccount"/>
 *         &lt;/choice>
 *         &lt;element name="BANKMAILTRNRQ" type="{http://ofx.net/types/2003/04}BankMailTransactionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankMailSyncRequest", propOrder = {
    "incimages",
    "usehtml",
    "bankacctfrom",
    "ccacctfrom",
    "bankmailtrnrq"
})
public class BankMailSyncRequest
    extends AbstractSyncRequest
{

    @XmlElement(name = "INCIMAGES", required = true)
    protected BooleanType incimages;
    @XmlElement(name = "USEHTML", required = true)
    protected BooleanType usehtml;
    @XmlElement(name = "BANKACCTFROM")
    protected BankAccount bankacctfrom;
    @XmlElement(name = "CCACCTFROM")
    protected CreditCardAccount ccacctfrom;
    @XmlElement(name = "BANKMAILTRNRQ")
    protected List<BankMailTransactionRequest> bankmailtrnrq;

    /**
     * Gets the value of the incimages property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCIMAGES() {
        return incimages;
    }

    /**
     * Sets the value of the incimages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCIMAGES(BooleanType value) {
        this.incimages = value;
    }

    /**
     * Gets the value of the usehtml property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getUSEHTML() {
        return usehtml;
    }

    /**
     * Sets the value of the usehtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setUSEHTML(BooleanType value) {
        this.usehtml = value;
    }

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
     * Gets the value of the ccacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardAccount }
     *     
     */
    public CreditCardAccount getCCACCTFROM() {
        return ccacctfrom;
    }

    /**
     * Sets the value of the ccacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardAccount }
     *     
     */
    public void setCCACCTFROM(CreditCardAccount value) {
        this.ccacctfrom = value;
    }

    /**
     * Gets the value of the bankmailtrnrq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankmailtrnrq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBANKMAILTRNRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankMailTransactionRequest }
     * 
     * 
     */
    public List<BankMailTransactionRequest> getBANKMAILTRNRQ() {
        if (bankmailtrnrq == null) {
            bankmailtrnrq = new ArrayList<BankMailTransactionRequest>();
        }
        return this.bankmailtrnrq;
    }

}
