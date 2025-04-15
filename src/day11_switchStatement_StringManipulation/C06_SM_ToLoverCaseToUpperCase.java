package day11_switchStatement_StringManipulation;

import java.util.Locale;

public class C06_SM_ToLoverCaseToUpperCase {
    public static void main(String[] args) {

        String str ="BÜTÜN BAĞ BAHÇE BAĞCININDIR";

        System.out.println(str.toLowerCase()); //java candir
        System.out.println(str.toUpperCase()); //JAVA CANDİR
        System.out.println(str);//Java Candir
        // String de atama yapmadigimiz muddetce
        // methodlarla yapilan degisiklikler KALICI degildir

        // kalici degisiklik istiyorsaniz atama yapmalisiniz

        System.out.println(str = str.toUpperCase()); //JAVA CANDİR

       // BÜTÜN BAĞ BAHÇE BAĞCININDIR

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));
    }
}
