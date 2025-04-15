package day19_methodOlusturma;

import java.util.Scanner;

public class C04_VucutKitleEndeksiHesapla {
    public static void main(String[] args) {

        System.out.println(VucutKitleEndexiHesapla());

    }


    // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
    // ve sonuu donduren bir method olusturun
    //         kilo*10000 / (boy *boy)

    public static double VucutKitleEndexiHesapla(){
        Scanner scann = new Scanner(System.in);
        System.out.println("kilonuzu giriniz");
        double kilo = scann.nextDouble();

        System.out.println("boyunuzu giriniz");
        double boy = scann.nextDouble();
        return   kilo*10000 / (boy *boy);
    }
}
