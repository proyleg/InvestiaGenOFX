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
 *         The OFX element "TAXW2_V100" is of type "TaxW2_V100"
 *       
 * 
 * <p>Java class for TaxW2_V100 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxW2_V100">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTaxW2">
 *       &lt;sequence>
 *         &lt;element name="EMPLOYER" type="{http://ofx.net/types/2003/04}Employer"/>
 *         &lt;element name="EMPLOYEE" type="{http://ofx.net/types/2003/04}Employee"/>
 *         &lt;element name="WAGES" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="FEDTAXWH" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="SSWAGES" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="SSTAXWH" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="MEDICAREWAGES" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="MEDICARETAXWH" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="SSTIPS" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="ALLOCATEDTIPS" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="ADVANCEDEIC" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="DEPCAREBENEFIT" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="NONQUALPLAN" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="BENEFITSBOX1" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="CODES" type="{http://ofx.net/types/2003/04}Codes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OTHER" type="{http://ofx.net/types/2003/04}Other" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="STATUTORY" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="DECEASED" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="PENSIONPLAN" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="LEGALREP" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="DEFERREDCOMP" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="STATEINFO" type="{http://ofx.net/types/2003/04}StateInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LOCALINFO" type="{http://ofx.net/types/2003/04}LocalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxW2_V100", propOrder = {
    "employer",
    "employee",
    "wages",
    "fedtaxwh",
    "sswages",
    "sstaxwh",
    "medicarewages",
    "medicaretaxwh",
    "sstips",
    "allocatedtips",
    "advancedeic",
    "depcarebenefit",
    "nonqualplan",
    "benefitsbox1",
    "codes",
    "other",
    "statutory",
    "deceased",
    "pensionplan",
    "legalrep",
    "deferredcomp",
    "stateinfo",
    "localinfo"
})
public class TaxW2V100
    extends AbstractTaxW2
{

    @XmlElement(name = "EMPLOYER", required = true)
    protected Employer employer;
    @XmlElement(name = "EMPLOYEE", required = true)
    protected Employee employee;
    @XmlElement(name = "WAGES")
    protected String wages;
    @XmlElement(name = "FEDTAXWH")
    protected String fedtaxwh;
    @XmlElement(name = "SSWAGES")
    protected String sswages;
    @XmlElement(name = "SSTAXWH")
    protected String sstaxwh;
    @XmlElement(name = "MEDICAREWAGES")
    protected String medicarewages;
    @XmlElement(name = "MEDICARETAXWH")
    protected String medicaretaxwh;
    @XmlElement(name = "SSTIPS")
    protected String sstips;
    @XmlElement(name = "ALLOCATEDTIPS")
    protected String allocatedtips;
    @XmlElement(name = "ADVANCEDEIC")
    protected String advancedeic;
    @XmlElement(name = "DEPCAREBENEFIT")
    protected String depcarebenefit;
    @XmlElement(name = "NONQUALPLAN")
    protected String nonqualplan;
    @XmlElement(name = "BENEFITSBOX1")
    protected String benefitsbox1;
    @XmlElement(name = "CODES")
    protected List<Codes> codes;
    @XmlElement(name = "OTHER")
    protected List<Other> other;
    @XmlElement(name = "STATUTORY")
    protected BooleanType statutory;
    @XmlElement(name = "DECEASED")
    protected BooleanType deceased;
    @XmlElement(name = "PENSIONPLAN")
    protected BooleanType pensionplan;
    @XmlElement(name = "LEGALREP")
    protected BooleanType legalrep;
    @XmlElement(name = "DEFERREDCOMP")
    protected BooleanType deferredcomp;
    @XmlElement(name = "STATEINFO")
    protected List<StateInfo> stateinfo;
    @XmlElement(name = "LOCALINFO")
    protected List<LocalInfo> localinfo;

    /**
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link Employer }
     *     
     */
    public Employer getEMPLOYER() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employer }
     *     
     */
    public void setEMPLOYER(Employer value) {
        this.employer = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEMPLOYEE() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEMPLOYEE(Employee value) {
        this.employee = value;
    }

    /**
     * Gets the value of the wages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAGES() {
        return wages;
    }

    /**
     * Sets the value of the wages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAGES(String value) {
        this.wages = value;
    }

    /**
     * Gets the value of the fedtaxwh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEDTAXWH() {
        return fedtaxwh;
    }

    /**
     * Sets the value of the fedtaxwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEDTAXWH(String value) {
        this.fedtaxwh = value;
    }

    /**
     * Gets the value of the sswages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSWAGES() {
        return sswages;
    }

    /**
     * Sets the value of the sswages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSWAGES(String value) {
        this.sswages = value;
    }

    /**
     * Gets the value of the sstaxwh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSTAXWH() {
        return sstaxwh;
    }

    /**
     * Sets the value of the sstaxwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSTAXWH(String value) {
        this.sstaxwh = value;
    }

    /**
     * Gets the value of the medicarewages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDICAREWAGES() {
        return medicarewages;
    }

    /**
     * Sets the value of the medicarewages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDICAREWAGES(String value) {
        this.medicarewages = value;
    }

    /**
     * Gets the value of the medicaretaxwh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDICARETAXWH() {
        return medicaretaxwh;
    }

    /**
     * Sets the value of the medicaretaxwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDICARETAXWH(String value) {
        this.medicaretaxwh = value;
    }

    /**
     * Gets the value of the sstips property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSTIPS() {
        return sstips;
    }

    /**
     * Sets the value of the sstips property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSTIPS(String value) {
        this.sstips = value;
    }

    /**
     * Gets the value of the allocatedtips property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOCATEDTIPS() {
        return allocatedtips;
    }

    /**
     * Sets the value of the allocatedtips property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOCATEDTIPS(String value) {
        this.allocatedtips = value;
    }

    /**
     * Gets the value of the advancedeic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADVANCEDEIC() {
        return advancedeic;
    }

    /**
     * Sets the value of the advancedeic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADVANCEDEIC(String value) {
        this.advancedeic = value;
    }

    /**
     * Gets the value of the depcarebenefit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPCAREBENEFIT() {
        return depcarebenefit;
    }

    /**
     * Sets the value of the depcarebenefit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPCAREBENEFIT(String value) {
        this.depcarebenefit = value;
    }

    /**
     * Gets the value of the nonqualplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNONQUALPLAN() {
        return nonqualplan;
    }

    /**
     * Sets the value of the nonqualplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNONQUALPLAN(String value) {
        this.nonqualplan = value;
    }

    /**
     * Gets the value of the benefitsbox1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFITSBOX1() {
        return benefitsbox1;
    }

    /**
     * Sets the value of the benefitsbox1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFITSBOX1(String value) {
        this.benefitsbox1 = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCODES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Codes }
     * 
     * 
     */
    public List<Codes> getCODES() {
        if (codes == null) {
            codes = new ArrayList<Codes>();
        }
        return this.codes;
    }

    /**
     * Gets the value of the other property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the other property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOTHER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Other }
     * 
     * 
     */
    public List<Other> getOTHER() {
        if (other == null) {
            other = new ArrayList<Other>();
        }
        return this.other;
    }

    /**
     * Gets the value of the statutory property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getSTATUTORY() {
        return statutory;
    }

    /**
     * Sets the value of the statutory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setSTATUTORY(BooleanType value) {
        this.statutory = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getDECEASED() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setDECEASED(BooleanType value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the pensionplan property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getPENSIONPLAN() {
        return pensionplan;
    }

    /**
     * Sets the value of the pensionplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setPENSIONPLAN(BooleanType value) {
        this.pensionplan = value;
    }

    /**
     * Gets the value of the legalrep property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getLEGALREP() {
        return legalrep;
    }

    /**
     * Sets the value of the legalrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setLEGALREP(BooleanType value) {
        this.legalrep = value;
    }

    /**
     * Gets the value of the deferredcomp property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getDEFERREDCOMP() {
        return deferredcomp;
    }

    /**
     * Sets the value of the deferredcomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setDEFERREDCOMP(BooleanType value) {
        this.deferredcomp = value;
    }

    /**
     * Gets the value of the stateinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTATEINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateInfo }
     * 
     * 
     */
    public List<StateInfo> getSTATEINFO() {
        if (stateinfo == null) {
            stateinfo = new ArrayList<StateInfo>();
        }
        return this.stateinfo;
    }

    /**
     * Gets the value of the localinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLOCALINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalInfo }
     * 
     * 
     */
    public List<LocalInfo> getLOCALINFO() {
        if (localinfo == null) {
            localinfo = new ArrayList<LocalInfo>();
        }
        return this.localinfo;
    }

}
