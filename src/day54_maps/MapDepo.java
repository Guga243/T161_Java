package day54_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {


    protected static Map<Integer, String> ogrenciMap = new HashMap<>();


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

    protected static void tumSoyIsimleriYazdir() {
        //1.adim tum keyleri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet(); // [101,102,103,104,105,106,107]
        // 2- her bir key'i tek tek ele alip o key'e ayit value ulasalim

        System.out.println("tum ogrencilerin soyisimleri : ");

        for (Integer eachKey : tumOgrenciNoSeti) {

            //3.adim
            // eachKey bize her bir key'i getirecek
            // bizde o key'e a't value'i kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // "Veli-Cem-10-K-TM" getirdi diyelim

            //4.adim
            // bilgilere ulasabilmek icin valuyu siplit edelim
            String[] eachValueArray = eachValue.split("-"); // [Veli, Cem, 10, K, TM]

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

    protected static void numaraAraligindekiOgrenciBilgilerniYazdir(int baslangicNo, int bitisNo) {

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

            if (baslangicNo < eachKey && eachKey <= bitisNo) {
                System.out.println(eachKey +
                        " " + eachValueArray[0] + " " +
                        eachValueArray[1] + " " + eachValueArray[2] + " " + eachValueArray[3]);
            }

        }
    }


    // ttum ogrencilerin isimlerinin ilk harfleri buyuk kalani kucuk
    // soyisimlerinnin tamamini buyuk harf olacak sekilde update edin

    protected static void tumIsimVeSoyisimleriDuzenle() {

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
            // istenen update'i yapin

            String eskiIsim = eachValueArray[0];
            String eskiSoyisim = eachValueArray[1];

            String yeniIsim = eskiIsim.substring(0, 1).toUpperCase() +
                    eskiIsim.substring(1).toLowerCase();

            String yeniSoyisim = eskiSoyisim.toUpperCase();

            // arrayi'i yeni isimlerle update edelim

            eachValueArray[0] = yeniIsim;
            eachValueArray[1] = yeniSoyisim;

            //6.adim
            // update'i arrayde yaptik, yapilan update'yi map'e islemeliyiz
            // arrayi value olacak sekilde birlestirip
            // yeni value olarak kaydedelim

            String yeniValue = String.join("-", eachValueArray);

            //7.adim
            // yeniValue ile mapi update edin

            ogrenciMap.put(eachKey, yeniValue);


        }


    }

    //  verilen sinif ve subede egtim goren tum ogrencilerin sinf ve subeerini
    //   yeni verilen degerlerle update edin
    //    orn: 10k subedeki orencileri 10p olarak guncelleyin

    protected static void sinifVeSubeUpdate(int eskiSinf, String eskiSube, int yeniSinif, String yeniSube) {


        //1.adim tum keyleri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet(); // [101,102,103,104,105,106,107]

        // 2- her bir key'i tek tek ele alip o key'e ayit value ulasalim
        for (Integer eachKey : tumOgrenciNoSeti) {

            //3.adim
            // eachKey bize her bir key'i getirecek
            // bizde o key'e a't value'i kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // "Veli-Cem-10-K-TM" getirdi diyelim

            //4.adim
            // bilgilere ulasabilmek icin valuyu siplit edelim
            String[] eachValueArray = eachValue.split("-"); // [Veli, Cem, 10, K, TM]

            // 5. adim
            // istenen update'i yapin
            // verilen sinif ve sube esgtim goren tum ogrencilerin
            // sinif ve subelerini yeni degerler ile update edin
            // eski sinif ve sube kontrol etmeli degismesi gereken sinif ve sube ise
            // degistirmeliyiz

            String orencininSinfi = eachValueArray[2];
            String ogrencininSubesi = eachValueArray[3];

            if (orencininSinfi.equalsIgnoreCase(eskiSinf + "") && ogrencininSubesi.equalsIgnoreCase(eskiSube)) {
                // eger ogrenincinin sinif ve subesi degismesi gerekiyorsa arrayi update edelim

                eachValueArray[2] = yeniSinif + "";
                eachValueArray[3] = yeniSube;
            }


            //6.adim
            // update'i arrayde yaptik, yapilan update'yi map'e islemeliyiz
            // arrayi value olacak sekilde birlestirip
            // yeni value olarak kaydedelim

            String yeniValue = String.join("-", eachValueArray);

            //7.adim
            // yeniValue ile mapi update edin

            ogrenciMap.put(eachKey, yeniValue);
        }


    }

    protected static void yilSonuSinifArtirma(){

        // yil sonunda calisacak sekilde
        // tum ogrencileri sube ayni kalacak sekilde bir ust sinifa tasiyin
        // not: 12.sinifteki == mezun olacak
        // mezun olanlar ayni kalacak



        //1.adim tum keyleri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet(); // [101,102,103,104,105,106,107]

        // 2- her bir key'i tek tek ele alip o key'e ayit value ulasalim
        for (Integer eachKey : tumOgrenciNoSeti) {

            //3.adim
            // eachKey bize her bir key'i getirecek
            // bizde o key'e a't value'i kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // "Veli-Cem-10-K-TM" getirdi diyelim

            //4.adim
            // bilgilere ulasabilmek icin valuyu siplit edelim
            String[] eachValueArray = eachValue.split("-"); // [Veli, Cem, 10, K, TM]

            // 5. adim
            // istenen update'i yapin
            // verilen sinif ve sube esgtim goren tum ogrencilerin
            // tum ogrencileri sube ayni kalacak sekilde bir ust sinifa tasiyin
            // not: 12.sinifteki == mezun olacak
            // mezun olanlar ayni kalacak


            String orencininSinfi = eachValueArray[2];

            switch (orencininSinfi){
                case "9" :
                    eachValueArray[2] ="10";
                    break;
                case "10" :
                    eachValueArray[2] ="11";
                    break;
                case "11" :
                    eachValueArray[2] ="12";
                    break;
                case "12" :
                    eachValueArray[2] ="mezun";
                    break;
                case "mezun" :
                    // degisiklik yapilmadi
                    break;
            }


            //6.adim
            // update'i arrayde yaptik, yapilan update'yi map'e islemeliyiz
            // arrayi value olacak sekilde birlestirip
            // yeni value olarak kaydedelim

            String yeniValue = String.join("-", eachValueArray);

            //7.adim
            // yeniValue ile mapi update edin

            ogrenciMap.put(eachKey, yeniValue);

        }
    }
}

