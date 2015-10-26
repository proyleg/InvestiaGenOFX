//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "PROFMSGSRQV1" is of type "ProfileRequestMessageSetV1"
 *       
 * 
 * <p>Java class for ProfileRequestMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileRequestMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractRequestMessageSet">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="PROFTRNRQ" type="{http://ofx.net/types/2003/04}ProfileTransactionRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileRequestMessageSetV1", propOrder = {
    "proftrnrq"
})
public class ProfileRequestMessageSetV1
    extends AbstractRequestMessageSet
{

    @XmlElement(name = "PROFTRNRQ", required = true)
    protected List<ProfileTransactionRequest> proftrnrq;

    /**
     * Gets the value of the proftrnrq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proftrnrq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROFTRNRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileTransactionRequest }
     * 
     * 
     */
    public List<ProfileTransactionRequest> getPROFTRNRQ() {
        if (proftrnrq == null) {
            proftrnrq = new ArrayList<ProfileTransactionRequest>();
        }
        return this.proftrnrq;
    }

}