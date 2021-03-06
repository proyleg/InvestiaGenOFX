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
 *         The OFX element "SECLISTMSGSRSV1" is of type "SecurityListResponseMessageSetV1"
 *       
 * 
 * <p>Java class for SecurityListResponseMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityListResponseMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractResponseMessageSet">
 *       &lt;sequence>
 *         &lt;element name="SECLISTTRNRS" type="{http://ofx.net/types/2003/04}SecurityListTransactionResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SECLIST" type="{http://ofx.net/types/2003/04}SecurityList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityListResponseMessageSetV1", propOrder = {
    "seclisttrnrs",
    "seclist"
})
public class SecurityListResponseMessageSetV1
    extends AbstractResponseMessageSet
{

    @XmlElement(name = "SECLISTTRNRS")
    protected List<SecurityListTransactionResponse> seclisttrnrs;
    @XmlElement(name = "SECLIST")
    protected SecurityList seclist;

    /**
     * Gets the value of the seclisttrnrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seclisttrnrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECLISTTRNRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityListTransactionResponse }
     * 
     * 
     */
    public List<SecurityListTransactionResponse> getSECLISTTRNRS() {
        if (seclisttrnrs == null) {
            seclisttrnrs = new ArrayList<SecurityListTransactionResponse>();
        }
        return this.seclisttrnrs;
    }

    /**
     * Gets the value of the seclist property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityList }
     *     
     */
    public SecurityList getSECLIST() {
        return seclist;
    }

    /**
     * Sets the value of the seclist property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityList }
     *     
     */
    public void setSECLIST(SecurityList value) {
        this.seclist = value;
    }

}
