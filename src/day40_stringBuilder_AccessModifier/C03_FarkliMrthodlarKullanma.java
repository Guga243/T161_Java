package day40_stringBuilder_AccessModifier;

public class C03_FarkliMrthodlarKullanma {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("java candir");

        // sb1 a harfi iceriyor mu?

        System.out.println(sb1.toString().contains("a")); // true

        /*

        stringBuilder'da olmayaip
        string de olan bir methodu kullanmak istersek

        once toString() ile StringBuilder'i String'e cevirirz
        sonra'da istedigimiz String methodunu klullaniriz

        not: SATRINGBUILDER mutable olsa da
        toString(*) ile string 'e donusturdugumuz icin
        sonrasinda kullanlan methodlar kalici hale
         */
    }
}
