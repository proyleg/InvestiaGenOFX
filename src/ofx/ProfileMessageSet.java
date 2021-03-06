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
 *         The OFX element "PROFMSGSET" is of type "ProfileMessageSet"
 *       
 * 
 * <p>Java class for ProfileMessageSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileMessageSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractMessageSet">
 *       &lt;sequence>
 *         &lt;element name="PROFMSGSETV1" type="{http://ofx.net/types/2003/04}ProfileMessageSetV1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileMessageSet", propOrder = {
    "profmsgsetv1"
})
public class ProfileMessageSet
    extends AbstractMessageSet
{

    @XmlElement(name = "PROFMSGSETV1", required = true)
    protected ProfileMessageSetV1 profmsgsetv1;

    /**
     * Gets the value of the profmsgsetv1 property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileMessageSetV1 }
     *     
     */
    public ProfileMessageSetV1 getPROFMSGSETV1() {
        return profmsgsetv1;
    }

    /**
     * Sets the value of the profmsgsetv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileMessageSetV1 }
     *     
     */
    public void setPROFMSGSETV1(ProfileMessageSetV1 value) {
        this.profmsgsetv1 = value;
    }

}
