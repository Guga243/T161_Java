package day13_stringManipulation;

import java.util.Scanner;

public class C01_indexOf {
    public static void main(String[] args) {

        /*
        verilen str da
        aranan bir char veya metin HANGI INDEXde oldugunu bilgisini getirir
        eger aranan char veya metin str da birden fazla varsa
        ilkin index'ini getirir

         */
        String str ="Java cok guzel";
        System.out.println(str.contains("cok"));// true
        System.out.println(str.endsWith("cok"));// false
        System.out.println(str.startsWith("cok"));// false
        System.out.println(str.equals(str));// false

        // peki bu "cok" nerede?
        System.out.println(str.indexOf("cok"));// 5
        // cok  kelimesi icin str icinde 5.indexten itibaren var

        str ="Ali topu at, at ALi at";
        System.out.println(str.indexOf("at"));// 9
        System.out.println(str.indexOf("Ali"));// 0
        System.out.println(str.indexOf('a'));//9

        System.out.println(str.indexOf("5"));// indexOf () bize int bir sonuc getirir
        // eger aranan metin veya char yoksa -1 sonuc verir
        System.out.println(str.contains("k"));// false

        // contains() 'in false getirmesi ile , indexOf()un -1 getirmesi ayni anlama gelir


        // kullanicidan bir metin isteyin
        //metnin Java icerip icermedigini indexOf() ile yazdirin

        Scanner scann = new Scanner( System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scann.nextLine();

        if (metin.indexOf("Java")!=-1){
            System.out.println("yazilan metin java iceriyor");
        }else {
            System.out.println("yazilan metin java icermiyor");
        }
    }
}
