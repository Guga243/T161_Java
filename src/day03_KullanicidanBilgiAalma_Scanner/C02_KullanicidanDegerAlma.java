package day03_KullanicidanBilgiAalma_Scanner;

import java.util.Scanner;

public class C02_KullanicidanDegerAlma {
    public static void main(String[] args) {
        //Kullanicidan bir double,
        // bir de int sayi alip bunlarin toplamini
        // ve carpimini yazdirin.

        Scanner scann = new Scanner(System.in);

        System.out.println("lutfen bir tam sayi giriniz");
        int tamSayi = scann.nextInt();

        System.out.println("lutfen duble sayi giriniz");
        double dlbsayi = scann.nextDouble();

        System.out.println("islem toplami: "+(tamSayi+dlbsayi));

        System.out.println("islem carpimi :"+(tamSayi*dlbsayi));


    }
}
