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
 *         The OFX element "CHKRANGE" is of type "CheckRange"
 *       
 * 
 * <p>Java class for CheckRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractCheckInfo">
 *       &lt;sequence>
 *         &lt;element name="CHKNUMSTART" type="{http://ofx.net/types/2003/04}CheckNumberType"/>
 *         &lt;element name="CHKNUMEND" type="{http://ofx.net/types/2003/04}CheckNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRange", propOrder = {
    "chknumstart",
    "chknumend"
})
public class CheckRange
    extends AbstractCheckInfo
{

    @XmlElement(name = "CHKNUMSTART", required = true)
    protected String chknumstart;
    @XmlElement(name = "CHKNUMEND")
    protected String chknumend;

    /**
     * Gets the value of the chknumstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKNUMSTART() {
        return chknumstart;
    }

    /**
     * Sets the value of the chknumstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKNUMSTART(String value) {
        this.chknumstart = value;
    }

    /**
     * Gets the value of the chknumend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKNUMEND() {
        return chknumend;
    }

    /**
     * Sets the value of the chknumend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKNUMEND(String value) {
        this.chknumend = value;
    }

}
