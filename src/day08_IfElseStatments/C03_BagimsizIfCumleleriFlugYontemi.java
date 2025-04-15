package day08_IfElseStatments;

import java.util.Scanner;

public class C03_BagimsizIfCumleleriFlugYontemi {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scann.nextInt();
        int flug = 40;


        /*
        kullanicidan bir tam sayi isteyip
        asagda verilen 4 sarti kontrol edin
         ve istenenleri yazdirin
         */


        // girilen tamsayi 5'in kati ise "sayi 5'e bolunuyor" yazdirin
        if (sayi % 5 == 0) {
            System.out.println("sayi 5'e bolunuyor");
            flug=40;
        }

        // sayi 100'den buyukse "buyuk sayi girdiniz" yazdirin
        if (sayi > 100) {
            System.out.println("buyuk sayi girdiniz");
            flug=40;
        }

        // sayi 1000'den buyukse "guzel sayi" yazdirin
        boolean sonuc = sayi > 1000;
        if (sonuc) {
            System.out.println("guzel sayi");
            flug=40;
        }

        // sayi cift sayi ise "cift sayilari severim yazdirim
        if (sayi % 2 == 0) {
            System.out.println("cift sayilari severim");
            flug=40;

            /*
            basta flug veriable 20 degerini verdik
            basgimsiz if cumlelerin badylerinde ise hep flug 40 degeri atadik

            sona geldigimizde
            flug 20 veya 40 degerine esit olacaktir

            flug 20 ise hicbir budy calismadi
            flug 40 ise calisan oldu amma kac tane calisti bilmiyoruz

             */
            // eger 4 kontrolden  hic biri calisip mesaj yazdirmazzsa
            //"nasil sayi sectin "

            if (flug==20){
                System.out.println("nasil sayi bu aq");
            }


        }
    }
}
