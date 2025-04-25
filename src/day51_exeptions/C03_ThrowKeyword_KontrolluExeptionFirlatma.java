package day51_exeptions;

import java.util.Random;
import java.util.Scanner;

public class C03_ThrowKeyword_KontrolluExeptionFirlatma {
    public static void main(String[] args) {

        // trows firlatir
        // bir methodda exeption riski bulundugunu
        // ve istenmeyen deger girilirse exeption firlatacagini bildiriir
        // method signaturesine yazilir

        // bir methodda sadece bir throw yazailir
        // virlulle tum exeption'lari yazilabilir

        // throw keyword: bir method icinde istendigi durumda
        // riskli bir kod olmadan exeption firlatmamizi saglar
        // kullanim sebebli:
        // 1- kod icerisinde istenmeyen bir durum oldugunda kodun calimasini durdurmak icin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen yas gir");
        int yas = scann.nextInt();
/*
        if (yas>=0){
            // kodun calismasi icin 300 satir yazmak gerekir
            // ama bu cleam kod acisindan iyi olmaz
            // bunun yerine 1 satir calismaini istedigim kodu buraya yazariz
            System.out.println("10 sene sonra :" +(yas+10)+"yasinda olacaksiniz");
        }else {
            throw new RuntimeException("yas negatif olur mu got");
            // bu satirdan sonrasini calistirma demek istiyorum
        }
        System.out.println("if elsin disi");
        System.out.println("if elsin disi");
        System.out.println("if elsin disi");

        // devaminda 100 satir daha kod var
        // eger kullanici negatif bir sayi girerse sonraki 300 satiri calistirmasin ve
        // kodu calismasini durdursun

 */

        //2 - kodun calismasi durmasin ama kullaniciya guclu uyari verelim
        /*
        try {
            if (yas<0)throw  new IllegalArgumentException("yasin eksi oldugunu nerede gordun");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("try catch'in disi");
        System.out.println("try catch'in disi");
        System.out.println("try catch'in disi");
         */



        //3- belirli satirlarin calistirilmamasini isterseniz
    }
}
