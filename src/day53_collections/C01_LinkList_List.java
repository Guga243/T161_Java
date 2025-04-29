package day53_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkList_List {
    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();

        /* eger bir list olusturmak istersek,
        List bir interface oldugundan direk olarak new List<>()
        kullanamayiz
        bunun yerine List'in concrate chidi olan
        ArrayList<>() veya LinkedList() constructor'larini kullanabiliriz

        her ne kadar farkli constructor kullansak da
        new LinkedList<>() ile olusturdugumuz bir liste
        data turu List<> seecildigi icin ArrayList'ler ile ayni methodlari
        barindirir


         */

        /*
        java olusturdugu her bir veriable veya objeye bir hash codu verir
        hash kodun bizim icin anlamli olmasi sartv degildir
        ama java o hash kodun anlamini bilir ve o elemana kolay ulasir


         */
        System.out.println(isimler.hashCode()); //1
        isimler.add("Ali");
        System.out.println(isimler.hashCode()); // 65949
        isimler.add("10 dakika ara");
        System.out.println(isimler.hashCode()); //692097413
    }
}
