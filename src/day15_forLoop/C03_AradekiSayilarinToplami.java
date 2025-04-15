package day15_forLoop;

import java.util.Scanner;

public class C03_AradekiSayilarinToplami {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse,
        //        uyari yazdirip islemi sonlandirin

        Scanner scann = new Scanner(System.in);

        System.out.println("lutfen baslangic degerini giriniz");
        int baslangic = scann.nextInt();

        System.out.println("lutfen bitis degerinin giriniz");
        int bitis = scann.nextInt();

        int toplam =0;

        if (bitis<baslangic){
            System.out.println("bitis baslangictan kucuk olmaz");

        } else{
            for (int i = baslangic; i <=bitis; i++) {
                toplam+=i;
            }
        }
        System.out.println("aradeki sayilarin toplami"+toplam);

    }
}
