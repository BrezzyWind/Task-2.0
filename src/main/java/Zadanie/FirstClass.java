package Zadanie;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FirstClass  {
    @XmlElement
    byte byteVariable;
    @XmlElement
    short shortVariable;
    @XmlElement
    int intVariable;
    @XmlElement
    long longVariable;
    @XmlElement
    float floatVariable;
    @XmlElement
    double doubleVariable;
    @XmlElement
    char charVariable;
    @XmlElement
    boolean booleanVariable;

}
