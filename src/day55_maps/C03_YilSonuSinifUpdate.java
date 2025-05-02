package day55_maps;

import day54_maps.MapDepo;

public class C03_YilSonuSinifUpdate extends MapDepo {
    public static void main(String[] args) {

        // yil sonunda calisacak sekilde
        // tum ogrencileri sube ayni kalacak sekilde bir ust sinifa tasiyin
        // not: 12.sinifteki == mezun olacak
        // mezun olanlar ayni kalacak

        System.out.println(ogrenciMap);

        yilSonuSinifArtirma();
        System.out.println(ogrenciMap);

    }
}
