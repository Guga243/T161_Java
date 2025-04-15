package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListMethodlari {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>(Arrays.asList("Cennet", "Yusuf", "Mertcan", "Eda"));

        // isimler listesindeki elemet sayisini yazdirn

        System.out.println(isimler.size()); //4

        // isimler listesindeki ilk elementi yazdirn
        System.out.println(isimler.get(0)); //Cennet

        // iimler listesindeki son elementi yazdirn
        System.out.println(isimler.get(isimler.size()-1)); // eda

        // isimler listesindeki tum elemetleri yan yana yazirn
        // array liste tum elemenleri gozden gecirmek istersek foor loop kullaniriz
        // bizim olan isimler.get(i) olur

        for (int i = 0; i < isimler.size() ; i++) {
            System.out.print(isimler.get(i) + " "); //Cennet Yusuf Mertcan Eda

        }

        System.out.println("    ");


        // isimler listesinde serpil var mi
        System.out.println(isimler.contains("Serpil")); // false


        // isimler listesinin 1.indexine ali ekleyin
       isimler.add(0,"Ali");
        System.out.println(isimler); //[Ali, Cennet, Yusuf, Mertcan, Eda]

        // java da set() methodlari update yapar
        isimler.set(1,"Guga");
        System.out.println(isimler); //[Ali, Guga, Yusuf, Mertcan, Eda]

        System.out.println(isimler.set(3, "hasan"));
        System.out.println(isimler); //[Ali, Guga, Yusuf, hasan, Eda]
    }
}
