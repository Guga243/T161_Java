package day14_stringMonipulation;

import java.util.Scanner;

public class C03_IsmiDegistirme {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve 16 haneli kredi karti numarasini alin
        // bilgileri asagidaki gibi yazdirin
        // Girilen isim-soyisim : C** D****,
        // Kredi kart numarasi  : **** **** **** 4567

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = scann.nextLine();

        System.out.println("lutfen soyisim giriniz");
        String soyisim = scann.nextLine();

        System.out.println("lutfen 16 haneli kart no giriniz");
        String kartNo = scann.nextLine();

        System.out.println("Girilen isim-soyisim :"+
                isim.substring(0,1).toUpperCase()+ // ismin ilk harfini alip buyuk harfe cevirdi
                isim.substring(1).replaceAll("\\w","*")+// ilk harften itibren harflerin yerine *
                " "+ // isim soyisim arasindeki bosluk
                soyisim.substring(0,1).toUpperCase()+// soysim ilk harfi buyuk harf yaptik
                soyisim.substring(1).replaceAll("\\w","*" )+
                ",\n"+ // virgul yazdirip, alt satira gecmesini \n ile sagladik
                "Kredi kart numarasi  : **** **** **** 4567"+
                kartNo.substring(kartNo.length()-4));



    }
}
