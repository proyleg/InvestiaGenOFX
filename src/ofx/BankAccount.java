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
 *         The OFX elements BANKACCTFROM and BANKACCTTO are of type "BankAccount"
 *       
 * 
 * <p>Java class for BankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractAccount">
 *       &lt;sequence>
 *         &lt;element name="BANKID" type="{http://ofx.net/types/2003/04}BankIdType"/>
 *         &lt;element name="BRANCHID" type="{http://ofx.net/types/2003/04}AccountIdType" minOccurs="0"/>
 *         &lt;element name="ACCTID" type="{http://ofx.net/types/2003/04}AccountIdType"/>
 *         &lt;element name="ACCTTYPE" type="{http://ofx.net/types/2003/04}AccountEnum"/>
 *         &lt;element name="ACCTKEY" type="{http://ofx.net/types/2003/04}AccountIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccount", propOrder = {
    "bankid",
    "branchid",
    "acctid",
    "accttype",
    "acctkey"
})
public class BankAccount
    extends AbstractAccount
{

    @XmlElement(name = "BANKID", required = true)
    protected String bankid;
    @XmlElement(name = "BRANCHID")
    protected String branchid;
    @XmlElement(name = "ACCTID", required = true)
    protected String acctid;
    @XmlElement(name = "ACCTTYPE", required = true)
    protected AccountEnum accttype;
    @XmlElement(name = "ACCTKEY")
    protected String acctkey;

    /**
     * Gets the value of the bankid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKID() {
        return bankid;
    }

    /**
     * Sets the value of the bankid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKID(String value) {
        this.bankid = value;
    }

    /**
     * Gets the value of the branchid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHID() {
        return branchid;
    }

    /**
     * Sets the value of the branchid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHID(String value) {
        this.branchid = value;
    }

    /**
     * Gets the value of the acctid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTID() {
        return acctid;
    }

    /**
     * Sets the value of the acctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTID(String value) {
        this.acctid = value;
    }

    /**
     * Gets the value of the accttype property.
     * 
     * @return
     *     possible object is
     *     {@link AccountEnum }
     *     
     */
    public AccountEnum getACCTTYPE() {
        return accttype;
    }

    /**
     * Sets the value of the accttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountEnum }
     *     
     */
    public void setACCTTYPE(AccountEnum value) {
        this.accttype = value;
    }

    /**
     * Gets the value of the acctkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTKEY() {
        return acctkey;
    }

    /**
     * Sets the value of the acctkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTKEY(String value) {
        this.acctkey = value;
    }

}
