package day08_IfElseStatments;

import java.util.Calendar;
import java.util.Scanner;

public class C07_ifElse_BuyukHarfKontrolu {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
       char karakter = scann.nextLine().charAt(0);

       //1. yontem Askii table

        if (karakter>='A' && karakter<='Z'){
            System.out.println("buyuk harf");
        }else System.out.println("buyuk harf degildir");

        // 2.yontem karakter Wrapper class

        if (Character.isUpperCase(karakter) ){
            System.out.println("Buyuk harf");
        }else System.out.println("buyuk harf degil");

    }
}
