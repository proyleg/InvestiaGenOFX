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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "ACCTINFO" is of type "AccountInfo"
 *       
 * 
 * <p>Java class for AccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESC" type="{http://ofx.net/types/2003/04}ShortMessageType" minOccurs="0"/>
 *         &lt;element name="PHONE" type="{http://ofx.net/types/2003/04}PhoneType" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;choice>
 *             &lt;element name="BANKACCTINFO" type="{http://ofx.net/types/2003/04}BankAccountInfo"/>
 *             &lt;element name="CCACCTINFO" type="{http://ofx.net/types/2003/04}CreditCardAccountInfo"/>
 *             &lt;element name="BPACCTINFO" type="{http://ofx.net/types/2003/04}BillPaymentAccountInfo"/>
 *             &lt;element name="INVACCTINFO" type="{http://ofx.net/types/2003/04}InvestmentAccountInfo"/>
 *             &lt;element name="PRESACCTINFO" type="{http://ofx.net/types/2003/04}PresentmentAccountInfo"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfo", propOrder = {
    "desc",
    "phone",
    "bankacctinfoOrCCACCTINFOOrBPACCTINFO"
})
public class AccountInfo {

    @XmlElement(name = "DESC")
    protected String desc;
    @XmlElement(name = "PHONE")
    protected String phone;
    @XmlElements({
        @XmlElement(name = "BANKACCTINFO", type = BankAccountInfo.class),
        @XmlElement(name = "CCACCTINFO", type = CreditCardAccountInfo.class),
        @XmlElement(name = "BPACCTINFO", type = BillPaymentAccountInfo.class),
        @XmlElement(name = "INVACCTINFO", type = InvestmentAccountInfo.class),
        @XmlElement(name = "PRESACCTINFO", type = PresentmentAccountInfo.class)
    })
    protected List<AbstractAccountInfo> bankacctinfoOrCCACCTINFOOrBPACCTINFO;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESC(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONE() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONE(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the bankacctinfoOrCCACCTINFOOrBPACCTINFO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankacctinfoOrCCACCTINFOOrBPACCTINFO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBANKACCTINFOOrCCACCTINFOOrBPACCTINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAccountInfo }
     * {@link CreditCardAccountInfo }
     * {@link BillPaymentAccountInfo }
     * {@link InvestmentAccountInfo }
     * {@link PresentmentAccountInfo }
     * 
     * 
     */
    public List<AbstractAccountInfo> getBANKACCTINFOOrCCACCTINFOOrBPACCTINFO() {
        if (bankacctinfoOrCCACCTINFOOrBPACCTINFO == null) {
            bankacctinfoOrCCACCTINFOOrBPACCTINFO = new ArrayList<AbstractAccountInfo>();
        }
        return this.bankacctinfoOrCCACCTINFOOrBPACCTINFO;
    }

}
