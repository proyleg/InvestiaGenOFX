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
 *         The OFX element "EMAILMSGSET" is of type "EmailMessageSet"
 *       
 * 
 * <p>Java class for EmailMessageSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailMessageSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractMessageSet">
 *       &lt;sequence>
 *         &lt;element name="EMAILMSGSETV1" type="{http://ofx.net/types/2003/04}EmailMessageSetV1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailMessageSet", propOrder = {
    "emailmsgsetv1"
})
public class EmailMessageSet
    extends AbstractMessageSet
{

    @XmlElement(name = "EMAILMSGSETV1", required = true)
    protected EmailMessageSetV1 emailmsgsetv1;

    /**
     * Gets the value of the emailmsgsetv1 property.
     * 
     * @return
     *     possible object is
     *     {@link EmailMessageSetV1 }
     *     
     */
    public EmailMessageSetV1 getEMAILMSGSETV1() {
        return emailmsgsetv1;
    }

    /**
     * Sets the value of the emailmsgsetv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailMessageSetV1 }
     *     
     */
    public void setEMAILMSGSETV1(EmailMessageSetV1 value) {
        this.emailmsgsetv1 = value;
    }

}
