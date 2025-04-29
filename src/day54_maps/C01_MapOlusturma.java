package day54_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MapOlusturma {
    public static void main(String[] args) {


        // map olusturmadan once bazi seyleri netlestirmek gerekir
        // 1- tutulacak bilgiler icinde key hangisi olacak? (ogrenci no)
        // 2- value olarak hangi bilgiler olacak? (isim, soyisim, sinif, sube, bolum)
        // 3- bu bilgiler standart olarak nasil tek bir valu haline getirlecek?
        //      bilgiler aralarinda - olacak sekilde bir String olarak birlstirlecek
        //      bilgi siralamasi ("isim-soyisim-sinif-sube-bolum")

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ}

        // mapin eleman sayisi kac
        System.out.println(ogrenciMap.size());// 7

        // ogrenci numaralarini yazdirin
        System.out.println(ogrenciMap.keySet());// [101, 102, 103, 104, 105, 106, 107]

        // numarası 105'den büyük olan öğrenci numaralarını yazdırın
        for (int each : ogrenciMap.keySet()){
            if (each >105){
                System.out.print(each +" ");

                System.out.println("");

                // mapdeki ogrencilerin numaralari olmadan sadece valulaerini yazdirin
                System.out.println(ogrenciMap.values());
                // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM,
                // Ali-Cem-11-K-TM, Ayse-Can-10-H-MF,
                // Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

                // ogrenci numaralarini bir set olarak kaydedin

                Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();

                // ogrencilerin sdece valuelerini kaydedin
                Collection<String> ogrenciValueCollection = ogrenciMap.values();

                // mapde 102 numarasina sahip bir ogrenci var mi?
                System.out.println(ogrenciMap.containsKey(102)); // true
                System.out.println(ogrenciMap.containsKey(110)); // false

                // ismi ali olan ogrenci var mi
                // her bir elemanin bir key bir valuesi bulunur ve value'su sadece ali
                // olan bir eleman yok


                // // bilgileri [Ali-Can-11-H-MF var mi
                System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true

                // value icin birlestirip tek bir string yaptik



            }
        }










    }
}
