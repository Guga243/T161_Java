package day08_IfElseStatments;

import java.util.Scanner;

public class C02_BagimsizIfCumleleriSayacYontemi {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scann.nextInt();
        int sayac = 0;


        /*
        kullanicidan bir tam sayi isteyip
        asagda verilen 4 sarti kontrol edin
         ve istenenleri yazdirin
         */


        // girilen tamsayi 5'in kati ise "sayi 5'e bolunuyor" yazdirin
        if (sayi % 5 == 0) {
            System.out.println("sayi 5'e bolunuyor");
            sayac++;
        }

        // sayi 100'den buyukse "buyuk sayi girdiniz" yazdirin
        if (sayi > 100) {
            System.out.println("buyuk sayi girdiniz");
            sayac++;
        }

        // sayi 1000'den buyukse "guzel sayi" yazdirin
        boolean sonuc = sayi > 1000;
        if (sonuc) {
            System.out.println("guzel sayi");
            sayac++;
        }

        // sayi cift sayi ise "cift sayilari severim yazdirim
        if (sayi % 2 == 0) {
            System.out.println("cift sayilari severim");
            sayac++;
        }



        //2. yontem saayac yontemi

        // baslangicta sayaca 0 degeri atadik
        // sona geldigimizde sayac 0 1 2 3 4 olabilir
        // eger sayac sonda 0 ise ==> hic bir if budysi devreye girmedi
        if (sayac==0) System.out.println("sen ne guzel sayilar seciyorsun oyle");


        // eger sayac sonda 4ise hepsi devreye girdi
        // sona gldigimizde sayacin degerine gore kac tane if budy calistigini
        // bulabilriiz
        if (sayac==4) System.out.println("nice");




    }
}









