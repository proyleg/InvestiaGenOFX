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
 *         The OFX element "PRESLISTTRNRQ" is of type "PresentmentListTransactionRequest"
 *       
 * 
 * <p>Java class for PresentmentListTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentListTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="USERID" type="{http://ofx.net/types/2003/04}IdType"/>
 *           &lt;element name="GROUPID" type="{http://ofx.net/types/2003/04}IdType"/>
 *         &lt;/choice>
 *         &lt;element name="PRESLISTRQ" type="{http://ofx.net/types/2003/04}PresentmentListRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentListTransactionRequest", propOrder = {
    "userid",
    "groupid",
    "preslistrq"
})
public class PresentmentListTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "USERID")
    protected String userid;
    @XmlElement(name = "GROUPID")
    protected String groupid;
    @XmlElement(name = "PRESLISTRQ", required = true)
    protected PresentmentListRequest preslistrq;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the groupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPID() {
        return groupid;
    }

    /**
     * Sets the value of the groupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPID(String value) {
        this.groupid = value;
    }

    /**
     * Gets the value of the preslistrq property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentListRequest }
     *     
     */
    public PresentmentListRequest getPRESLISTRQ() {
        return preslistrq;
    }

    /**
     * Sets the value of the preslistrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentListRequest }
     *     
     */
    public void setPRESLISTRQ(PresentmentListRequest value) {
        this.preslistrq = value;
    }

}
