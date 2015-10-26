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
 *         The OFX element "EMAILPROF" is of type "EmailProfile"
 *       
 * 
 * <p>Java class for EmailProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CANEMAIL" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="CANNOTIFY" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailProfile", propOrder = {
    "canemail",
    "cannotify"
})
public class EmailProfile {

    @XmlElement(name = "CANEMAIL", required = true)
    protected BooleanType canemail;
    @XmlElement(name = "CANNOTIFY", required = true)
    protected BooleanType cannotify;

    /**
     * Gets the value of the canemail property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getCANEMAIL() {
        return canemail;
    }

    /**
     * Sets the value of the canemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setCANEMAIL(BooleanType value) {
        this.canemail = value;
    }

    /**
     * Gets the value of the cannotify property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getCANNOTIFY() {
        return cannotify;
    }

    /**
     * Sets the value of the cannotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setCANNOTIFY(BooleanType value) {
        this.cannotify = value;
    }

}
