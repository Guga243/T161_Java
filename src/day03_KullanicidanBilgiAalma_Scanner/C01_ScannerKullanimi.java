package day03_KullanicidanBilgiAalma_Scanner;

import java.util.Scanner;

public class C01_ScannerKullanimi {
    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // ve girilen tam sayinin 10 katini asagdeki gibi
        // yazdirin

        // orn: input=> 5 output girilen sayinin 10 kati :50


        //1 adim scaner objesi olustur
        Scanner scann  = new Scanner(System.in);

        //2.adin kullaniciya ne istediginizi yazdiriin
        System.out.println("lutfen bir tam sayi giriniz");

        //3.adim : olusturdugumuz scanner objeyi kullanarak
        // kullanicinin girdigi bilgiyi
        // dis konsoldan alip, olusturdugumuz uygun bir veriable
        // kaydedelim
        int girilenSayi = scann.nextInt();

        System.out.println("girilen sayinin 10 kati: "+(girilenSayi*10) );






    }
}
