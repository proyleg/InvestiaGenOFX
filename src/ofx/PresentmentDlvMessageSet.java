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
 *         The OFX element "PRESDLVMSGSET" is of type "PresentmentDlvMessageSet"
 *       
 * 
 * <p>Java class for PresentmentDlvMessageSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentDlvMessageSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractMessageSet">
 *       &lt;sequence>
 *         &lt;element name="PRESDLVMSGSETV1" type="{http://ofx.net/types/2003/04}PresentmentDlvMessageSetV1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentDlvMessageSet", propOrder = {
    "presdlvmsgsetv1"
})
public class PresentmentDlvMessageSet
    extends AbstractMessageSet
{

    @XmlElement(name = "PRESDLVMSGSETV1", required = true)
    protected List<PresentmentDlvMessageSetV1> presdlvmsgsetv1;

    /**
     * Gets the value of the presdlvmsgsetv1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presdlvmsgsetv1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRESDLVMSGSETV1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentmentDlvMessageSetV1 }
     * 
     * 
     */
    public List<PresentmentDlvMessageSetV1> getPRESDLVMSGSETV1() {
        if (presdlvmsgsetv1 == null) {
            presdlvmsgsetv1 = new ArrayList<PresentmentDlvMessageSetV1>();
        }
        return this.presdlvmsgsetv1;
    }

}
