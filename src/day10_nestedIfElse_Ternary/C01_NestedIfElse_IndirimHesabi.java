package day10_nestedIfElse_Ternary;

import java.util.Scanner;

public class C01_NestedIfElse_IndirimHesabi {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen urun adedi giriniz");
        int adet = scann.nextInt();

        System.out.println("lutfen aldiginiz urun birim fiyati giriniz");
        double birimFiyati = scann.nextDouble();

        System.out.println("musteri kartiniz var mi");
        char kartVarmi = scann.next().toUpperCase().charAt(0);

        double  indirimsizFiyat = adet*birimFiyati;

        // ana degiskeni urun adedi olsun
        if (adet>10){
            //10 urunden fazla  alanlar bolgesi
            if (kartVarmi =='E')
                System.out.println("%20 indirimli toplam fiyat :"+indirimsizFiyat*80/100);
            else if (kartVarmi =='H')
                System.out.println("%15 indirimli fiyat toplam :"+indirimsizFiyat*90/100);
            else System.out.println("kart varmi sorusuna verilen cevap gecersiz");



        }


    }
}
