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
 *         The OFX element "CHKDESC" is of type "CheckDescription"
 *       
 * 
 * <p>Java class for CheckDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractCheckInfo">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="CHECKNUM" type="{http://ofx.net/types/2003/04}CheckNumberType" minOccurs="0"/>
 *         &lt;element name="DTUSER" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="TRNAMT" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckDescription", propOrder = {
    "name",
    "checknum",
    "dtuser",
    "trnamt"
})
public class CheckDescription
    extends AbstractCheckInfo
{

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "CHECKNUM")
    protected String checknum;
    @XmlElement(name = "DTUSER")
    protected String dtuser;
    @XmlElement(name = "TRNAMT")
    protected String trnamt;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the checknum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKNUM() {
        return checknum;
    }

    /**
     * Sets the value of the checknum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKNUM(String value) {
        this.checknum = value;
    }

    /**
     * Gets the value of the dtuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTUSER() {
        return dtuser;
    }

    /**
     * Sets the value of the dtuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTUSER(String value) {
        this.dtuser = value;
    }

    /**
     * Gets the value of the trnamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNAMT() {
        return trnamt;
    }

    /**
     * Sets the value of the trnamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNAMT(String value) {
        this.trnamt = value;
    }

}
