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
 *         The OFX element "EMAILMSGSETV1" is of type "EmailMessageSetV1"
 *       
 * 
 * <p>Java class for EmailMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractMessageSetVersion">
 *       &lt;sequence>
 *         &lt;element name="MAILSUP" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="GETMIMESUP" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailMessageSetV1", propOrder = {
    "mailsup",
    "getmimesup"
})
public class EmailMessageSetV1
    extends AbstractMessageSetVersion
{

    @XmlElement(name = "MAILSUP", required = true)
    protected BooleanType mailsup;
    @XmlElement(name = "GETMIMESUP", required = true)
    protected BooleanType getmimesup;

    /**
     * Gets the value of the mailsup property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getMAILSUP() {
        return mailsup;
    }

    /**
     * Sets the value of the mailsup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setMAILSUP(BooleanType value) {
        this.mailsup = value;
    }

    /**
     * Gets the value of the getmimesup property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getGETMIMESUP() {
        return getmimesup;
    }

    /**
     * Sets the value of the getmimesup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setGETMIMESUP(BooleanType value) {
        this.getmimesup = value;
    }

}
