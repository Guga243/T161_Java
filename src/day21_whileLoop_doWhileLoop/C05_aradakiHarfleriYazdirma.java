package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_aradakiHarfleriYazdirma {
    public static void main(String[] args) {

        /* kullanicidan baslangic ve bitis karakterlerini alip
        o karakterleri ve aralarindeki karakterleri yazdirin
        kullanici bir karakter degil
        bir metin girerse uyari verip\ yeniden karakter girmesini isteyin
        kullanici karakter girinceye kadar tekrar isteyin
         */

        Scanner scann = new Scanner(System.in);
        char baslangic;
        char bitis;
        String girilenMetinBaslangic;
        String girilenMetinBitis;


        do {
            System.out.println("baslangic deger olarak bir harf giriniz");
            girilenMetinBaslangic= scann.nextLine();
            if (girilenMetinBaslangic.length()==1){
                baslangic= girilenMetinBaslangic.charAt(0);
            }else {
                System.out.println("baslangic olarak karakter girmelisiniz");
            }

            System.out.println("bitis degeri olarak bir karakter griniz");
            girilenMetinBitis= scann.nextLine();

            if (girilenMetinBitis.length()==1){
               bitis= girilenMetinBitis.charAt(0);
            }else {
                System.out.println("bitis olarak karakter girniz");
            }


        }while (girilenMetinBaslangic.length()!=1 || girilenMetinBitis.length() !=1); //

    }
}
