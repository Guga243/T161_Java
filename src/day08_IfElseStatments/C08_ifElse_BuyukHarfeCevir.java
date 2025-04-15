package day08_IfElseStatments;

import java.util.Scanner;

public class C08_ifElse_BuyukHarfeCevir {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen karakter girinix");
        char karakter = scann.nextLine().charAt(0);

        //1. ASKII table
        if (karakter>='a'&& karakter<='z'){ // kucuk karakter oldugunu kontrol etmek icin
            //karakter kucuk harf ise
            System.out.println((char)(karakter-32));
        }else {
            System.out.println(karakter);
        }

        //2.Wrapper class yontemi

        if (Character.isLowerCase(karakter)){
            //karakter kucuk harf ise
            System.out.println(Character.toUpperCase(karakter));
        }else {
            // karakter kucuk harf degulse
            System.out.println(karakter);
        }
    }
}
