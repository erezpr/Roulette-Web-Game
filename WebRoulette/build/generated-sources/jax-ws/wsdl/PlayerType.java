
package wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for playerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="playerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HUMAN"/>
 *     &lt;enumeration value="COMPUTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "playerType")
@XmlEnum
public enum PlayerType {

    HUMAN,
    COMPUTER;

    public String value() {
        return name();
    }

    public static PlayerType fromValue(String v) {
        return valueOf(v);
    }

}
