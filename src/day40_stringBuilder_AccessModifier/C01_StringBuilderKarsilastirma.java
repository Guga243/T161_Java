package day40_stringBuilder_AccessModifier;

public class C01_StringBuilderKarsilastirma {

    public static void main(String[] args) {
        String str ="ali";
        StringBuilder sb1 = new StringBuilder("ali");
        StringBuilder sb2 = new StringBuilder("ali");

        // 1. == ile karsilastirma

       //  System.out.println(str==sb1);
        // Operator '==' cannot be applied to 'java. lang. String', 'java. lang. StringBuilder
        // java da farkli data turlerindeki non primitive'ler  == ile karsilastirililamaz\

        Integer sayi1 =20;
        Short sayi =20;
       //  System.out.println(sayi==sayi1);
        // Operator '==' cannot be applied to 'java. lang. Short', 'java. lang. Integer

        System.out.println(sb1==sb2); // false
        // java iki strinBulderin == ile karsilastirilmasina itiraz etmez
        // AMMAAA farkli iki stringBuilder karsilastirildiginda degerleri ayni olsa bile sonuc FALSE olur
        // sadece bir stringBuilder kendisi ile karsilastiirilsa sonuc true olur

        System.out.println(sb1==sb1); // true

        // 2.equals ile karsilastirma

        System.out.println(sb1.equals(str)); // false
        // ayni sekide sonuc hep false

        System.out.println(sb1.equals(sb2)); // false
        // java iki strinBulderin equals ile karsilastirilmasina itiraz etmez
        // AMMAAA farkli iki stringBuilder karsilastirildiginda degerleri ayni olsa bile sonuc FALSE olur
        // sadece bir stringBuilder kendisi ile karsilastiirilsa sonuc true olur


        // 3. comapareTo() ile karsilastirma

        StringBuilder sb3 = new StringBuilder("hava");
        StringBuilder sb4 = new StringBuilder("tava");
        StringBuilder sb5 = new StringBuilder("HAVVA");
        StringBuilder sb6 = new StringBuilder("hata");

        System.out.println(sb1.compareTo(sb2)); // 0      ali <==> ali == > 0
        System.out.println(sb3.compareTo(sb4)); // -12    hava <==> tava ==> h i j k l m n o p q r s t
        System.out.println(sb3.compareTo(sb5)); // 32   hava <==> hava H - H a... A
        System.out.println(sb3.compareTo(sb6)); // 2 hava <==> ==> H - H a -a v u t
        System.out.println(sb4.compareTo(sb5));// 44  tava == hava ==> t h
        System.out.println(sb4.compareTo(sb6)); // 12

        // stringBuilder' lari metin olarak karsilastirmka icin compareTo() kullanilir
        // compareTo() == 0 ise verilen strinBuilderlar ayni metne sahip
        // 0 degilse farkli metne sahip

        // System.out.println(sb1.compareTo(str)); compareTo() string kabul etmez sadece stringBuilder icin



    }
}
