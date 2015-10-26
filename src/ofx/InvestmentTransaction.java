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
 *         The OFX element "INVTRAN" is of type "InvestmentTransaction"
 *       
 * 
 * <p>Java class for InvestmentTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FITID" type="{http://ofx.net/types/2003/04}FinancialInstitutionTransactionIdType"/>
 *         &lt;element name="SRVRTID" type="{http://ofx.net/types/2003/04}ServerIdType" minOccurs="0"/>
 *         &lt;element name="DTTRADE" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="DTSETTLE" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="REVERSALFITID" type="{http://ofx.net/types/2003/04}FinancialInstitutionTransactionIdType" minOccurs="0"/>
 *         &lt;element name="MEMO" type="{http://ofx.net/types/2003/04}MessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentTransaction", propOrder = {
    "fitid",
    "srvrtid",
    "dttrade",
    "dtsettle",
    "reversalfitid",
    "memo"
})
public class InvestmentTransaction {

    @XmlElement(name = "FITID", required = true)
    protected String fitid;
    @XmlElement(name = "SRVRTID")
    protected String srvrtid;
    @XmlElement(name = "DTTRADE", required = true)
    protected String dttrade;
    @XmlElement(name = "DTSETTLE")
    protected String dtsettle;
    @XmlElement(name = "REVERSALFITID")
    protected String reversalfitid;
    @XmlElement(name = "MEMO")
    protected String memo;

    /**
     * Gets the value of the fitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFITID() {
        return fitid;
    }

    /**
     * Sets the value of the fitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFITID(String value) {
        this.fitid = value;
    }

    /**
     * Gets the value of the srvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVRTID() {
        return srvrtid;
    }

    /**
     * Sets the value of the srvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVRTID(String value) {
        this.srvrtid = value;
    }

    /**
     * Gets the value of the dttrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTTRADE() {
        return dttrade;
    }

    /**
     * Sets the value of the dttrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTTRADE(String value) {
        this.dttrade = value;
    }

    /**
     * Gets the value of the dtsettle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTSETTLE() {
        return dtsettle;
    }

    /**
     * Sets the value of the dtsettle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTSETTLE(String value) {
        this.dtsettle = value;
    }

    /**
     * Gets the value of the reversalfitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVERSALFITID() {
        return reversalfitid;
    }

    /**
     * Sets the value of the reversalfitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVERSALFITID(String value) {
        this.reversalfitid = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMO() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMO(String value) {
        this.memo = value;
    }

}