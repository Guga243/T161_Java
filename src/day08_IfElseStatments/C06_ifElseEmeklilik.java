package day08_IfElseStatments;

import java.util.Scanner;

public class C06_ifElseEmeklilik {
    public static void main(String[] args) {
        // kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scann.nextDouble();

        if (yas>=65){
            System.out.println("hadi kurtuldun EMEKLISIN ");
        }else{
            System.out.println("Calismaya devam : "+ (65-yas)+" "+"yil daha calismalisin");
        }
    }
}
