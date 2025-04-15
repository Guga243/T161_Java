package day03_KullanicidanBilgiAalma_Scanner;

import java.util.Scanner;

public class C05_KullaniciBilgileriniYazidirma {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44


        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen Isminizi giriniz");
       char isminIlkHarfi = scann.nextLine().charAt(0);
       // kullanicidan metin degeri alinacaksa
        //scanner.nextline() kullanabiliriz

        //eger kullanicidan tek bir karakter alacaksak
        //scanner.nextChar olmadigi icin
        // scanner.nextLine ile tum metni alip
        // o metnin ilk harfini charAt(0) ile alinabilir

        //ONEMLI NOT: eger kullanicidan birden fazla metin degeri
        //alacaksak scanner.nextLine kullanma onerilir

        //eger ilk degeri scanner.next ile sonraki dgeeri
        //scannerNextLine ile alirsaniz sorun yasar

        System.out.println("lutfen soyisim giriniz");
        String girilenSoyIsim = scann.nextLine().toUpperCase();

        System.out.println("Lutfen Yasinizi giriniz");
        int girilenYas = scann.nextInt();

        System.out.println("girilen Bilgiler: "+isminIlkHarfi+" "+girilenSoyIsim+" "+girilenYas);
    }
}
