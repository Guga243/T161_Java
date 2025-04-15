package day11_switchStatement_StringManipulation;

import java.util.Scanner;

public class C08_Sm_Length {
    public static void main(String[] args) {

        String str ="Ali Cemil Yataruyumazoglugillerden";
        System.out.println(str.length()); // str deki karakter sayisini verir 25

        // son karakteri yazdirin
       // System.out.println(str.charAt(25-1)); // dinamik degil

        // dinamik olmasi icin
        System.out.println(str.charAt(str.length()-1));

        // kullanicidan isminin isteyin
        // ismin ilk ve son harflerini yan yana yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen isiminizi giriniz");
        String isim = scann.nextLine();

        System.out.println(""+str.charAt(0)+str.charAt(str.length()-1));
        // 'm' + 'n' iki cahar yan yana geldiginde askii tablosuna gore hsaplar ve sayisal deger veirir onune bosluk
        // koymaniz lazim

        //System.out.println(isim.charAt(isim.length()));// hata verir

    }
}
