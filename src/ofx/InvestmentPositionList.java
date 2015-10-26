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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	      The OFX element "INVPOSLIST" is of type "InvestmentPositionList"
 * 	    
 * 
 * <p>Java class for InvestmentPositionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentPositionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="POSMF" type="{http://ofx.net/types/2003/04}PositionMutualFund"/>
 *           &lt;element name="POSSTOCK" type="{http://ofx.net/types/2003/04}PositionStock"/>
 *           &lt;element name="POSDEBT" type="{http://ofx.net/types/2003/04}PositionDebt"/>
 *           &lt;element name="POSOPT" type="{http://ofx.net/types/2003/04}PositionOption"/>
 *           &lt;element name="POSOTHER" type="{http://ofx.net/types/2003/04}PositionOther"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentPositionList", propOrder = {
    "posmfOrPOSSTOCKOrPOSDEBT"
})
public class InvestmentPositionList {

    @XmlElements({
        @XmlElement(name = "POSMF", type = PositionMutualFund.class),
        @XmlElement(name = "POSSTOCK", type = PositionStock.class),
        @XmlElement(name = "POSDEBT", type = PositionDebt.class),
        @XmlElement(name = "POSOPT", type = PositionOption.class),
        @XmlElement(name = "POSOTHER", type = PositionOther.class)
    })
    protected List<AbstractPositionBase> posmfOrPOSSTOCKOrPOSDEBT;

    /**
     * Gets the value of the posmfOrPOSSTOCKOrPOSDEBT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posmfOrPOSSTOCKOrPOSDEBT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSMFOrPOSSTOCKOrPOSDEBT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionMutualFund }
     * {@link PositionStock }
     * {@link PositionDebt }
     * {@link PositionOption }
     * {@link PositionOther }
     * 
     * 
     */
    public List<AbstractPositionBase> getPOSMFOrPOSSTOCKOrPOSDEBT() {
        if (posmfOrPOSSTOCKOrPOSDEBT == null) {
            posmfOrPOSSTOCKOrPOSDEBT = new ArrayList<AbstractPositionBase>();
        }
        return this.posmfOrPOSSTOCKOrPOSDEBT;
    }

}
