package day10_nestedIfElse_Ternary;

import java.util.Scanner;

public class C03_TernaryOperatoru {
    public static void main(String[] args) {

        // kullanicidan bir sayi aliniz
        // sayi cift ise "cift yazdirin
        // sayi sift degilse "tek yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scann.nextInt();

        if (sayi%2 ==0)
            System.out.println("cift sayi");
        else
            System.out.println("tek sayi");

        // ternary operatoru , if else ile yapilabilen basit islemleri
        // daha kisa ve daha basit sekilde yazmamiza imkan tanir

        System.out.println((sayi%2 ==0)? "cift sayi" : "tek sayi");




    }
}
