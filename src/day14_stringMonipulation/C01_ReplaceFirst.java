package day14_stringMonipulation;

import java.util.Scanner;

public class C01_ReplaceFirst {
    public static void main(String[] args) {
        String str ="Java candir, Selenium heycandir";

        System.out.println(str.replace("a","A")); //JAvA cAndir, Selenium heycAndir

        // sadece ilk harfini buyuk  A yapin
        System.out.println(str.replaceFirst("a", "A")); //JAva candir, Selenium heycandir

        //System.out.println(str.replaceFirst('A', 'a'));
        //DIKKAT: Replace methodu parametre olarak char data turunden degerler kabul eder
        // AMMA ReplaceFirst kabul etmez sadece String

        // kullanicidan bir metin isteyin
        // girilen metinde ralkam varsa
        // ilk rakam yerine * yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scann.nextLine();

        /*
        Regex : regular expresions (duzenli ifade)

         */
        System.out.println(metin.replaceFirst("\\d", "*"));

        // girilen metinde ilk space yerine "X" yazdirin
        System.out.println(metin.replaceFirst(" ","X"));
        System.out.println(metin.replaceFirst("\\s","X"));
    }
}
