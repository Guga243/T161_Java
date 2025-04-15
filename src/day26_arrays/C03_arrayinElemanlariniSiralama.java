package day26_arrays;

import java.util.Arrays;

public class C03_arrayinElemanlariniSiralama {
    public static void main(String[] args) {

        int [] sayilar ={3,1,9,6,0,12,67,3,8,};
        String [] isimler ={"mert","guga","hugo","kivanc"};

        // verilen arrayleri elemanlari kucukten buyuge dogru sirali hale getirin

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); //[0, 1, 3, 3, 6, 8, 9, 12, 67]

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); //[guga, hugo, kivanc, mert]
        // atama yapmadigimiz halde arralerde method ile yapilan degisiklikler
        // kalici olur
        // aski degere gore siralar yani buyuk harflerin ascii degeri kucuk oldugundan
        // kucuk harf ve alfabeye
        // natural order

    }
}
