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
 *         The OFX element "MFACHALLENGETRNRQ" is of type "MFAChallengeTransactionRequest"
 *       
 * 
 * <p>Java class for MFAChallengeTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MFAChallengeTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="MFACHALLENGERQ" type="{http://ofx.net/types/2003/04}MFAChallengeRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MFAChallengeTransactionRequest", propOrder = {
    "mfachallengerq"
})
public class MFAChallengeTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "MFACHALLENGERQ", required = true)
    protected MFAChallengeRequest mfachallengerq;

    /**
     * Gets the value of the mfachallengerq property.
     * 
     * @return
     *     possible object is
     *     {@link MFAChallengeRequest }
     *     
     */
    public MFAChallengeRequest getMFACHALLENGERQ() {
        return mfachallengerq;
    }

    /**
     * Sets the value of the mfachallengerq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MFAChallengeRequest }
     *     
     */
    public void setMFACHALLENGERQ(MFAChallengeRequest value) {
        this.mfachallengerq = value;
    }

}
