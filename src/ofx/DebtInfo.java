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
 *         The OFX element "DEBTINFO" is of type "DebtInfo"
 *       
 * 
 * <p>Java class for DebtInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractSecurityInfo">
 *       &lt;sequence>
 *         &lt;element name="PARVALUE" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="DEBTTYPE" type="{http://ofx.net/types/2003/04}DebtEnum"/>
 *         &lt;element name="DEBTCLASS" type="{http://ofx.net/types/2003/04}DebtClassEnum" minOccurs="0"/>
 *         &lt;element name="COUPONRT" type="{http://ofx.net/types/2003/04}RateType" minOccurs="0"/>
 *         &lt;element name="DTCOUPON" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="COUPONFREQ" type="{http://ofx.net/types/2003/04}CouponFrequencyEnum" minOccurs="0"/>
 *         &lt;element name="CALLPRICE" type="{http://ofx.net/types/2003/04}UnitPriceType" minOccurs="0"/>
 *         &lt;element name="YIELDTOCALL" type="{http://ofx.net/types/2003/04}RateType" minOccurs="0"/>
 *         &lt;element name="DTCALL" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="CALLTYPE" type="{http://ofx.net/types/2003/04}CallTypeEnum" minOccurs="0"/>
 *         &lt;element name="YIELDTOMAT" type="{http://ofx.net/types/2003/04}RateType" minOccurs="0"/>
 *         &lt;element name="DTMAT" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ASSETCLASS" type="{http://ofx.net/types/2003/04}AssetClassEnum" minOccurs="0"/>
 *         &lt;element name="FIASSETCLASS" type="{http://ofx.net/types/2003/04}GenericNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtInfo", propOrder = {
    "parvalue",
    "debttype",
    "debtclass",
    "couponrt",
    "dtcoupon",
    "couponfreq",
    "callprice",
    "yieldtocall",
    "dtcall",
    "calltype",
    "yieldtomat",
    "dtmat",
    "assetclass",
    "fiassetclass"
})
public class DebtInfo
    extends AbstractSecurityInfo
{

    @XmlElement(name = "PARVALUE", required = true)
    protected String parvalue;
    @XmlElement(name = "DEBTTYPE", required = true)
    protected DebtEnum debttype;
    @XmlElement(name = "DEBTCLASS")
    protected DebtClassEnum debtclass;
    @XmlElement(name = "COUPONRT")
    protected String couponrt;
    @XmlElement(name = "DTCOUPON")
    protected String dtcoupon;
    @XmlElement(name = "COUPONFREQ")
    protected CouponFrequencyEnum couponfreq;
    @XmlElement(name = "CALLPRICE")
    protected String callprice;
    @XmlElement(name = "YIELDTOCALL")
    protected String yieldtocall;
    @XmlElement(name = "DTCALL")
    protected String dtcall;
    @XmlElement(name = "CALLTYPE")
    protected CallTypeEnum calltype;
    @XmlElement(name = "YIELDTOMAT")
    protected String yieldtomat;
    @XmlElement(name = "DTMAT")
    protected String dtmat;
    @XmlElement(name = "ASSETCLASS")
    protected AssetClassEnum assetclass;
    @XmlElement(name = "FIASSETCLASS")
    protected String fiassetclass;

    /**
     * Gets the value of the parvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARVALUE() {
        return parvalue;
    }

    /**
     * Sets the value of the parvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARVALUE(String value) {
        this.parvalue = value;
    }

    /**
     * Gets the value of the debttype property.
     * 
     * @return
     *     possible object is
     *     {@link DebtEnum }
     *     
     */
    public DebtEnum getDEBTTYPE() {
        return debttype;
    }

    /**
     * Sets the value of the debttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtEnum }
     *     
     */
    public void setDEBTTYPE(DebtEnum value) {
        this.debttype = value;
    }

    /**
     * Gets the value of the debtclass property.
     * 
     * @return
     *     possible object is
     *     {@link DebtClassEnum }
     *     
     */
    public DebtClassEnum getDEBTCLASS() {
        return debtclass;
    }

    /**
     * Sets the value of the debtclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtClassEnum }
     *     
     */
    public void setDEBTCLASS(DebtClassEnum value) {
        this.debtclass = value;
    }

    /**
     * Gets the value of the couponrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONRT() {
        return couponrt;
    }

    /**
     * Sets the value of the couponrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONRT(String value) {
        this.couponrt = value;
    }

    /**
     * Gets the value of the dtcoupon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTCOUPON() {
        return dtcoupon;
    }

    /**
     * Sets the value of the dtcoupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTCOUPON(String value) {
        this.dtcoupon = value;
    }

    /**
     * Gets the value of the couponfreq property.
     * 
     * @return
     *     possible object is
     *     {@link CouponFrequencyEnum }
     *     
     */
    public CouponFrequencyEnum getCOUPONFREQ() {
        return couponfreq;
    }

    /**
     * Sets the value of the couponfreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponFrequencyEnum }
     *     
     */
    public void setCOUPONFREQ(CouponFrequencyEnum value) {
        this.couponfreq = value;
    }

    /**
     * Gets the value of the callprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLPRICE() {
        return callprice;
    }

    /**
     * Sets the value of the callprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLPRICE(String value) {
        this.callprice = value;
    }

    /**
     * Gets the value of the yieldtocall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYIELDTOCALL() {
        return yieldtocall;
    }

    /**
     * Sets the value of the yieldtocall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYIELDTOCALL(String value) {
        this.yieldtocall = value;
    }

    /**
     * Gets the value of the dtcall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTCALL() {
        return dtcall;
    }

    /**
     * Sets the value of the dtcall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTCALL(String value) {
        this.dtcall = value;
    }

    /**
     * Gets the value of the calltype property.
     * 
     * @return
     *     possible object is
     *     {@link CallTypeEnum }
     *     
     */
    public CallTypeEnum getCALLTYPE() {
        return calltype;
    }

    /**
     * Sets the value of the calltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallTypeEnum }
     *     
     */
    public void setCALLTYPE(CallTypeEnum value) {
        this.calltype = value;
    }

    /**
     * Gets the value of the yieldtomat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYIELDTOMAT() {
        return yieldtomat;
    }

    /**
     * Sets the value of the yieldtomat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYIELDTOMAT(String value) {
        this.yieldtomat = value;
    }

    /**
     * Gets the value of the dtmat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMAT() {
        return dtmat;
    }

    /**
     * Sets the value of the dtmat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMAT(String value) {
        this.dtmat = value;
    }

    /**
     * Gets the value of the assetclass property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassEnum }
     *     
     */
    public AssetClassEnum getASSETCLASS() {
        return assetclass;
    }

    /**
     * Sets the value of the assetclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassEnum }
     *     
     */
    public void setASSETCLASS(AssetClassEnum value) {
        this.assetclass = value;
    }

    /**
     * Gets the value of the fiassetclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASSETCLASS() {
        return fiassetclass;
    }

    /**
     * Sets the value of the fiassetclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIASSETCLASS(String value) {
        this.fiassetclass = value;
    }

}
