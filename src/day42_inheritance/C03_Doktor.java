package day42_inheritance;

public class C03_Doktor extends C02_IK{
    public static void main(String[] args) {

        /*
        bir class baska bir classi parent edindiginde
        1- baslangic itibari ile parent classdeki
        tum ozellliklere sahip olur (veriable ve method)

        2- insanlar aleminden farkli olarak java da
        paranet classlar child edinmez
        child classlar parent edinir

        3- child classlar isterlerse
        parent classdeki ozellikleri kendilerine
        uyarlayabilirler

        4- child classlaar isterlerse parent class da
        olmayan yeni ozellikler ekleyebilirler


         */

        int askariUcrer =50000;
        int donerSermaye =10000;

C03_Doktor doktor = new C03_Doktor();
        System.out.println(doktor.bolumKisa);
        System.out.println(doktor.emekliMi);
        System.out.println(doktor.isim);
        System.out.println(doktor.yas);

        System.out.println(doktor.askariUcret);
        System.out.println(donerSermaye);



    }
}
