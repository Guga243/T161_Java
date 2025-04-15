package day03_KullanicidanBilgiAalma_Scanner;

import java.util.Scanner;

public class C06_Swap_YerDegistirme {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap).

        int bos=0;

        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen ilk tam sayi giriniz");
        int sayi1  = scann.nextInt();

        System.out.println("lutfen 2.tam sayi giriniz");
        int sayi2 = scann.nextInt();

        bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;
        System.out.println("1.tam sayi : "+sayi1+ "sayi 2 degeri: "+sayi2);

        // bos kova olmadan veriablenin yerini degistirin


    }
}
