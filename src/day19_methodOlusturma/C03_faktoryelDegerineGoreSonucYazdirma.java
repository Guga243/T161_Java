package day19_methodOlusturma;

import java.util.Scanner;

public class C03_faktoryelDegerineGoreSonucYazdirma {
    public static void main(String[] args) {
        // kullanicidan 17 den kucuk pozitif tam sayi isteyin
        // giirilen sayi icin faktoryel degerini hesaplayin
        // faktoryel degeri 1000000dan kucukse iyi sayi yazmisisn
        // 1 mln veya buykse nerden buldun yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("17 den kucuk pozitif sayi gir");
        int girilenSayi = scann.nextByte();

         int faktoryel = C02_FaktoryelDegeriDondurme.faktoryelDegeri(girilenSayi);
         if(faktoryel<1000000){
             System.out.println("iyi sayi girmisisin");
         }else System.out.println("nerden buldun");
    }

}
