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
 * 	      The OFX element "PRESCOUNTS" is of type "PresentmentCounts"
 * 	    
 * 
 * <p>Java class for PresentmentCounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentCounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLSTATUSCOUNTS" type="{http://ofx.net/types/2003/04}BillStatusCounts" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BILLPMTSTATUSCOUNTS" type="{http://ofx.net/types/2003/04}BillPaymentstatusCounts" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentCounts", propOrder = {
    "billstatuscounts",
    "billpmtstatuscounts"
})
public class PresentmentCounts {

    @XmlElement(name = "BILLSTATUSCOUNTS")
    protected List<BillStatusCounts> billstatuscounts;
    @XmlElement(name = "BILLPMTSTATUSCOUNTS")
    protected List<BillPaymentstatusCounts> billpmtstatuscounts;

    /**
     * Gets the value of the billstatuscounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billstatuscounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBILLSTATUSCOUNTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillStatusCounts }
     * 
     * 
     */
    public List<BillStatusCounts> getBILLSTATUSCOUNTS() {
        if (billstatuscounts == null) {
            billstatuscounts = new ArrayList<BillStatusCounts>();
        }
        return this.billstatuscounts;
    }

    /**
     * Gets the value of the billpmtstatuscounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billpmtstatuscounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBILLPMTSTATUSCOUNTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillPaymentstatusCounts }
     * 
     * 
     */
    public List<BillPaymentstatusCounts> getBILLPMTSTATUSCOUNTS() {
        if (billpmtstatuscounts == null) {
            billpmtstatuscounts = new ArrayList<BillPaymentstatusCounts>();
        }
        return this.billpmtstatuscounts;
    }

}
