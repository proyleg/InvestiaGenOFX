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
 *         The OFX element "EXTDBINFO_V100" is of type "ExtendedBInfo_V100"
 *       
 * 
 * <p>Java class for ExtendedBInfo_V100 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedBInfo_V100">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROCDET_V100" type="{http://ofx.net/types/2003/04}ProceedDescription_V100" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TEINTEREST" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="PABINTEREST" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="TEINTDIVIDEND" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="PABDIVIDEND" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedBInfo_V100", propOrder = {
    "procdetv100",
    "teinterest",
    "pabinterest",
    "teintdividend",
    "pabdividend"
})
public class ExtendedBInfoV100 {

    @XmlElement(name = "PROCDET_V100")
    protected List<ProceedDescriptionV100> procdetv100;
    @XmlElement(name = "TEINTEREST")
    protected String teinterest;
    @XmlElement(name = "PABINTEREST")
    protected String pabinterest;
    @XmlElement(name = "TEINTDIVIDEND")
    protected String teintdividend;
    @XmlElement(name = "PABDIVIDEND")
    protected String pabdividend;

    /**
     * Gets the value of the procdetv100 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procdetv100 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROCDETV100().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProceedDescriptionV100 }
     * 
     * 
     */
    public List<ProceedDescriptionV100> getPROCDETV100() {
        if (procdetv100 == null) {
            procdetv100 = new ArrayList<ProceedDescriptionV100>();
        }
        return this.procdetv100;
    }

    /**
     * Gets the value of the teinterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEINTEREST() {
        return teinterest;
    }

    /**
     * Sets the value of the teinterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEINTEREST(String value) {
        this.teinterest = value;
    }

    /**
     * Gets the value of the pabinterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPABINTEREST() {
        return pabinterest;
    }

    /**
     * Sets the value of the pabinterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPABINTEREST(String value) {
        this.pabinterest = value;
    }

    /**
     * Gets the value of the teintdividend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEINTDIVIDEND() {
        return teintdividend;
    }

    /**
     * Sets the value of the teintdividend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEINTDIVIDEND(String value) {
        this.teintdividend = value;
    }

    /**
     * Gets the value of the pabdividend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPABDIVIDEND() {
        return pabdividend;
    }

    /**
     * Sets the value of the pabdividend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPABDIVIDEND(String value) {
        this.pabdividend = value;
    }

}
