package day36_StaticBlocks_passByValue;

public class C05_passByValue {
    public static void main(String[] args) {

        int sayi = 4;

        System.out.println(sayiyiDegistir(sayi));

        System.out.println(sayi);

        sayi = sayiyiDegistir(sayi);
        System.out.println("main methodeki kalici hali : " +sayi); //8


    }
    public static int  sayiyiDegistir  (int sayi) {

        // sayi cist ise sayinin degerini 2 katina
        // sayi tek ise sayinin degerini 5 artirin
        // ve sayinin son halinin dondurun

        // sayi cift ise sayinin degerini 2 katina cikarin
        // sayi tek ise sayinin degerini 5 artirin
        // ve sayinin son halini dondurun

        if (sayi % 2 == 0){
            sayi = sayi*2 ;
        } else {
            sayi = sayi+5;
        }

        return sayi;


    }
}
