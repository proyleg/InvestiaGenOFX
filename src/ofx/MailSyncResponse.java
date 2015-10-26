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
 *         The OFX element "MAILSYNCRS" is of type "MailSyncResponse"
 *       
 * 
 * <p>Java class for MailSyncResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailSyncResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractSyncResponse">
 *       &lt;sequence>
 *         &lt;element name="MAILTRNRS" type="{http://ofx.net/types/2003/04}MailTransactionResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailSyncResponse", propOrder = {
    "mailtrnrs"
})
public class MailSyncResponse
    extends AbstractSyncResponse
{

    @XmlElement(name = "MAILTRNRS")
    protected List<MailTransactionResponse> mailtrnrs;

    /**
     * Gets the value of the mailtrnrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailtrnrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAILTRNRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailTransactionResponse }
     * 
     * 
     */
    public List<MailTransactionResponse> getMAILTRNRS() {
        if (mailtrnrs == null) {
            mailtrnrs = new ArrayList<MailTransactionResponse>();
        }
        return this.mailtrnrs;
    }

}
