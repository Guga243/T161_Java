package day56_nestedMap;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMapOlusturma {
    public static void main(String[] args) {

        /*
        map olusturmaya baslamadan once :

        1- hangi bilgiler tutulacak?
        numara, isim , osyisim, sinif, sube , bolum

        2-hangi bilhi Key olacak?
        uniqe olacak bir bilgi ogrenci numarasi key olsun

        3- kalan bilgileri nasil tek bir value haline getirilecek?
        kalan bilgileri inner bir map olarak olusturacagiz
        {isim =ali, soyisim =can, sinif=10, sube=H, bolum=MF}






         */
        Map<Integer,Map<String,String > > orenciNestedMap = new HashMap<>();

        // orenciNestedMape bir ogrenci ekleyebilek icin once o ogrencinin
        // value mapini olusturmaliyiz

        Map<String,String> ogrenci101ValueMap = new HashMap<>();
        ogrenci101ValueMap.put("isim","Ali");
        ogrenci101ValueMap.put("soyisim","Can");
        ogrenci101ValueMap.put("sinif","11");
        ogrenci101ValueMap.put("sube","H");
        ogrenci101ValueMap.put("bolum","MF");

        orenciNestedMap.put(101,ogrenci101ValueMap);
        System.out.println("   ");

        Map<String,String> ogrenci102ValueMap = new HashMap<>();
        ogrenci102ValueMap.put("isim","Veli");
        ogrenci102ValueMap.put("soyisim","Cem");
        ogrenci102ValueMap.put("sinf","10");
        ogrenci102ValueMap.put("sube","K");
        ogrenci102ValueMap.put("bolum","TM");

        orenciNestedMap.put(102,ogrenci102ValueMap);


        /*
         ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
         */

        System.out.println(orenciNestedMap);
        // {101={sube=H, soyisim=Can, sinf=11, bolum=MF, isim=Ali},
        // 102={sube=K, soyisim=Cem, sinf=10, bolum=TM, isim=Veli}}


        // 101 no ogrenincinin sinifini yazdirn
        // once ogrenci nested mapden 101 no ogrencinin valusunu alip
        // onun icinden de ogrencinin sinfini alacaz

        System.out.println(orenciNestedMap.get(101).get("sinif"));// 11

        // 102 numarali ogrencinin soyisimini yazdirin
        System.out.println(orenciNestedMap.get(102).get("soyisim")); // cem

        // 101 numarali ogrwencinin subeyi p yapin
        System.out.println(orenciNestedMap.get(101));
        // {sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali}

        orenciNestedMap.get(101).put("sube","P");
        System.out.println(orenciNestedMap); // p


    }
}
