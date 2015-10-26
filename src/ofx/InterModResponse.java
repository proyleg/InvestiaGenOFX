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
 *         The OFX element "INTERMODRS" is of type "InterModResponse"
 *       
 * 
 * <p>Java class for InterModResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterModResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractInterResponse">
 *       &lt;sequence>
 *         &lt;element name="SRVRTID" type="{http://ofx.net/types/2003/04}ServerIdType"/>
 *         &lt;element name="XFERINFO" type="{http://ofx.net/types/2003/04}TransferInfo"/>
 *         &lt;element name="XFERPRCSTS" type="{http://ofx.net/types/2003/04}TransferProcessingStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterModResponse", propOrder = {
    "srvrtid",
    "xferinfo",
    "xferprcsts"
})
public class InterModResponse
    extends AbstractInterResponse
{

    @XmlElement(name = "SRVRTID", required = true)
    protected String srvrtid;
    @XmlElement(name = "XFERINFO", required = true)
    protected TransferInfo xferinfo;
    @XmlElement(name = "XFERPRCSTS")
    protected TransferProcessingStatus xferprcsts;

    /**
     * Gets the value of the srvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVRTID() {
        return srvrtid;
    }

    /**
     * Sets the value of the srvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVRTID(String value) {
        this.srvrtid = value;
    }

    /**
     * Gets the value of the xferinfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInfo }
     *     
     */
    public TransferInfo getXFERINFO() {
        return xferinfo;
    }

    /**
     * Sets the value of the xferinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInfo }
     *     
     */
    public void setXFERINFO(TransferInfo value) {
        this.xferinfo = value;
    }

    /**
     * Gets the value of the xferprcsts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferProcessingStatus }
     *     
     */
    public TransferProcessingStatus getXFERPRCSTS() {
        return xferprcsts;
    }

    /**
     * Sets the value of the xferprcsts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferProcessingStatus }
     *     
     */
    public void setXFERPRCSTS(TransferProcessingStatus value) {
        this.xferprcsts = value;
    }

}
