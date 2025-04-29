package day54_maps;

public class C04_OrtakMapKullanimi extends MapDepo{

    public static void main(String[] args) {
        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ}

        // tum ogrencilerin soyisimlerini yazdirin

        // mapde islemler kademeli olarak yapildigindan uzun surebilir
        // maden ki uzun bir kod yaziyoruz bunu method olarak olustursak , sonra lazim oldugunda tekrar tekrar
        // kullanabilelim

        tumSoyIsimleriYazdir(); // Can, Cem, Cem, Can, Cem, Can, Han,

        tumOgrencilerinNoIsimSoyIsimYazdir();
        // tum ogrencilerin nolari isim ve soyisimleri :
        //101 Ali Can102 Veli Cem103 Ali Cem104 Ayse Can105 Sevgi Cem106 Sevgi Can107 Esra Han

        // baslangic ve bitis no verildiginde bu numaralar ve arasindeki numaralarin
        // no, isim , soyisim ve sinf sube'lerini yazdirin method
        numaraAraligindekiOgrenciBilgilerniYazdir(102,105);


    }
}
