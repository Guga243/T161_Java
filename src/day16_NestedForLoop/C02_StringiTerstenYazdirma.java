package day16_NestedForLoop;

import java.util.Scanner;

 public class C02_StringiTerstenYazdirma {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        // orn input : Sabri output : irbaS

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin= scann.nextLine();

        System.out.print("girilen metnin tersten yazilisi : ");

        for (int i = metin.length()-1; i >=0; i--) {
            System.out.println(metin.charAt(i));

        }


    }
}
