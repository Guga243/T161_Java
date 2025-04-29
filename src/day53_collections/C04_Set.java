package day53_collections;

import java.util.HashSet;
import java.util.Set;

public class C04_Set {
    public static void main(String[] args) {

        // matamatikdeki kume gibidir
        // her elemandan sadece 1 tane bulunur
        // index desteklemez

        Set<String> isimler = new HashSet<>();
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("an");
        System.out.println(isimler); //[veli, an, ali]
        isimler.add("kemel");
        // ismin nereye eklenecegini bilemeyiz
        // set index kullanmaz ve siralamayi onemsemez
        System.out.println(isimler); // [kemel, veli, an, ali]

        isimler.add("veli");
        isimler.add("ali");
        System.out.println(isimler); // [kemel, veli, an, ali]
        // eski cani ve veliyi siler yenisini ekler, tekrar etmesine izin vermez


        }
}
