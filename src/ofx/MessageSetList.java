//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "MSGSETLIST" is of type "MessageSetList"
 *       
 * 
 * <p>Java class for MessageSetList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageSetList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;choice>
 *             &lt;sequence>
 *               &lt;element name="SIGNONMSGSET" type="{http://ofx.net/types/2003/04}SignonMessageSet"/>
 *               &lt;sequence maxOccurs="unbounded">
 *                 &lt;group ref="{http://ofx.net/types/2003/04}MessageSetMacro"/>
 *               &lt;/sequence>
 *               &lt;element name="PROFMSGSET" type="{http://ofx.net/types/2003/04}ProfileMessageSet"/>
 *             &lt;/sequence>
 *             &lt;sequence>
 *               &lt;element name="PROFMSGSET" type="{http://ofx.net/types/2003/04}ProfileMessageSet"/>
 *               &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                 &lt;group ref="{http://ofx.net/types/2003/04}MessageSetMacro"/>
 *               &lt;/sequence>
 *               &lt;element name="SIGNONMSGSET" type="{http://ofx.net/types/2003/04}SignonMessageSet"/>
 *             &lt;/sequence>
 *           &lt;/choice>
 *           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *             &lt;group ref="{http://ofx.net/types/2003/04}MessageSetMacro"/>
 *           &lt;/sequence>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;sequence maxOccurs="unbounded">
 *             &lt;group ref="{http://ofx.net/types/2003/04}MessageSetMacro"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;choice>
 *               &lt;element name="SIGNONMSGSET" type="{http://ofx.net/types/2003/04}SignonMessageSet"/>
 *               &lt;element name="PROFMSGSET" type="{http://ofx.net/types/2003/04}ProfileMessageSet"/>
 *             &lt;/choice>
 *             &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *               &lt;group ref="{http://ofx.net/types/2003/04}MessageSetMacro"/>
 *             &lt;/sequence>
 *             &lt;choice>
 *               &lt;element name="PROFMSGSET" type="{http://ofx.net/types/2003/04}ProfileMessageSet"/>
 *               &lt;element name="SIGNONMSGSET" type="{http://ofx.net/types/2003/04}SignonMessageSet"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *             &lt;group ref="{http://ofx.net/types/2003/04}MessageSetMacro"/>
 *           &lt;/sequence>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSetList", propOrder = {
    "content"
})
public class MessageSetList {

    @XmlElementRefs({
        @XmlElementRef(name = "PRESDIRMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SECLISTMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRESDLVMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INVSTMTMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INTERXFERMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EMAILMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BILLPAYMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BANKMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TAX1098MSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TAX1099MSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SIGNONMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CREDITCARDMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROFMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "WIREXFERMSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TAXW2MSGSET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SIGNUPMSGSET", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends AbstractMessageSet>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "PROFMSGSET" is used by two different parts of a schema. See: 
     * line 686 of file:/C:/Users/pierrero/workspace/OFXGeneration/OFX%202.0.3%20Schema/OFX_Profile.xsd
     * line 683 of file:/C:/Users/pierrero/workspace/OFXGeneration/OFX%202.0.3%20Schema/OFX_Profile.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PresentmentDirMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityListMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link PresentmentDlvMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link InvestmentStatementMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link InterTransferMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link EmailMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link BillPayMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link BankMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link Tax1098MessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link Tax1099MessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link SignonMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditcardMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link ProfileMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link WireTransferMessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxW2MessageSet }{@code >}
     * {@link JAXBElement }{@code <}{@link SignupMessageSet }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractMessageSet>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends AbstractMessageSet>>();
        }
        return this.content;
    }

}
