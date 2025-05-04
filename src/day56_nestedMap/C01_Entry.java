package day56_nestedMap;

import day54_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_Entry extends MapDepo {
    public static void main(String[] args) {

        System.out.println(ogrenciMap);

        //{101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ}

        System.out.println(ogrenciMap.size()); // 7

        /*
        ogrenci mapinde 7 eleman var amma her bir elemanin key'i ve value'si ayri ayri

         ogrenci mapindeki elamanlarin  1, 3 , 5 gibi index'de olanlari yazdirin

         map index kullanmaz dolaysiyla mepden index ile eleman cagirilmaz

         daha onceki gorevlerde mapdeki her bir elemana ulasmak icin keyset ile keyleri alip
         sonra for each loop ile herbir eachkey'yi ele alip
         o key'e ait value'yu cagirip
         key ve valu'yu ayri ayri yonettik

         eger
         key ve valueiyu bırlıkte kullanmak ıstersenız javanın olusturdugu
         entry<> classini kullanabiliriz

        */

        Set<Map.Entry<Integer,String >> ogrenciEntrySeti = ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);
        // [101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ]

        // gorunuste Map ile EntrySet arasinda tek fark {} yerine[] gelmesi gibi goruksede
        // en buyuk 2 fark
        //1- map key ve valuyu ayri ayri tutarken entry ikisini de ayni tutar
        //2- entry bir set olarak kaydedebildigimiz icin
        // for each loop kullanarak
        // tum key ve value'leri elden gecirebilriz

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti){
            System.out.println(eachEntry);
            /*
            101=Ali-Can-11-H-MF
102=Veli-Cem-10-K-TM
103=Ali-Cem-11-K-TM
104=Ayse-Can-10-H-MF
105=Sevgi-Cem-11-M-TM
106=Sevgi-Can-10-K-MF
107=Esra-Han-11-M-SOZ
             */


        }
//        // value'deki tum bilgileri buyuk harfe cevirin
        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti) {

            String eskiValue = eachEntry.getValue();
            String yeniValue =eskiValue.toUpperCase();
            eachEntry.setValue(yeniValue);

        }
        /*
        entry kullaninca
        entry ile gelen getKey () getValue() ile entry'e ait key ve value'i goruntuluyebilir
        // setValue(yeniValue) ile orenciMapini kullanmadan orenci mapi update
        yapabilriz
         */
        System.out.println(ogrenciMap);
        //{101=ALİ-CAN-11-H-MF,
        // 102=VELİ-CEM-10-K-TM,
        // 103=ALİ-CEM-11-K-TM,
        // 104=AYSE-CAN-10-H-MF,
        // 105=SEVGİ-CEM-11-M-TM,
        // 106=SEVGİ-CAN-10-K-MF,
        // 107=ESRA-HAN-11-M-SOZ}
    }
}
