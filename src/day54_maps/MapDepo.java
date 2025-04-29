package day54_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {


       protected static Map<Integer,String> ogrenciMap = new HashMap<>();



static {
    ogrenciMap.put(101, "Ali-Can-11-H-MF");
    ogrenciMap.put(102, "Veli-Cem-10-K-TM");
    ogrenciMap.put(103, "Ali-Cem-11-K-TM");
    ogrenciMap.put(104, "Ayse-Can-10-H-MF");
    ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
    ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
    ogrenciMap.put(107, "Esra-Han-11-M-SOZ");

}

// tum ogrencilerin soyisimlerini yazdiran bir method yapalim

    protected static void tumSoyIsimleriYazdir(){
    //1.adim tum keyleri kaydedin
        Set<Integer>tumOgrenciNoSeti =ogrenciMap.keySet(); // [101,102,103,104,105,106,107]
    // 2- her bir key'i tek tek ele alip o key'e ayit value ulasalim

        System.out.println("tum ogrencilerin soyisimleri : ");

        for (Integer eachKey :tumOgrenciNoSeti){

            //3.adim
            // eachKey bize her bir key'i getirecek
            // bizde o key'e a't value'i kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // "Veli-Cem-10-K-TM" getirdi diyelim

            //4.adim
            // bilgilere ulasabilmek icin valuyu siplit edelim
            String [] eachValueArray = eachValue.split("-"); // [Veli, Cem, 10, K, TM]

            // 5. adim
            // istenen bilgiyi yazdirin
            System.out.print(eachValueArray[1] + ", ");


        }
        System.out.println();



    }

    // tum ogrenci no ve isim ve soyisim yazdiran method olusturun
    protected static void tumOgrencilerinNoIsimSoyIsimYazdir() {
        //1.adim tum keyleri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet(); // [101,102,103,104,105,106,107]
        // 2- her bir key'i tek tek ele alip o key'e ayit value ulasalim

        System.out.println("tum ogrencilerin nolari isim ve soyisimleri : ");

        for (Integer eachKey : tumOgrenciNoSeti) {

            //3.adim
            // eachKey bize her bir key'i getirecek
            // bizde o key'e a't value'i kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // "Veli-Cem-10-K-TM" getirdi diyelim

            //4.adim
            // bilgilere ulasabilmek icin valuyu siplit edelim
            String[] eachValueArray = eachValue.split("-"); // [Veli, Cem, 10, K, TM]

            // 5. adim
            // istenen bilgileri yazdirin

            System.out.print(eachKey + " " + eachValueArray[0] + " " + eachValueArray[1]);
        }



    }
    protected static void numaraAraligindekiOgrenciBilgilerniYazdir(int baslangicNo, int bitisNo){

        //1.adim tum keyleri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet(); // [101,102,103,104,105,106,107]

        // 2- her bir key'i tek tek ele alip o key'e ayit value ulasalim
        System.out.println("verilen aralikdeki ogrenci bilgileri : ");

        for (Integer eachKey : tumOgrenciNoSeti) {

            //3.adim
            // eachKey bize her bir key'i getirecek
            // bizde o key'e a't value'i kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // "Veli-Cem-10-K-TM" getirdi diyelim

            //4.adim
            // bilgilere ulasabilmek icin valuyu siplit edelim
            String[] eachValueArray = eachValue.split("-"); // [Veli, Cem, 10, K, TM]

            // 5. adim
            // istenen bilgileri yazdirin

           if (baslangicNo<eachKey && eachKey<=bitisNo){
               System.out.println(eachKey +
                       " "+eachValueArray[0] + " "+
                       eachValueArray[1]+" "+eachValueArray[2]+" "+eachValueArray[3]);
           }

        }
    }


    }

