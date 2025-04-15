package day10_nestedIfElse_Ternary;

public class C07_DikkatEdilecekler {
    public static void main(String[] args) {
        int sayi =10;

        // 1. ternary mutlaka bir sonuc uretir
        // bu sonucu ya yazdirmali veya bir veriable atamali
        //sadece ternary operatorunu yazarsaniz java hata verir
        sayi= sayi >20? sayi+10 :sayi-10;


        //2. Ternary'nin sonucunu yazdiracaksak
        // true veya false durumlarda alacagi degerin data turu onemli degildir
        // atama yapacaksak true veya false durumlarda alacagi degerin data turu ayni olmalidir
        sayi =26;
        // verilen sayiyi kontrol edip
        // sayi ciftse "Sayi cift" yazdirin
        // sayi cift degilse sayinin 10 fazlasini yazdirin

        System.out.println(sayi%2 ==0? "sayi cift" : sayi+10);
        // ayni ternary'inin sonucunu bir verable kaydedin
        // int sonuc =sayi%2 ==0? "sayi cift" : sayi+10
        // String sonuc = sayi%2 ==0? "sayi cift" : sayi+10
    }

}
