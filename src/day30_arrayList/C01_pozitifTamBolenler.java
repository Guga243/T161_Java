package day30_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_pozitifTamBolenler {
    public static void main(String[] args) {

        // verilen pozitif bir tamsayiyi
        // tam bolebilen tum pozitif sayilari liste olarak bize donduren bir method olusturun

        // ornek input =20;
        // return = [1,2,4,5,10,20]

        System.out.println(getPozitifTamBolenler(20));


    }

    public static List<Integer> getPozitifTamBolenler( int sayi ){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i ==0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}
