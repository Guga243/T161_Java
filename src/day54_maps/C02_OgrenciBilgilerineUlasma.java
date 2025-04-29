package day54_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_OgrenciBilgilerineUlasma {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);

        // 103 no'nun valusu yazdirin
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        // kaydedin
        String orenci103Value = ogrenciMap.get(103);



        String orenci103ValueArr[] = orenci103Value.split("-"); //[ali, cem, 11, k,tm]
        System.out.println("orenci 103 soyisim :" +orenci103ValueArr[1]); // orenci 103 soyisim :Cem



    }
}
