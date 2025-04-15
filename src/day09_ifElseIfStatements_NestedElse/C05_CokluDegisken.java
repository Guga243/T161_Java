package day09_ifElseIfStatements_NestedElse;

import java.util.Scanner;

public class C05_CokluDegisken {
    public static void main(String[] args) {
        // kullanicidan cinsiyetini ve yasini alin
        // kadin, 60 yas ve uzeri erkek 65 yas ve uzeri emekli olabilir
        // cinsiyet ve yasini dikkate alarak " emekli olabilirsin yazdirin
        // veya emekli olmak icin ... yil daha calismalisin yazdirin
        // kullanici 15 den kucuk 80 den buyuk yas degeri girerse
        // hata mesaji verirniz
        // k veya e karakter disinda birsey girerse de hata verin

        Scanner scann= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinzi giriniz");
        char cinsiyet = scann.nextLine().toUpperCase().charAt(0);

        System.out.println("yasinizi giriniz");
        double yas = scann.nextDouble();

        if (yas<15 || yas>80 || !(cinsiyet=='E' || cinsiyet=='K')) {
            System.out.println("girdiginiz deger uygun degildir");
        } else if (cinsiyet =='K' && yas>60)
            System.out.println("kadin ve 60 dan fazla emekli olabilirsin");
        else if (cinsiyet=='K' && yas<60)
            System.out.println("kadin ve 60 dan kucuk " +(60-yas)+" yil daha calismalisin");
        else if (cinsiyet =='E' && yas>65)
            System.out.println("erkek ve 65 dan fazla emekli olabilirsin");
        else if (cinsiyet=='E' && yas<65)
            System.out.println("erkek ve 66 dan kucuk " + (65-yas) + " yil daha calismalisin");




    }
}
