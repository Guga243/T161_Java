package day53_collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C05_ArraydenTekrarEdenElementleriTemizleme {
    public static void main(String[] args) {

        int[]sayilar ={2,3,4,66,8,5,23,6,8,4,2,5,7,8,56,43,22,4,566,7,7,77,7,};
        // sayilar arrayinde tekrar eden sayilari sadece bir kere yazip
        // sayilar arrayini tekrarsiz hale dondurun

        Set<Integer> sayilarSeti = new TreeSet<>();
       for (int each :sayilar ){
           sayilarSeti.add(each);

       }
        System.out.println(sayilarSeti);//   // [2, 3, 4, 5, 6, 7, 8, 22, 23, 43, 56, 66, 77, 566]

        // arraydeki tum elemanlari tekrarsiz olarak bir set halinde elde ettik
        // simdi arrayi setdeki elemanlardan olusan bir hale donusturmeliyiz

        sayilar = new int[sayilarSeti.size()];
        // set index desteklemedigi icin for loop degil for each loop kullanmaliyiz
        // araye atama yapmak icin indexe ihtiyac var
        // o zaman kendi indeximizi olusturalim

        int index=0;
        for (int each:sayilarSeti){
            sayilar[index]=each;
            index++;

        }

        System.out.println("Arrayin son hali : "+ Arrays.toString(sayilar));
        // [2, 3, 4, 66, 8, 5, 23, 6, 8, 4, 2, 5, 7, 8, 56, 43, 22, 4, 566, 7, 7, 77, 7]

        // Arrayin son hali : [2, 3, 4, 5, 6, 7, 8, 22, 23, 43, 56, 66, 77, 566]

    }
}
