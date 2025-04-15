package day10_nestedIfElse_Ternary;

import java.util.Scanner;

public class C04_TerneryAtama {
    public static void main(String[] args) {
        // kullanicidan bir sayi alip
        // sayiyi 100 den buyukse degerini 10 azaltin
        // sayi 100 den buyuk degilse degerini 2 katina cikarin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scann.nextInt();

        if (sayi>100)
            sayi -=10;
        else
            sayi*=10;
         // turnery hali
        sayi =sayi >100? sayi-10: sayi*2;


    }
}
