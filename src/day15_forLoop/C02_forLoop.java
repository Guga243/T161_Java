package day15_forLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        // iki basamakli 5 ile bolunebilen sayilarin toplamini yazdirin
        int toplam =0;

        for (int i = 10; i <100 ; i+=5) {

            toplam+=i;
        }
        System.out.println(toplam);

        // kullanicidan baslangic ve bitis degerlerini alip
        // sinirlar ve aralarindeki sayilardan 5 ile bolunebilenleri toplayin
        // ve toplami yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen baslangic degerini giriniz");
        int baslangic = scann.nextInt();

        System.out.println("lutfen bitis degerinin giriniz");
        int bitis = scann.nextInt();

        toplam =0;

        for (int i = baslangic; i <bitis ; i++) {

            if ( i% 5 ==0){
                toplam+=i;

            }

        }
        System.out.println(" 5'e bolunenler : "+toplam);

    }
}
