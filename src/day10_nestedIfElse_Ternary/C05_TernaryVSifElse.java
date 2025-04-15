package day10_nestedIfElse_Ternary;

import java.util.Scanner;

public class C05_TernaryVSifElse {
    public static void main(String[] args) {
        // Kullanicidan uc basamakli pozitif bir tamsayi isteyin
        // sayi 500 veya daha buyukse rakamlar toplamini hesaplayip yazdirin
        // sayi 500'den kucukse sayinin 10'lar basamagindaki rakamin karesini yazdirin

        /*
        sayinin 500 den buyuk olup olmadigini ternary ile ayirt edebiliriz
        ancak sayinin rakamlar toplamini bulmak veya 10lar basamagindeki
        rakami bulup karesini almak tek satirda basitce yazabilecegimiiz kodlar
        olmadigindan bu gorevde ternary kullanilmaz

         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir pozitif tamsayi giriizn");
        int sayi = scann.nextInt();

        int rakam =0;
        int rakamlarToplami =0;

        if (sayi>500){

            rakam= sayi%10 ;
            rakamlarToplami +=rakam;
            sayi/=10;

            rakam= sayi%10 ;
            rakamlarToplami +=rakam;
            sayi/=10;

            rakam= sayi%10 ;
            rakamlarToplami +=rakam;
            sayi/=10;

            System.out.println("girilen sayinin rakamlar toplami "+rakamlarToplami);


        }else { // sayi 500den buyuk degilse
            // birler basamagindan kurtulalim
          sayi/=10;





        }
    }
}
