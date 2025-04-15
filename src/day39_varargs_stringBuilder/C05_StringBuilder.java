package day39_varargs_stringBuilder;

import day33_parametreliKonstructor.C01_araba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_StringBuilder {
    public static void main(String[] args) {

        String str = "Java Candir";

        Scanner scann = new Scanner(System.in);

        List<Integer> liste = new ArrayList<>();

        LocalDate tarih = LocalDate.now();

        LocalDate date2 = LocalDate.of(2025,9,23);

        /*
        string deger atamanin kolay olmasi acisindan cok kullanilislidir
        ancaaak String immutable oldugundan dolayi
        her yeni  deger atandigindan eski obje cope gider ve yeni obje olusturur
        bu durum cok data kullanim uygulamalar icin negativ bir sonuc olusturur

         */

        StringBuilder sb = new StringBuilder("java guzeldir");

        StringBuffer sbf = new StringBuffer("hem de cok guzeldir");




    }
}
