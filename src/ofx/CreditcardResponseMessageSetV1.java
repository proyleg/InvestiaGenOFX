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
 *         The OFX element "CREDITCARDMSGSRSV1" is of type "CreditcardResponseMessageSetV1"
 *       
 * 
 * <p>Java class for CreditcardResponseMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditcardResponseMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractResponseMessageSet">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="CCSTMTTRNRS" type="{http://ofx.net/types/2003/04}CreditCardStatementTransactionResponse"/>
 *         &lt;element name="CCSTMTENDTRNRS" type="{http://ofx.net/types/2003/04}CreditCardStatementEndTransactionResponse"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditcardResponseMessageSetV1", propOrder = {
    "ccstmttrnrsOrCCSTMTENDTRNRS"
})
public class CreditcardResponseMessageSetV1
    extends AbstractResponseMessageSet
{

    @XmlElements({
        @XmlElement(name = "CCSTMTTRNRS", type = CreditCardStatementTransactionResponse.class),
        @XmlElement(name = "CCSTMTENDTRNRS", type = CreditCardStatementEndTransactionResponse.class)
    })
    protected List<AbstractTransactionResponse> ccstmttrnrsOrCCSTMTENDTRNRS;

    /**
     * Gets the value of the ccstmttrnrsOrCCSTMTENDTRNRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccstmttrnrsOrCCSTMTENDTRNRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCSTMTTRNRSOrCCSTMTENDTRNRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardStatementTransactionResponse }
     * {@link CreditCardStatementEndTransactionResponse }
     * 
     * 
     */
    public List<AbstractTransactionResponse> getCCSTMTTRNRSOrCCSTMTENDTRNRS() {
        if (ccstmttrnrsOrCCSTMTENDTRNRS == null) {
            ccstmttrnrsOrCCSTMTENDTRNRS = new ArrayList<AbstractTransactionResponse>();
        }
        return this.ccstmttrnrsOrCCSTMTENDTRNRS;
    }

}
