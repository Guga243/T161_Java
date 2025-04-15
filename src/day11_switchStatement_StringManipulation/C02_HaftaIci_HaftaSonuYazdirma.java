package day11_switchStatement_StringManipulation;

import java.util.Scanner;

public class C02_HaftaIci_HaftaSonuYazdirma {
    public static void main(String[] args) {

        /*
        // Kullanicidan gun numarasi girmesini isteyin
         girilen sayiya gore 1- pazartesi ..... 7 - pazar olacak sekilde
          istenen gunun hafta ici veya hafta sonu oldugunu yazdirin
          kullanici 1-7 arasindaki sayilar disinda bir deger girerse
           hata mesaji verin
         */


        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir gun numarasi girinix");
        int gunNo = scann.nextInt();

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hfta ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("hatali gun sayisi");

        }
    }
}
