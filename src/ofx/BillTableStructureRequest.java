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
 *         The OFX element "BILLTBLSTRUCTRQ" is of type "BillTableStructureRequest"
 *       
 * 
 * <p>Java class for BillTableStructureRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillTableStructureRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLID" type="{http://ofx.net/types/2003/04}IdType"/>
 *         &lt;element name="BILLDETAILTABLETYPE" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillTableStructureRequest", propOrder = {
    "billid",
    "billdetailtabletype"
})
public class BillTableStructureRequest {

    @XmlElement(name = "BILLID", required = true)
    protected String billid;
    @XmlElement(name = "BILLDETAILTABLETYPE", required = true)
    protected String billdetailtabletype;

    /**
     * Gets the value of the billid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLID() {
        return billid;
    }

    /**
     * Sets the value of the billid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLID(String value) {
        this.billid = value;
    }

    /**
     * Gets the value of the billdetailtabletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLDETAILTABLETYPE() {
        return billdetailtabletype;
    }

    /**
     * Sets the value of the billdetailtabletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLDETAILTABLETYPE(String value) {
        this.billdetailtabletype = value;
    }

}
