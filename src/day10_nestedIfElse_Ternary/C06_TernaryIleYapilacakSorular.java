package day10_nestedIfElse_Ternary;

public class C06_TernaryIleYapilacakSorular {
    public static void main(String[] args) {

        // Verilen bir notu kontrol edip
        // 50 veya daha buyukse "Sinifi Gectin",
        // 50’den kucukse "Maalesef kaldin" yazdirin.
        int not =49;
        System.out.println(not>=50? "sinifi gectin" : "kaldin");

        // Verilen iki tamsayidan buyuk olmayan sayiyi yazdirin
        int sayi1 =80;
        int sayi2 =80;
        System.out.println(sayi1 >sayi2? sayi2 : sayi1);

        // verilen sayi icin 3'un kati veya 3'un kati degil seceneklerinden
        // uygun olani yazdirin
        int sayi = 765;
        System.out.println(sayi%3 ==0? "3'un kati" : "3'un kati degil");



    }
}