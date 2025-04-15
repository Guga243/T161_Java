package day31_forEachLoop;

import java.util.ArrayList;
import java.util.Scanner;

public class C04_Costructor {

    static String isim ="ali";
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        ArrayList<String>isimler = new ArrayList<>();

        C04_Costructor obj = new C04_Costructor();
        // clas ismi obje ismi atama isareti keyword constructor
        // bir class dan bir obje olusturmak istiyrosaniz ve ilk deger atamak  bir construkter calismasi gerekiyir

        System.out.println(isim);
    }
}
