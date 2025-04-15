package day20_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan pozitif sayilar girmesini isteyin
        // kullnaici pozitif sayilar girdigi mudettce girilen sayilar toplayin
        // kullnaici islemi bitirmek istediginde 0'a bassin
        // negatif deger girers kullaniciya uyari yazdirin
        // girilen  negatif sayiyi isleme dahil etmeyin


        Scanner scann = new Scanner(System.in);
        int girilenSayi =10;
        int sayilarinToplami =10;
        while (girilenSayi !=0){ // loopun bitmesi icin gerekli sarti degil /  0 olmadigi muddetce devam et
                  // loopun devam etmesi icin gerekli sarti yaziyoruz

            System.out.println("lutfen pozitif bir tam sayi giriniz");
            girilenSayi= scann.nextInt();

            if (girilenSayi>0){
                sayilarinToplami+=girilenSayi;
            } else if (girilenSayi<0) {
                System.out.println("pozitif sayi girmelisiniz");

            }

        }
        System.out.println("girilen pozitif tam sayilarin toplami :"+ sayilarinToplami);

    }
}
