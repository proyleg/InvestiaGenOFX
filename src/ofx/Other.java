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
 *         The OFX element "OTHER" is of type "Other"
 *       
 * 
 * <p>Java class for Other complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Other">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OTHERDESC" type="{http://ofx.net/types/2003/04}GenericDescriptionType"/>
 *         &lt;element name="OTHERAMOUNT" type="{http://ofx.net/types/2003/04}AmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Other", propOrder = {
    "otherdesc",
    "otheramount"
})
public class Other {

    @XmlElement(name = "OTHERDESC", required = true)
    protected String otherdesc;
    @XmlElement(name = "OTHERAMOUNT", required = true)
    protected String otheramount;

    /**
     * Gets the value of the otherdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERDESC() {
        return otherdesc;
    }

    /**
     * Sets the value of the otherdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERDESC(String value) {
        this.otherdesc = value;
    }

    /**
     * Gets the value of the otheramount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERAMOUNT() {
        return otheramount;
    }

    /**
     * Sets the value of the otheramount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERAMOUNT(String value) {
        this.otheramount = value;
    }

}
