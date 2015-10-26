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
 *         The OFX element "PRESNOTIFYRS" is of type "PresentmentNotifyResponse"
 *       
 * 
 * <p>Java class for PresentmentNotifyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentNotifyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRESDELIVERYID" type="{http://ofx.net/types/2003/04}PresentmentDeliveryId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentNotifyResponse", propOrder = {
    "presdeliveryid"
})
public class PresentmentNotifyResponse {

    @XmlElement(name = "PRESDELIVERYID", required = true)
    protected PresentmentDeliveryId presdeliveryid;

    /**
     * Gets the value of the presdeliveryid property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentDeliveryId }
     *     
     */
    public PresentmentDeliveryId getPRESDELIVERYID() {
        return presdeliveryid;
    }

    /**
     * Sets the value of the presdeliveryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentDeliveryId }
     *     
     */
    public void setPRESDELIVERYID(PresentmentDeliveryId value) {
        this.presdeliveryid = value;
    }

}
