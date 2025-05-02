package day55_maps;

import day54_maps.MapDepo;

public class C02_SinfDegistirme extends MapDepo {
    public static void main(String[] args) {

        // verilen sinif ve subede egtim goren tum ogrencilerin sinf ve subeerini
        // yeni verilen degerlerle update edin
        // orn: 10k subedeki orencileri 10p olarak guncelleyin

        System.out.println(ogrenciMap);

        sinifVeSubeUpdate(10,"k",10,"p");
        System.out.println(ogrenciMap);

    }
}
