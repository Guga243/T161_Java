package day09_ifElseIfStatements_NestedElse;

import java.util.Scanner;

public class C06_CokluDegisken {
    public static void main(String[] args) {

        // kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin
        // kullanici musteri karti olup olmadiginiz sorun
        // varsa 10 urunden fazla alirsa %20
        // 10 dan az alirsa %15 indirim yapin
        // karti yoksa 10 urunden fazla alirsa %15
        // 10 dan az alirsa %10 indirim yapin

        Scanner scann = new Scanner( System.in);
        System.out.println("lutfen aldiginiz urun adedini giriniz");
        int adet = scann.nextInt();

        System.out.println("aldiginiz urun birim fiyati giriniz");
        double birimFiyati = scann.nextDouble();

        System.out.println("musteri kartiniz var mi");
        char kart = scann.next().toUpperCase().charAt(0);
        
        double indirimsizToplamFiyat = adet* birimFiyati;


        if (kart == 'E' && adet>10)
            System.out.println("%20 indirimli toplam fiyat :"+indirimsizToplamFiyat*80/100);
        else if (kart=='E')
            System.out.println("%15 indirimli fiyat toplam " +indirimsizToplamFiyat*85/100);
        else if (kart == 'H' && adet>10)
            System.out.println("%15 indirimli toplam fiyat :"+indirimsizToplamFiyat*85/100);
        else if (kart == 'h');
        System.out.println("%10 indirimli fiyat toplam " +indirimsizToplamFiyat*90/100);



    }
}
