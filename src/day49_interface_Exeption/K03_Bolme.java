package day49_interface_Exeption;

import java.util.Scanner;

public class K03_Bolme {

    public static void main(String[] args) {

        // kullanicidan 2 tam sayi isteyin
        // 1.sayiyi 2. sayiya bolup
        // islem sonucunun tam sayi kismini yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bolme islemi icin iki tam sayi giriniz");

        int sayi1 = scann.nextInt();
        int sayi2 = scann.nextInt();

        if (sayi2 !=0) {
            System.out.println("bolme islemi sonucu : "+sayi1/sayi2);

        }

         // bolme islemi sonucu : 4
        // ArithmeticException    : / by zero

        System.out.println("exeption olursa bu satir alismaz");
    }
}
