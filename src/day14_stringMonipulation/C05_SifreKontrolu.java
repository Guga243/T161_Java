package day14_stringMonipulation;

import java.util.Scanner;

public class C05_SifreKontrolu {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriiz");

        String sifre = scann.nextLine();
        int flag =10; // FLUG DEGERININ ONEMI YOK HER HATADA BIR(AYNI) KERE DEGER ATTIRACAZ

        /*
        tum hatalari yazdirmami istediginden bagimsiz if cumleleri kullanmaliyiz

        bagimsiz if  cumlelerinde
        bagimsiz  tum tum sartlar saglandiginda konrtol edebilmek icin
        FLAG VEYA SAYAC KULLANALIM

         */
        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0); // ILK HARF KAYDEDILDI

        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("ilk harf kucuk olmali");
            flag=11;
        }

        //          - son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);  // SON KARAKTER KAYDEDILDI

        if (sonKarakter < '0' || sonKarakter>'9'){
            System.out.println("son karakter rakam olmali");
            flag=11;
        }
        //                - sifre bosluk icermemeli

        if (sifre.contains(" ") ){
            System.out.println("sifre bosluk icermemeli");
            flag=11;
        }
        //              - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
            System.out.println("- uzunlugu en az 10 karakter olmali");
            flag=11;

        }
        /*
        flug 10 veya 11 degerini alabilir
        flug ==10 ise hicbir hata mesaji yazdirmadi
        flug == 11 ise hata mesaji yazdirldi ama kac mesaj mesaj yazdirildigini bilemmeyiz
         */

        if (flag==10)
            System.out.println("sifre basari ile kaydedildi");

    }
}
