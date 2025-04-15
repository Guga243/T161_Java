package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C03_equals {
    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<>(Arrays.asList("Merve","Cennet","Buse","Serpil"));
        List<String> liste2 = new ArrayList<>(Arrays.asList("Merve","Serpil","Buse","Cennet"));

        System.out.println(liste1.equals(liste2)); // false

        // equals()her bir indexdeki elemanlari karsilastirir eger esit ise true doner

        Collections.sort(liste1);
        Collections.sort(liste2);
        System.out.println(liste1); //[Buse, Cennet, Merve, Serpil]
        System.out.println(liste2); //[Buse, Cennet, Merve, Serpil]

        System.out.println(liste1.equals(liste2)); // true

    }
}
