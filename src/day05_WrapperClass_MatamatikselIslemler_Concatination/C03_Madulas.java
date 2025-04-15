package day05_WrapperClass_MatamatikselIslemler_Concatination;

import java.util.Scanner;

public class C03_Madulas {
    public static void main(String[] args) {

        // kullanicidan bir tam sayi alin
        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz" );
        int girilenSayi = scann.nextInt();


        //eger bize sayinin cift mi tek mi oldugunu sorulsa
        System.out.println(girilenSayi % 2);
        // bu islemin sonucunu kontrole deriz sonuc 0 ise sayi cittir
        // sonuc 0 degilse tekkir


        // eger girilen sayinin 5'in kati olup olmadigi sorulursa

        System.out.println(girilenSayi% 5);
        //sonuc 0 ise sayi 5'in katidir 0 degilse 5'in kati degildir

        //eger girilen sayinin birler basamagini bulmamiz istenirse
        System.out.println(girilenSayi%10);
        System.out.println("===========");

        // sayi /10 ile sayi %10 ayni sey degildir


        int sayi =245;
        System.out.println(sayi % 10);//5
        System.out.println(sayi /10);//24

        System.out.println(sayi);//245

        //sayiyi 24 olarak kayit tmek istersek
        sayi= sayi/10;
        System.out.println(sayi);//24

    }
}
