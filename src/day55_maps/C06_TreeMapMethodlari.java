package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();
        // tree map dogal sirali hale getirdi

        harfler.put("a",45);
        harfler.put("j",32);
        harfler.put("l",78);
        harfler.put("z",12);
        harfler.put("b",66);
        harfler.put("g",24);

        System.out.println(harfler); // {a=45, b=66, g=24, j=32, l=78, z=12}

        // data turu map secildigi icin harfler mapi tum maplerle ayni ozellikleri tasir
        // ama biz child classlarin daha fazla ve daha guncel methodlari olabilecegini biliyoruz


        TreeMap<String,Integer> harfler1 = new TreeMap<>();
        // tree map dogal sirali hale getirdi

        harfler.put("a",45);
        harfler.put("j",32);
        harfler.put("l",78);
        harfler.put("z",12);
        harfler.put("b",66);
        harfler.put("g",24);

        // eger data turunu de TreeMap secersek tree maplere ozel pek cok methodun var oldugunu
        // goruyoruz


    }
}
