package day18_MethodOlusturma;

import java.util.Scanner;

public class C02_ismiDegistirme {

        //   Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise,
        //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //  - soyisim daha uzun ise,
        //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.

    public static void main(String[] args) {
        // bu gorevi daha once day14 c06 de yaptik
        // orada yazdigimiz kodu method olarak olusturmadigimiz icin
        // icinde oldugumuz bu classdan o kodlari kullanmiyoruz
        // simdi ayni islemi method olarak olusturalim ki
        // bundan sonra ne zaman lazim olursa bundan sonra hazir method kullanalim

        isimDuzenleYazdir();

    }

    public static void isimDuzenleYazdir(){
        Scanner scann = new Scanner(System.in);
        System.out.println("isim gir");
        String isim = scann.nextLine();

        System.out.println("soyisim gir");
        String soyisim = scann.nextLine();

        if ( isim.length() > soyisim.length()){
            // isim daha uzunsa
            //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).toLowerCase()
            );
        } else if (soyisim.length() > isim.length()) {
            // soyisim daha uzunsa
            //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.
            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyisim.toUpperCase()
            );
        }



    }

}
