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
 *         The OFX element "FIPORTION" is of type "FinancialInstitutionPortion"
 *       
 * 
 * <p>Java class for FinancialInstitutionPortion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionPortion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIASSETCLASS" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="PERCENT" type="{http://ofx.net/types/2003/04}RateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionPortion", propOrder = {
    "fiassetclass",
    "percent"
})
public class FinancialInstitutionPortion {

    @XmlElement(name = "FIASSETCLASS", required = true)
    protected String fiassetclass;
    @XmlElement(name = "PERCENT", required = true)
    protected String percent;

    /**
     * Gets the value of the fiassetclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASSETCLASS() {
        return fiassetclass;
    }

    /**
     * Sets the value of the fiassetclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIASSETCLASS(String value) {
        this.fiassetclass = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCENT() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCENT(String value) {
        this.percent = value;
    }

}
