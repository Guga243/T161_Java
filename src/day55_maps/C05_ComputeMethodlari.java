package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C05_ComputeMethodlari {
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

        // a'nin degerini 2 katina cikarin

        harfler.replace("a",2 * harfler.get("a"));
        System.out.println(harfler); // {a=90, b=66, g=24, j=32, l=78, z=12}

        // k'nin degerini 2 katina cikarin

        // harfler.replace("k",2 * harfler.get("k"));
     //   System.out.println(harfler); // .NullPointerException

        if (harfler.containsKey("k")){
            harfler.replace("k",2*harfler.get("k"));
        }
        System.out.println(harfler); // {a=90, b=66, g=24, j=32, l=78, z=12}


        //eger mapde l yoksa degeri 60 olacak sekilde ekleyin
        //1 - yontem
        harfler.putIfAbsent("l",60); // yoksa degerini 60 olarak koy

        //2 - yontem
        if (!harfler.containsKey("l")){
            harfler.put("l",60);
        }
        System.out.println(harfler);

        // g'nin degerini 10 arttirin
        // gorevde soylememis ama g'nin var oldugunu kontrol edip sonra arttirma islemini yapmaliyiz
        // {a=90, b=66, g=24, j=32, l=78, z=12}

        if (harfler.containsKey("g")){
            harfler.replace("g",harfler.get("g")+10);
        }
        System.out.println(harfler); // {a=90, b=66, g=34, j=32, l=78, z=12}


        //  g'nin degerini 10 arttirin
        //  gorevde soylememis ama g'nin var oldugunu kontrol edip sonra arttirma islemini yapmaliyiz
        //        // {a=90, b=66, g=24, j=32, l=78, z=12}

        harfler.computeIfPresent("g",(k,v)-> v+10);
        System.out.println(harfler); // {a=90, b=66, g=44, j=32, l=78, z=12}

        // h varsa degerini 5 azaltin
        harfler.computeIfPresent("g",(k,v)->v-5);
        System.out.println(harfler);

        // k yoksa degeri 10 olacak sekilde ekleyin
        //1- yontem put if absent
        harfler.putIfAbsent("k",10);
        System.out.println(harfler); // {a=90, b=66, g=44, j=32, l=78, z=12}

        // 2-yontem compute if absent
        harfler.computeIfAbsent("k",v->10); //
        System.out.println(harfler); // {a=90, b=66, g=39, j=32, k=10, l=78, z=12}

        // a'nin degerinin 2 katinin 4 fazlasini yapin
        // eger a'nin varligini sorgulamadan islem yapmak istersek
        harfler.compute("a",(k,v)->2*v+4);
        // sariya boyayip uyari veriyor ya "a" key yoksa diye
        System.out.println(harfler); // {a=184, b=66, g=39, j=32, k=10, l=78, z=12}

        // risk almamak icin a'nin varligini kontrol etmek daha iyi olacaktir

        harfler.computeIfPresent("a",(k,v)->2*v+4);
        System.out.println(harfler); // {a=372, b=66, g=39, j=32, k=10, l=78, z=12}
    }
}
