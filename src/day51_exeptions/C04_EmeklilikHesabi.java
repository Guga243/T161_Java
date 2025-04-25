package day51_exeptions;

import java.util.Scanner;

public class C04_EmeklilikHesabi {
    public static void main(String[] args) {

        // Kod'un herhangi bir satirinda kontrollu olarak exception firlatilabilir
        // Kontrollu bir sekilde baska bir bolume gecis veya
        // kullaniciya istenen mesaji iletme olabilir
        // kullanicidan yasini, cinsiyetini ve uyrugunu isteyin
        // Yasi 60 ve 75 arasi olan (sinirlar dahil)
        // cinsiyeti E veya K
        // uyrugu TC olanlar emekli olabilirler.
        // bilgileri alirken bir bilgi istenmeyen sekilde ise
        // hemen emekli olamazsin yazdirsin, diger bilgileri istemesin


        Scanner scann = new Scanner(System.in);

        try  {
            System.out.print("Yaşınızı giriniz: ");
            int yas = scann.nextInt();

            if (yas < 60 || yas > 75) {
                throw new Exception("Yaş aralığı 60 ile 75 arasında olmalıdır");
            }
            scann.nextLine();
            System.out.print("Cinsiyetinizi giriniz (E/K): ");
            String cinsiyet = scann.nextLine();
            if(!(cinsiyet.equalsIgnoreCase("e") || cinsiyet.equalsIgnoreCase("k"))){
                throw new Exception("cinsiyet gecersiz");
            }
            System.out.print("Uyruk giriniz (TC/YD): ");
            String uyruk = scann.next().toUpperCase();
            if (!uyruk.equals("TC")) {
                throw new Exception("Uyruk uygun değil");
            }
            System.out.println("Tebrikler! Emekli olabilirsiniz.\n" + "Yaşınız " + yas + "\n" + "Cinsiyet " + cinsiyet + "\n" + "Uyruk " + uyruk);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("kod normal olarak calismaya devam eder");
    }
}
