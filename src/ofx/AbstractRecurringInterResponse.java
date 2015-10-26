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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractRecurringInterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRecurringInterResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECSRVRTID" type="{http://ofx.net/types/2003/04}ServerIdType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRecurringInterResponse", propOrder = {
    "recsrvrtid"
})
@XmlSeeAlso({
    RecurringInterResponse.class,
    RecurringInterModResponse.class,
    RecurringInterCancellationResponse.class
})
public abstract class AbstractRecurringInterResponse {

    @XmlElement(name = "RECSRVRTID", required = true)
    protected String recsrvrtid;

    /**
     * Gets the value of the recsrvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECSRVRTID() {
        return recsrvrtid;
    }

    /**
     * Sets the value of the recsrvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECSRVRTID(String value) {
        this.recsrvrtid = value;
    }

}
