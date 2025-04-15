package day08_IfElseStatments;

import java.util.Scanner;

public class C04_ifElseEskenarUcgen {
    public static void main(String[] args) {
       // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse
        // “Eskenar degil” yazdirin.
        // kenar uzunluklari pozitif olmalidir

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen kenar uzunlugunu girniz");
        double kenar1 = scann.nextDouble();
        double kenar2 = scann.nextDouble();
        double kenar3 = scann.nextDouble();
        double kenar4 = scann.nextDouble();

        if (kenar1 == kenar2 && kenar1 ==kenar3){
            System.out.println("eskenar ucgen");
        }else {
            System.out.println("eskenar degil");
        }






    }
}
