//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="BIWEEKLY"/>
 *     &lt;enumeration value="TWICEMONTHLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="FOURWEEKS"/>
 *     &lt;enumeration value="BIMONTHLY"/>
 *     &lt;enumeration value="QUARTERLY"/>
 *     &lt;enumeration value="SEMIANNUALLY"/>
 *     &lt;enumeration value="ANNUALLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FrequencyEnum")
@XmlEnum
public enum FrequencyEnum {

    WEEKLY,
    BIWEEKLY,
    TWICEMONTHLY,
    MONTHLY,
    FOURWEEKS,
    BIMONTHLY,
    QUARTERLY,
    SEMIANNUALLY,
    ANNUALLY;

    public String value() {
        return name();
    }

    public static FrequencyEnum fromValue(String v) {
        return valueOf(v);
    }

}
