package day12_stringManipilation;

public class C06_startsWith {
    public static void main(String[] args) {

        String str ="Kod yazmak cok guzel";
        System.out.println(str.startsWith("K")); // ilk harfi k mi evet true
        System.out.println(str.startsWith("k"));// false kucuk k degil
        System.out.println(str.startsWith("Ko"));// true ko ole baslar



        // String str ="Kod yazmak cok guzel";
        // str yazmak il mi basliyor

        System.out.println(str.startsWith("yazmak")); // false

        // str'in 5.index ve sonrasi yazmak ile mi basliyor

        System.out.println(str.startsWith("yazmak",4));// true
        // 2 parametre kullaniminda
        //java once toffset olarak verilen index ve sonrasindeki tum metni alir
        // ve aldigi bu parca surulan "yazmak" ile mi basliyor kontrol eder


        str.startsWith("cok",10);//tru



    }
}
