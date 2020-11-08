package Zadanie;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ThirdClass extends SecondClass{

    public ThirdClass() {

        byteVariableSecond=-7;
        shortVariableSecond=-15;
        intVariableSecond=-31;
        longVariableSecond=-63;
        floatVariableSecond=-31.5f;
        doubleVariableSecond=-63.5d;
        charVariableSecond='T';

    }
}
