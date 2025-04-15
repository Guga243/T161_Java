package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_doWhileLoop_sayilarinToplami {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         toplam 500 den gecerse veya o a basarsa kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        Scanner scann = new Scanner(System.in);
        int sayi =10;
        int sayilarinToplami =0;
        int sayac =0;

        /*
        eger dongumuz kullanicidan alinan bir degere bagli iken
        donguden once biz o veriable'a yanlis deger atamasi yaparsak
        loopBody hic devriye girmeyebilir

        bu durumun onune gecmek icin do while loop var

        do while loop da kontrol yapilmadan once bir kez calisir
        biz yanlis deger versek bile kullanicidan deger alinmis olur

         */

        do {
            System.out.println("toplanmak uzere pozitif tamsayi giriniz ,\nbitirmek icin 0'a basin");
            sayi= scann.nextInt();
            if (sayi>0){
                sayilarinToplami+=sayi;
                sayac++;

            } else if (sayi<0) {
                System.out.println("negatif sayi kullanamazsiniz");

            }
        }while (sayilarinToplami<=500 && sayi!=0);
        System.out.println("girilen "+sayac + "adet pozitif sayinin toplami :"+sayilarinToplami );

    }
}
