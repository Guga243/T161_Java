package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_sayilar_Toplami {
    public static void main(String[] args) {
// Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         toplam 500 den gecerse veya o a basarsa kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        /*
        while loopta iki tane dikkat edilmesi gerek konu

        1-dongu devamini saglayan deger (bu soruda sayi ve sayilarin toplami)
        dongu icerisinde degistiirlmezse sonsuz loop olusur

        2- eger dongunun devamini saglayan degiskene
        donguden once biz dgeer atamasi yaparsak
        vedigimiz degerin calismasini saglayacak bir deger olmasini saglamaliyiz
        aksi taktirde dongu calisir ama loop badysi  hic devriye girmeden biter

         */

        Scanner scann = new Scanner(System.in);

        int sayi =10;
        int sayilarinToplami =0;
        int sayac =0;

        while (sayilarinToplami<=500 && sayi!=0){ // calismasi icin gerekli sarti yaziyorz
            System.out.println("toplanmak uzere pozitif tamsayi giriniz ,\nbitirmek icin 0'a basin");
            sayi= scann.nextInt();// kullanicidan yeni bir sayi aldik
                                   // alinan sayiyi yeniden gozden gecirip
                                  // duruma gore uygun islem yapmaliyiz

            if (sayi>0){
                sayilarinToplami+=sayi;
                sayac++;

            } else if (sayi<0) {
                System.out.println("negatif sayi kullanamazsiniz");

            }
        }
        System.out.println("girilen "+sayac + "adet pozitif sayinin toplami :"+sayilarinToplami );
    }
}
