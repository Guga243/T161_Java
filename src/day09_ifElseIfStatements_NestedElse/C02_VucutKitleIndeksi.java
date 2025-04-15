package day09_ifElseIfStatements_NestedElse;

import java.util.Scanner;

public class C02_VucutKitleIndeksi {
    public static void main(String[] args) {
        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo = scann.nextDouble();

        System.out.println("lutfen boyunuzu giriniz");
        double boy = scann.nextDouble();

        double vke = kilo*10000 / (boy *boy);
        System.out.println(" VKE'niz " + vke); // vke yazdirmak icin

        if (vke>30) System.out.println("Obez");
        else if (vke>25) System.out.println("kilolu");
        else if (vke>20) System.out.println(" normal");
        else System.out.println("normal");




    }
}
