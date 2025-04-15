package day03_KullanicidanBilgiAalma_Scanner;

import java.util.Scanner;

public class C04_DikdortgeninAlaniniYazdirma {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin 2 kenar
        // uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen 1.kenar uzunlugunu giriniz");
        int birinciKenar = scann.nextInt();

        System.out.println("Lutfen 2.kenar uzunlugunu giriniz");
        int ikinciKenar = scann.nextInt();

        System.out.println("dikdortgen alani :"+(birinciKenar*ikinciKenar));

    }
}
