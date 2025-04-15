package day05_WrapperClass_MatamatikselIslemler_Concatination;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //kullanicidan 3 basamakli pozitif bir tam sayi alip
        // girlen sayinin rakamlar toplamini yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir pozitif tam sayi giriniz");

        int sayi = scann.nextInt(); //234

        int rakam =0;
        int rakamlarToplami =0;

        rakam= sayi%10;
        rakamlarToplami=rakamlarToplami+rakam;

        sayi=sayi/10; // sayi artik iki basamakli oldu

        rakam=sayi%10;
        rakamlarToplami=rakamlarToplami+rakam;
        sayi=sayi/10;// sayi artik tek basamakli

        rakamlarToplami=rakamlarToplami+sayi;
        System.out.println("girilen sayinin rakamlar toplami"+rakamlarToplami);// 9





    }
}
