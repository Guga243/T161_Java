package day14_stringMonipulation;

import java.util.Scanner;

public class C07_MetniDegistirme {
    public static void main(String[] args) {
        // kullanicidan bir Sring sayi isteyin
        //String'in uzunlugu cift sayi ise tam ortasina :) ekleyin
        //String uzunlugu tek sayi ise ortadeki harfi silin ve yerine :( ekleyin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scann.nextLine();

        int uzunluk = metin.length();

        if (uzunluk%2==0){
            //ismin uzunlugu cift sayi
            //tam ortasina :)ekleyin
            System.out.println(metin.substring(0,uzunluk/2)+
                    ":)"+ metin.substring(uzunluk/2));

        }else {
            //ismin uzunlugu tek sayi
            //ortasina harfi silin ve yerine :( yazdirin
            System.out.println(metin.substring(0,uzunluk/2)+
                    ":)"+
                    metin.substring(uzunluk/2+1));

        }

    }
}
