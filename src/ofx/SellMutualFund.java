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
 *         The OFX element "SELLMF" is of type "SellMutualFund"
 *       
 * 
 * <p>Java class for SellMutualFund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellMutualFund">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractInvestmentSellTransaction">
 *       &lt;sequence>
 *         &lt;element name="SELLTYPE" type="{http://ofx.net/types/2003/04}SellTypeEnum"/>
 *         &lt;element name="AVGCOSTBASIS" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="RELFITID" type="{http://ofx.net/types/2003/04}FinancialInstitutionTransactionIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellMutualFund", propOrder = {
    "selltype",
    "avgcostbasis",
    "relfitid"
})
public class SellMutualFund
    extends AbstractInvestmentSellTransaction
{

    @XmlElement(name = "SELLTYPE", required = true)
    protected SellTypeEnum selltype;
    @XmlElement(name = "AVGCOSTBASIS")
    protected String avgcostbasis;
    @XmlElement(name = "RELFITID")
    protected String relfitid;

    /**
     * Gets the value of the selltype property.
     * 
     * @return
     *     possible object is
     *     {@link SellTypeEnum }
     *     
     */
    public SellTypeEnum getSELLTYPE() {
        return selltype;
    }

    /**
     * Sets the value of the selltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellTypeEnum }
     *     
     */
    public void setSELLTYPE(SellTypeEnum value) {
        this.selltype = value;
    }

    /**
     * Gets the value of the avgcostbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVGCOSTBASIS() {
        return avgcostbasis;
    }

    /**
     * Sets the value of the avgcostbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVGCOSTBASIS(String value) {
        this.avgcostbasis = value;
    }

    /**
     * Gets the value of the relfitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELFITID() {
        return relfitid;
    }

    /**
     * Sets the value of the relfitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELFITID(String value) {
        this.relfitid = value;
    }

}
