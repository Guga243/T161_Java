package PracticeLessons;

import java.util.Scanner;

public class P03_KullancidanDegerAlma {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String name = scann.nextLine();
        System.out.println("Lutfen soyisim giriniz");
        String soyIsim = scann.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int age = scann.nextInt();

        System.out.println("-------Kullanici Bilgileri-------");
        System.out.println("Adi : "+ name);
        System.out.println("Soyadi : "+soyIsim);
        System.out.println("yasi : "+age);
        // bulundugun satiri bir alta kopyalamak icin
        //WIN--> CTRL+D   MAC---> CMD+D


    }
}
