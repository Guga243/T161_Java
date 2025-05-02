package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C04_MapMetodlari {
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

        harfler.remove("a",56);
        System.out.println(harfler); // {a=45, b=66, g=24, j=32, l=78, z=12}
        // yok olani silmez

        harfler.remove("a",45); // "a",45 siler cunku map icinde var
        System.out.println(harfler); // {b=66, g=24, j=32, l=78, z=12}

        harfler.remove("j");
        System.out.println(harfler); // {b=66, g=24, l=78, z=12}
        // value'ye bakmadan direk silecektir

        // eger map'de a yoksa degeri 56 olacak sekilde ekleyin
        harfler.put("a",56);
        // var olup olmadigina bakmaksizin ekler
        // yoksa eklemis olur, varsa eski degeri update eder
        // biz bunu istemiyoruz
        System.out.println(harfler);
        harfler.put("a",56);
        System.out.println(harfler);

        harfler.putIfAbsent("a",56);
        System.out.println(harfler); // {a=56, b=66, g=24, l=78, z=12}

        // eger map'de a varsa degerini 44 olarak update edin
        harfler.replace("a",44);
        System.out.println(harfler); // {a=44, b=66, g=24, l=78, z=12}

        // eger map'de m varsa degerini 22 yapin
        harfler.replace("m",22);
        System.out.println(harfler); // {a=44, b=66, g=24, l=78, z=12}




    }
}
