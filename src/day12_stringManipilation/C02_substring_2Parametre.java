package day12_stringManipilation;

public class C02_substring_2Parametre {
    public static void main(String[] args) {

        String str ="Java guzeldir";
        System.out.println(str.substring(1,3)); //
        /*
        java da genel bir kural olarak baslangic indexleri inclusive(dahil)
        bitis indexleri exclusive(haric)

        (str.substring(1,3)); yazildiginda 1 ve ikinci karakteri verir
        */

        System.out.println(str.substring(6,10));// uzel

        //str'in bastan 4 karakterini yazdirin

        System.out.println(str.substring(0,5));

        str ="java cok guzeldir";
        // sadece ikinci kelimeyei yazdirin
        System.out.println(str.substring(5,8)); // cok

        // bastan 2.harf ile sondan 2.harf dahil arasindeki metni yazdirin
        System.out.println(str.substring(1,str.length()-1)); //ava cok guzeldi

        // bastan 5 harf ile sondan 5.harf(haric) arasindeki karakterleri yazdirin
        System.out.println(str.substring(4, str.length() - 5)); //cok guz

        System.out.println(str.substring(0, 1));// j
        System.out.println(str.substring(1, 2));//a
        System.out.println(str.substring(2, 3));//v
        System.out.println(str.substring(3, 4));//a

        System.out.println(str.charAt(0));//j

        /*
        str.chartAt(0) ile substring (0,1) arasindeki fark
        chartAt methodu bir char getirdigi icin bu methoddan sonra string methodlari calismaz
        str.chartAt(0) bir string getirdigi icin bu methoddan sonra string methodlari calisir

        7.karakteri buyuk harf  olarak yazdirin
        "Java cok guzeldir" ===> o
        */

        System.out.println(str.substring(6,7).toUpperCase());

    }
}
