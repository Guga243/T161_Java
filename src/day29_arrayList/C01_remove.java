package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_remove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("a", "d", "r", "t", "a", "g", "l", "d", "r", "t", "a"));

        harfler.remove("a");
        harfler.remove(2);
        System.out.println(harfler);

        System.out.println(harfler.remove("k")); // false
        System.out.println(harfler.remove("r")); // true
        System.out.println(harfler); //[d, a, g, l, d, r, t, a]

        System.out.println(harfler.remove(1));
//        System.out.println(harfler); //[d, g, l, d, r, t, a]

        // elemanlar int olursa eleman mi index mi nasil anlayacak


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 4, 6, 7, 8, 9, 6));
        System.out.println(sayilar); //[2, 4, 6, 7, 8, 9, 6]

        sayilar.remove(2);
        System.out.println(sayilar); //[2, 4, 7, 8, 9, 6] 2'i degil index olarak kabul eder

        System.out.println(sayilar.remove(1));// 4
        System.out.println(sayilar); //[2, 7, 8, 9, 6]

        // illa da eleman olan 8'i silmek isterseniz

        Integer silinecekSayi = 8;
        sayilar.remove(silinecekSayi);
//        System.out.println(sayilar); //[2, 7, 9, 6]

    }
}
