package day16_NestedForLoop;

import java.util.Scanner;

public class C01_ardisikKarakterleriYazma {
    public static void main(String[] args) {

        // kullanicidan bir karakter alin
        // kullanici kucuk harf girerse girilen harf ve sonraki 5 karakteri yazdirin
        // kullanici buyuk harf girerse girilen harf ve sonraki 4 karakteri yazdirn
        // kullanici baska bir karakter girerse girilen karakter ve sonraki 3 karaktewri yazdirin

        Scanner scann = new Scanner(System.in);

        System.out.println("lutfen bir karakter giriniz");
        char karakter = scann.next().charAt(0);

        if (Character.isLowerCase(karakter)){
            // kucuk harf bolumu
           // girilen harf ve sonraki 5 karakteri yazdirin
            for (char i = karakter; i <=karakter+5; i++) {
                System.out.println(i+" ");
            }


        }else if (Character.isUpperCase(karakter)){
            // buyuk harf bolumu
            //girilen harf ve sonraki 4 karakteri yazdirn
            for (char i = karakter; i <karakter+4; i++) {
                System.out.println(i+" ");
            }

        }else {
            // diger karakterler
            //girilen karakter ve sonraki 3 karaktewri yazdirin
            for (char i = karakter; i <=karakter+3 ; i++) {
                System.out.println(i+" ");
            }

        }
        System.out.println("========");
    }

}
