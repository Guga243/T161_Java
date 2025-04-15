package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_listtenElemanSilme {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>(Arrays.asList("Cennet", "Yusuf", "Mertcan", "Eda"));
        System.out.println(isimler); //[Cennet, Yusuf, Mertcan, Eda]

        isimler.remove("Cennet");
        System.out.println(isimler); //[Yusuf, Mertcan, Eda]

        isimler.remove(2);
        System.out.println(isimler); //[Yusuf, Mertcan]

        // remove methodu ister index ister silecek elementi verelim
        // silme islemini yapar
        // aradeki fark remove islemini yaparken bize bize getirdikleri delil farkidir

        System.out.println(isimler.remove("mertcan")); // false
        System.out.println(isimler.remove(0)); // Yusuf

        System.out.println(isimler.isEmpty()); // false

    }
}
