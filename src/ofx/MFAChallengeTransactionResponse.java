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
 *         The OFX element "MFACHALLENGETRNRS" is of type "MFAChallengeTransactionResponse"
 *       
 * 
 * <p>Java class for MFAChallengeTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MFAChallengeTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionResponse">
 *       &lt;sequence>
 *         &lt;element name="MFACHALLENGERS" type="{http://ofx.net/types/2003/04}MFAChallengeResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MFAChallengeTransactionResponse", propOrder = {
    "mfachallengers"
})
public class MFAChallengeTransactionResponse
    extends AbstractTransactionResponse
{

    @XmlElement(name = "MFACHALLENGERS")
    protected MFAChallengeResponse mfachallengers;

    /**
     * Gets the value of the mfachallengers property.
     * 
     * @return
     *     possible object is
     *     {@link MFAChallengeResponse }
     *     
     */
    public MFAChallengeResponse getMFACHALLENGERS() {
        return mfachallengers;
    }

    /**
     * Sets the value of the mfachallengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MFAChallengeResponse }
     *     
     */
    public void setMFACHALLENGERS(MFAChallengeResponse value) {
        this.mfachallengers = value;
    }

}
