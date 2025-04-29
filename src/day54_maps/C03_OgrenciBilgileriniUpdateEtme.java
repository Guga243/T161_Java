package day54_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_OgrenciBilgileriniUpdateEtme {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        // 102 no ogrencinin sinifini 11 / M yapin



        // mape islemleri kademelendirelim
        // once 102 ogenci sinif ve subesine nasil ulasabilirim

        //1- 102 valusunu kaydedilem

        String ogrenci102Value = ogrenciMap.get(102); // "Veli-Cem-10-K-TM"

        //2- value bir bilgiler butunu oldugundan bilgilere ulasmak icin split yapmaliyiz
        String[] ogrenci102ValueArrayi = ogrenci102Value.split("-"); // [Veli, Cem, 10, K, TM]

        //3- istenen update arrayde yapalim
        ogrenci102ValueArrayi[2] ="11";
        ogrenci102ValueArrayi[3]="M";

        //4- biz arrayi update ettik, bizden istenen  map'i update isteyin
              // bunun icin arrayi yeniden yeni value olarak kaydedelim

        String yeniValue = String.join("-",ogrenci102ValueArrayi);
        System.out.println(yeniValue);

        //5- yeniValue ile mapde  102 no'lu update edelim
        ogrenciMap.put(102,yeniValue);
        // ogrenciMap.replace(102,yeniValue);  ikiside olur

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-11-M-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ}





    }
}
