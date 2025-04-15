package day07_operatorler_ifElseStatments;

import java.util.Scanner;

public class C06_EskenarUcgenKontrolu {
    public static void main(String[] args) {
        // kullanicidan bir ucgenin kenar uzunluklarini alin
        //        // kenar uzunluklari birbirine esit ise "Eskenar ucgen" yazdirin
        //        // kenar uzunluklari pozitif olmalidir

        Scanner scann1 = new Scanner(System.in);
        System.out.println("lutfen kenar uzunlugunu giriniz");
        double kenar1 = scann1.nextDouble();
        double kenar2 = scann1.nextDouble();
        double kenar3 = scann1.nextDouble();
        double kenar4 = scann1.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("eskenar ucgen");

        }
    }
}
