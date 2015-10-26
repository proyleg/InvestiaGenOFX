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
 *         The OFX element "PRESDLVPROF" is of type "PresentmentDlvProfile"
 *       
 * 
 * <p>Java class for PresentmentDlvProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentDlvProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CANSUPPORTGROUPID" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="PROCDAYSOFF" type="{http://ofx.net/types/2003/04}DaysEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CANSUPPORTIMAGES" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="PROCENDTM" type="{http://ofx.net/types/2003/04}TimeType"/>
 *         &lt;element name="CANUPDATEPRESNAMEADDRESS" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentDlvProfile", propOrder = {
    "cansupportgroupid",
    "procdaysoff",
    "cansupportimages",
    "procendtm",
    "canupdatepresnameaddress"
})
public class PresentmentDlvProfile {

    @XmlElement(name = "CANSUPPORTGROUPID", required = true)
    protected BooleanType cansupportgroupid;
    @XmlElement(name = "PROCDAYSOFF")
    protected List<DaysEnum> procdaysoff;
    @XmlElement(name = "CANSUPPORTIMAGES", required = true)
    protected BooleanType cansupportimages;
    @XmlElement(name = "PROCENDTM", required = true)
    protected String procendtm;
    @XmlElement(name = "CANUPDATEPRESNAMEADDRESS", required = true)
    protected BooleanType canupdatepresnameaddress;

    /**
     * Gets the value of the cansupportgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getCANSUPPORTGROUPID() {
        return cansupportgroupid;
    }

    /**
     * Sets the value of the cansupportgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setCANSUPPORTGROUPID(BooleanType value) {
        this.cansupportgroupid = value;
    }

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
     * Gets the value of the cansupportimages property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getCANSUPPORTIMAGES() {
        return cansupportimages;
    }

    /**
     * Sets the value of the cansupportimages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setCANSUPPORTIMAGES(BooleanType value) {
        this.cansupportimages = value;
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
     * Gets the value of the canupdatepresnameaddress property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getCANUPDATEPRESNAMEADDRESS() {
        return canupdatepresnameaddress;
    }

    /**
     * Sets the value of the canupdatepresnameaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setCANUPDATEPRESNAMEADDRESS(BooleanType value) {
        this.canupdatepresnameaddress = value;
    }

}
