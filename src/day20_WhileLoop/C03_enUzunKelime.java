package day20_WhileLoop;

import java.util.Scanner;

public class C03_enUzunKelime {
    public static void main(String[] args) {
        // asagidaki gorevi yapan bir method olusturun
        // kullanicidan istedigi kadar isim girmesini isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir (q veya Q olabilir)
        // (ilk harfi q olan bir kelime degil sadece q'ya basmali
        // girilen her ismin uzunlugunu kontrol edin ve
        // islem bitirildiginde en cok harfe sahip olan (en uzun) ismi yazdirin
        // esit sayida harfe sahip isimlerden herhangi biri olabilir



        Scanner scann = new Scanner(System.in);

        String girilenIsim ="";
        String enUzunIsim ="";

        while (!girilenIsim.equalsIgnoreCase("Q")){
            System.out.println("lutfen bir isim giriniz \nBitirmek icin Q'a basiniz");
            girilenIsim= scann.nextLine();

            if (girilenIsim.length()>enUzunIsim.length()){
                enUzunIsim=girilenIsim;
            }

        }
        System.out.println("girilen en uzun isim : "+girilenIsim);
    }

    public static void enUzunIsmiYazdir() {
        Scanner scann = new Scanner(System.in);

        String girilenIsim = "";
        String enUzunIsim = "";

        while (!girilenIsim.equalsIgnoreCase("Q")) {
            System.out.println("lutfen bir isim giriniz \nBitirmek icin Q'a basiniz");
            girilenIsim = scann.nextLine();

            if (girilenIsim.length() > enUzunIsim.length()) {
                enUzunIsim = girilenIsim;
            }

        }
    }






}
