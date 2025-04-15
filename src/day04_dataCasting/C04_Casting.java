package day04_dataCasting;

import java.util.Scanner;

public class C04_Casting {
    public static void main(String[] args) {

        // kullanicidan iki tam sayi alin
        // birinci sayiyi 2.sayiya bolup
        // bolme isleminin sonucunu yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int sayi1 = scann.nextInt();
        int sayi2 = scann.nextInt();

        System.out.println("1.sayi bolu 2.sayi = "+(sayi1/sayi2));

        // java iki tam sayiyi bolerse sonucuda tam sayi olarak verir

        //girilen iki sayiyi bir birine bolup sonucu
        // ondalikli olarak yazdirin

        double sonuc = sayi1/sayi2;
        System.out.println(sonuc);//3.0

        double sonuc2 = (double) sayi1/sayi2;
        System.out.println(sonuc2);//3.7


    }
}
