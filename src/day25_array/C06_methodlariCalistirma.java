package day25_array;

import day19_methodOlusturma.C02_FaktoryelDegeriDondurme;

public class C06_methodlariCalistirma {
    public static void main(String[] args) {
        int[]sayilar ={1,2,3,4,5,6,7,8,13,67,12};

        // sayilar elementindeki tum elementlerin toplamini yazdirin

        C01_arrayElemanlariniToplama.elementToplaminiYazdir(sayilar); //40

        //  sayilar arrayindeki tum elementleri toplayin
        // eger toplami cift ise "ne gzuel sayi"
        // tek sayi ise "bu sayiyi begernmedin"

        // elementToplaminiYazdir(sayilar); methodu void oldugundan
        // toplam degerini karsilastiramayiz
       // int sonuc =C01_arrayElemanlariniToplama.elementToplaminiYazdir(sayilar);

        int toplamSonuc = C01_arrayElemanlariniToplama.getElementlerinToplami(sayilar);

        if (toplamSonuc %2 ==0){
            System.out.println("ne guzel array");
        }else {
            System.out.println("bu sayiyi nerden buldun");
        }

        // verilen int bir arrayin en buyuk sayinin bulun
        // sayi 15den kucuk pozitif tamsayi ise faktoryel degerini yazdirin
        // sayi 15 den kucuk pozitif degilse en buyk sayiyi yazdirin
        int enBuyukEleman = C02_enBuyukElemaniBulma.getEnBuyukEleman(sayilar);

        if (enBuyukEleman>0 && enBuyukEleman<15){
            System.out.println("en buyuk sayinin faktoryel degeri: "+C02_FaktoryelDegeriDondurme.faktoryelDegeri(enBuyukEleman));
        }else {
            System.out.println("en buyuk sayi :"+enBuyukEleman);
        }


    }
}
