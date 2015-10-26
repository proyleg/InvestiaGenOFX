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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "EMAILMSGSRQV1" is of type "EmailRequestMessageSetV1"
 *       
 * 
 * <p>Java class for EmailRequestMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailRequestMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractRequestMessageSet">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="MAILTRNRQ" type="{http://ofx.net/types/2003/04}MailTransactionRequest"/>
 *         &lt;element name="MAILSYNCRQ" type="{http://ofx.net/types/2003/04}MailSyncRequest"/>
 *         &lt;element name="GETMIMETRNRQ" type="{http://ofx.net/types/2003/04}GetMimeTransactionRequest"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailRequestMessageSetV1", propOrder = {
    "mailtrnrqOrMAILSYNCRQOrGETMIMETRNRQ"
})
public class EmailRequestMessageSetV1
    extends AbstractRequestMessageSet
{

    @XmlElements({
        @XmlElement(name = "MAILTRNRQ", type = MailTransactionRequest.class),
        @XmlElement(name = "MAILSYNCRQ", type = MailSyncRequest.class),
        @XmlElement(name = "GETMIMETRNRQ", type = GetMimeTransactionRequest.class)
    })
    protected List<AbstractRequest> mailtrnrqOrMAILSYNCRQOrGETMIMETRNRQ;

    /**
     * Gets the value of the mailtrnrqOrMAILSYNCRQOrGETMIMETRNRQ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailtrnrqOrMAILSYNCRQOrGETMIMETRNRQ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAILTRNRQOrMAILSYNCRQOrGETMIMETRNRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailTransactionRequest }
     * {@link MailSyncRequest }
     * {@link GetMimeTransactionRequest }
     * 
     * 
     */
    public List<AbstractRequest> getMAILTRNRQOrMAILSYNCRQOrGETMIMETRNRQ() {
        if (mailtrnrqOrMAILSYNCRQOrGETMIMETRNRQ == null) {
            mailtrnrqOrMAILSYNCRQOrGETMIMETRNRQ = new ArrayList<AbstractRequest>();
        }
        return this.mailtrnrqOrMAILSYNCRQOrGETMIMETRNRQ;
    }

}
