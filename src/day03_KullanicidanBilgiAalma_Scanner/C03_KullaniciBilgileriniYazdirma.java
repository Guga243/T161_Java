package day03_KullanicidanBilgiAalma_Scanner;

import java.util.Scanner;

public class C03_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen Isminizi giriniz");
        String girilenIisim = scann.nextLine();

        System.out.println("lutfen soyisim giriniz");
        String girilenSoyIsim = scann.nextLine();

        System.out.println("Lutfen Yasinizi giriniz");
        int girilenYas = scann.nextInt();

        System.out.println(
                "\nisminiz :"+girilenIisim+
                "\nsoyisminiz :"+girilenSoyIsim+
                "\nyasiniz"+girilenYas+
                        "\nKaydiniz basariyla tamamlanmistir");



    }
}
