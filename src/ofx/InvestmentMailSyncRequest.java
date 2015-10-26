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
 *         The OFX element "INVMAILSYNCRQ" is of type "InvestmentMailSyncRequest"
 *       
 * 
 * <p>Java class for InvestmentMailSyncRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentMailSyncRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractSyncRequest">
 *       &lt;sequence>
 *         &lt;element name="INCIMAGES" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="USEHTML" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="INVACCTFROM" type="{http://ofx.net/types/2003/04}InvestmentAccount"/>
 *         &lt;element name="INVMAILTRNRQ" type="{http://ofx.net/types/2003/04}InvestmentMailTransactionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentMailSyncRequest", propOrder = {
    "incimages",
    "usehtml",
    "invacctfrom",
    "invmailtrnrq"
})
public class InvestmentMailSyncRequest
    extends AbstractSyncRequest
{

    @XmlElement(name = "INCIMAGES", required = true)
    protected BooleanType incimages;
    @XmlElement(name = "USEHTML", required = true)
    protected BooleanType usehtml;
    @XmlElement(name = "INVACCTFROM", required = true)
    protected InvestmentAccount invacctfrom;
    @XmlElement(name = "INVMAILTRNRQ")
    protected List<InvestmentMailTransactionRequest> invmailtrnrq;

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
     * Gets the value of the invacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount }
     *     
     */
    public InvestmentAccount getINVACCTFROM() {
        return invacctfrom;
    }

    /**
     * Sets the value of the invacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount }
     *     
     */
    public void setINVACCTFROM(InvestmentAccount value) {
        this.invacctfrom = value;
    }

    /**
     * Gets the value of the invmailtrnrq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invmailtrnrq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINVMAILTRNRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentMailTransactionRequest }
     * 
     * 
     */
    public List<InvestmentMailTransactionRequest> getINVMAILTRNRQ() {
        if (invmailtrnrq == null) {
            invmailtrnrq = new ArrayList<InvestmentMailTransactionRequest>();
        }
        return this.invmailtrnrq;
    }

}
