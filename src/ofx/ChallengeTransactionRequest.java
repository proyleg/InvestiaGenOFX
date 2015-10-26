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
 *         The OFX element "CHALLENGETRNRQ" is of type "ChallengeTransactionRequest"
 *       
 * 
 * <p>Java class for ChallengeTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChallengeTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="CHALLENGERQ" type="{http://ofx.net/types/2003/04}ChallengeRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeTransactionRequest", propOrder = {
    "challengerq"
})
public class ChallengeTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "CHALLENGERQ", required = true)
    protected ChallengeRequest challengerq;

    /**
     * Gets the value of the challengerq property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeRequest }
     *     
     */
    public ChallengeRequest getCHALLENGERQ() {
        return challengerq;
    }

    /**
     * Sets the value of the challengerq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeRequest }
     *     
     */
    public void setCHALLENGERQ(ChallengeRequest value) {
        this.challengerq = value;
    }

}
