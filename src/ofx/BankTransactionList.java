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
 *         The OFX element "BANKTRANLIST" is of type "BankTransactionList"
 *       
 * 
 * <p>Java class for BankTransactionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankTransactionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTSTART" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="DTEND" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="STMTTRN" type="{http://ofx.net/types/2003/04}StatementTransaction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionList", propOrder = {
    "dtstart",
    "dtend",
    "stmttrn"
})
public class BankTransactionList {

    @XmlElement(name = "DTSTART", required = true)
    protected String dtstart;
    @XmlElement(name = "DTEND", required = true)
    protected String dtend;
    @XmlElement(name = "STMTTRN")
    protected List<StatementTransaction> stmttrn;

    /**
     * Gets the value of the dtstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTSTART() {
        return dtstart;
    }

    /**
     * Sets the value of the dtstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTSTART(String value) {
        this.dtstart = value;
    }

    /**
     * Gets the value of the dtend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEND() {
        return dtend;
    }

    /**
     * Sets the value of the dtend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEND(String value) {
        this.dtend = value;
    }

    /**
     * Gets the value of the stmttrn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stmttrn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTMTTRN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementTransaction }
     * 
     * 
     */
    public List<StatementTransaction> getSTMTTRN() {
        if (stmttrn == null) {
            stmttrn = new ArrayList<StatementTransaction>();
        }
        return this.stmttrn;
    }

}
