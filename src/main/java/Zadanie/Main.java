package Zadanie;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        FirstClass initFirst=new FirstClass();
        SecondClass initSecond = new SecondClass();
        System.out.println("Наследуемые переменные из первого класса получили данные:");
        System.out.println("byteVariable="+initSecond.byteVariable);
        System.out.println("shortVariable="+initSecond.shortVariable);
        System.out.println("intVariable="+initSecond.intVariable);
        System.out.println("longVariable="+initSecond.longVariable);
        System.out.println("floatVariable="+initSecond.floatVariable);
        System.out.println("doubleVariable="+initSecond.doubleVariable);
        System.out.println("charVariable="+initSecond.charVariable);

        ThirdClass initThird= new ThirdClass();
        System.out.println("\nНаследуемые переменные из второго класса получили данные:");
        System.out.println("byteVariableSecond="+initThird.byteVariableSecond);
        System.out.println("shortVariableSecond="+initThird.shortVariableSecond);
        System.out.println("intVariableSecond="+initThird.intVariableSecond);
        System.out.println("longVariableSecond="+initThird.longVariableSecond);
        System.out.println("floatVariableSecond="+initThird.floatVariableSecond);
        System.out.println("doubleVariableSecond="+initThird.doubleVariableSecond);
        System.out.println("charVariableSecond="+initThird.charVariableSecond);

        JAXBContext jaxbContext1 = null;
        JAXBContext jaxbContext2 = null;
        JAXBContext jaxbContext3 = null;

        try {
            File firstClassFile=new File("C://2/untitled/FirstClassXML.txt");
            jaxbContext1 = JAXBContext.newInstance(FirstClass.class);
            Marshaller jaxbMarshaller1 = jaxbContext1.createMarshaller();
            jaxbMarshaller1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller1.marshal(initFirst, firstClassFile);
            jaxbMarshaller1.marshal(initFirst, System.out);

            Unmarshaller unmarshalled1 = jaxbContext1.createUnmarshaller();
            FirstClass unmarshal = (FirstClass) unmarshalled1.unmarshal(firstClassFile);
            System.out.println("Десиреализация поля в классе 1 "+unmarshal.booleanVariable);

            File secondClassFile=new File("C://2/untitled/SecondClassXML.txt");
            jaxbContext2 = JAXBContext.newInstance(ThirdClass.class);
            Marshaller jaxbMarshaller2 = jaxbContext2.createMarshaller();
            jaxbMarshaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller2.marshal(initSecond, secondClassFile);
            jaxbMarshaller2.marshal(initSecond, System.out);

            Unmarshaller unmarshalled2 = jaxbContext2.createUnmarshaller();
            SecondClass unmarshal2 = (SecondClass) unmarshalled2.unmarshal(secondClassFile);
            System.out.println("Десиреализация поля в классе 2 "+unmarshal2.doubleVariable);

            File thirdClassFile=new File("C://2/untitled/ThirdClassXML.txt");
            jaxbContext3 = JAXBContext.newInstance(ThirdClass.class);
            Marshaller jaxbMarshaller3 = jaxbContext3.createMarshaller();
            jaxbMarshaller3.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller3.marshal(initThird, thirdClassFile);
            jaxbMarshaller3.marshal(initThird, System.out);

            Unmarshaller unmarshalled3 = jaxbContext3.createUnmarshaller();
            ThirdClass unmarshal3 = (ThirdClass) unmarshalled3.unmarshal(thirdClassFile);
            System.out.println("Десиреализация поля в классе 3 "+unmarshal3.intVariableSecond);
        } catch (JAXBException e) {
            e.printStackTrace();
        }



    }
}

