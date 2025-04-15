package day12_stringManipilation;

import java.util.Scanner;

public class C05_contains_Soru {
    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metin ev iceriyorsa "Ev gibisi var mi?",
        // metin is iceriyorsa "Calismak ne guzel",
        // metin hem ev hem is iceriyorsa "Evden calismak gibisi yok"
        // metin bu iki kelimeyi de icermiyorsa "Cok calismak lazim, coook" yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scann.nextLine();

        if(metin.contains("ev") && metin.contains("is")){
            System.out.println("evden calismak gibisi yok");
        } else if (metin.contains("ev"))
            System.out.println("ev gibisi yok");
        else if (metin.contains("is"))
            System.out.println("calismak gibisi yok");
        else
            System.out.println(" cok calismak lazim cok");



    }
}
