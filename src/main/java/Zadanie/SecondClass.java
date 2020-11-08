
package Zadanie;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SecondClass extends FirstClass{
    @XmlElement
    byte byteVariableSecond;
    @XmlElement
    short shortVariableSecond;
    @XmlElement
    int intVariableSecond;
    @XmlElement
    long longVariableSecond;
    @XmlElement
    float floatVariableSecond;
    @XmlElement
    double doubleVariableSecond;
    @XmlElement
    char charVariableSecond;


    public SecondClass() {

        byteVariable =7;
        shortVariable=15;
        intVariable=31;
        longVariable=63;
        floatVariable=31.5f;
        doubleVariable=63.5d;
        charVariable='U';
        booleanVariable=false;

    }

}
