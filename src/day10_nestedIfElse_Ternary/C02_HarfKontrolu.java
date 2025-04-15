package day10_nestedIfElse_Ternary;

import java.util.Scanner;

public class C02_HarfKontrolu {
    public static void main(String[] args) {
        /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "guzel harf"
                - b,c veya d ise "idare eder"
                - diger kucuk harfler icin "girilen kucuk harfi begenmedim" yazdirin
           Kullanici buyuk harf girerse
                - K ise "guzel harf"
                - L, V veya Z ise "idare eder"
                - diger buyuk harfler icin "girilen buyuk harfi begenmedim" yazdirin
           Kullanici ingilizce harfler disinda bir karakter girerse
           tanimlanmamais karakter yazdirin

         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir karaakter giriniz");
        char karakter = scann.next().charAt(0);

        // ana degisken girilen harfin kucuk veya buyuk harf olmasi olsun

        if (karakter >='a' && karakter<='z'){
            //kucuk harfler bolgesi
            if (karakter=='a')
                System.out.println("guzel harf");
            else if (karakter=='b' || karakter=='c' || karakter=='d') System.out.println("idare eder");
            else System.out.println("girilen kucuk harf begenmedim");

        } else if (karakter >='A' && karakter<='Z') {
            //buyuk harfler bolgesi
            if (karakter=='K')
                System.out.println("guzel harf");
            else if (karakter=='L' || karakter=='V' || karakter=='Z') System.out.println("idare eder");
            else System.out.println("girilen BUYUK harf begenmedim");
        }else {
            // geri kalan
            System.out.println("tanimlanmamis karakter");
        }


    }
}
