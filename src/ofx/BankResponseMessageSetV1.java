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
 *         The OFX element "BANKMSGSRSV1" is of type "BankResponseMessageSetV1"
 *       
 * 
 * <p>Java class for BankResponseMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankResponseMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractResponseMessageSet">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="STMTTRNRS" type="{http://ofx.net/types/2003/04}StatementTransactionResponse"/>
 *         &lt;element name="STMTENDTRNRS" type="{http://ofx.net/types/2003/04}StatementEndTransactionResponse"/>
 *         &lt;element name="INTRATRNRS" type="{http://ofx.net/types/2003/04}IntraTransactionResponse"/>
 *         &lt;element name="RECINTRATRNRS" type="{http://ofx.net/types/2003/04}RecurringIntraTransactionResponse"/>
 *         &lt;element name="STPCHKTRNRS" type="{http://ofx.net/types/2003/04}StopCheckTransactionResponse"/>
 *         &lt;element name="BANKMAILTRNRS" type="{http://ofx.net/types/2003/04}BankMailTransactionResponse"/>
 *         &lt;element name="BANKMAILSYNCRS" type="{http://ofx.net/types/2003/04}BankMailSyncResponse"/>
 *         &lt;element name="STPCHKSYNCRS" type="{http://ofx.net/types/2003/04}StopCheckSyncResponse"/>
 *         &lt;element name="INTRASYNCRS" type="{http://ofx.net/types/2003/04}IntraSyncResponse"/>
 *         &lt;element name="RECINTRASYNCRS" type="{http://ofx.net/types/2003/04}RecurringIntraSyncResponse"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankResponseMessageSetV1", propOrder = {
    "stmttrnrsOrSTMTENDTRNRSOrINTRATRNRS"
})
public class BankResponseMessageSetV1
    extends AbstractResponseMessageSet
{

    @XmlElements({
        @XmlElement(name = "STMTTRNRS", type = StatementTransactionResponse.class),
        @XmlElement(name = "STMTENDTRNRS", type = StatementEndTransactionResponse.class),
        @XmlElement(name = "INTRATRNRS", type = IntraTransactionResponse.class),
        @XmlElement(name = "RECINTRATRNRS", type = RecurringIntraTransactionResponse.class),
        @XmlElement(name = "STPCHKTRNRS", type = StopCheckTransactionResponse.class),
        @XmlElement(name = "BANKMAILTRNRS", type = BankMailTransactionResponse.class),
        @XmlElement(name = "BANKMAILSYNCRS", type = BankMailSyncResponse.class),
        @XmlElement(name = "STPCHKSYNCRS", type = StopCheckSyncResponse.class),
        @XmlElement(name = "INTRASYNCRS", type = IntraSyncResponse.class),
        @XmlElement(name = "RECINTRASYNCRS", type = RecurringIntraSyncResponse.class)
    })
    protected List<AbstractResponse> stmttrnrsOrSTMTENDTRNRSOrINTRATRNRS;

    /**
     * Gets the value of the stmttrnrsOrSTMTENDTRNRSOrINTRATRNRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stmttrnrsOrSTMTENDTRNRSOrINTRATRNRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTMTTRNRSOrSTMTENDTRNRSOrINTRATRNRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementTransactionResponse }
     * {@link StatementEndTransactionResponse }
     * {@link IntraTransactionResponse }
     * {@link RecurringIntraTransactionResponse }
     * {@link StopCheckTransactionResponse }
     * {@link BankMailTransactionResponse }
     * {@link BankMailSyncResponse }
     * {@link StopCheckSyncResponse }
     * {@link IntraSyncResponse }
     * {@link RecurringIntraSyncResponse }
     * 
     * 
     */
    public List<AbstractResponse> getSTMTTRNRSOrSTMTENDTRNRSOrINTRATRNRS() {
        if (stmttrnrsOrSTMTENDTRNRSOrINTRATRNRS == null) {
            stmttrnrsOrSTMTENDTRNRSOrINTRATRNRS = new ArrayList<AbstractResponse>();
        }
        return this.stmttrnrsOrSTMTENDTRNRSOrINTRATRNRS;
    }

}
