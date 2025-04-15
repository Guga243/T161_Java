package day09_ifElseIfStatements_NestedElse;

import java.util.Scanner;

public class C07_NestedIfElse_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan cinsiyetini ve yasini alin
        // kadin, 60 yas ve uzeri erkek 65 yas ve uzeri emekli olabilir
        // cinsiyet ve yasini dikkate alarak " emekli olabilirsin yazdirin
        // veya emekli olmak icin ... yil daha calismalisin yazdirin
        // kullanici 15 den kucuk 80 den buyuk yas degeri girerse
        // hata mesaji verirniz
        // k veya e karakter disinda birsey girerse de hata verin

        Scanner scann= new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz");
        double yas = scann.nextDouble();

        System.out.println("lutfen cinsiyetinzi giriniz");
        char cinsiyet = scann.nextLine().toUpperCase().charAt(0);

        /*
        eger bir if else de birden fazla degisken varsa
        nested (ic ice demek) if else kullanilabilir

        nested if else icin
        1-once hangi degiskeni ana degisken yapacaginiza karar verin
        2- sanki sadece ana degisken varmis gibi bir if - else if olusturun
        3- artik gruplara ayirdigimiz icin her bolgede o bolgeye gore 2.degiskene bagli
        if -else olusturun
         */

        // cinsiyet ana degisken olsun
        if (cinsiyet=='K'){

            // bu bolgede sadece kadin var ve yasa bagli  bir if - else olusturalim
            if (yas<15 || yas>80)
                System.out.println("girdiginiz yas fazla veya az, hatali");
            else if (yas>=60)
                System.out.println("emeklisiniz");
            else
                System.out.println("daha "+(60-yas)+" yil daha calismalisin");

        } else if (cinsiyet=='E') {

            // bu bolgede sadece erkek var
            if (yas<15 || yas>80)
                System.out.println("girdiginiz yas fazla veya az, hatali");
            else if (yas>=65)
                System.out.println("emeklisiniz");
            else
                System.out.println("daha "+(65-yas)+" yil daha calismalisin");

        }else
            System.out.println("hatali cinsiyet");
    }
}