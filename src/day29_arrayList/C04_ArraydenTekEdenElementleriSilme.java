package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekEdenElementleriSilme {
    public static void main(String[] args) {

        //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        Integer [] arr = {3, 5, 6, 8, 2, 3, 5, 1, 4, 8, 2, 3, 4, 8, 1};

        // array hem eleman ekleme konusunda rijit hemde contains() 'na sahip degil
        // bunun yerine gecici olarak arraylist olusturslim

        List<Integer> tekrarsizList = new ArrayList<>(); // []

        // arraydeki tum elementleri alalim, tekrarsiz listte olmayanlari lsiteye ekleyelim

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])) { // icermiyorsa
                tekrarsizList.add(arr[i]);
            }


        }
        System.out.println(tekrarsizList);
        //[3, 5, 6, 8, 2, 1, 4] elemanlari tekrarsiz hale list olarak getirdik
        // ama bizden istenen array olarak yapmamiz

        arr = tekrarsizList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 8, 2, 1, 4]

       arr= getTekrarsizArray(arr);
        System.out.println(Arrays.toString(arr)); //[3, 5, 6, 8, 2, 1, 4]


    }

    // //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
    // tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
    Integer [] arr = {3, 5, 6, 8, 2, 3, 5, 1, 4, 8, 2, 3, 4, 8, 1};

    public static Integer[] getTekrarsizArray(Integer[]arr){


        // array hem eleman ekleme konusunda rijit hemde contains() 'na sahip degil
        // bunun yerine gecici olarak arraylist olusturslim

        List<Integer> tekrarsizList = new ArrayList<>(); // []

        // arraydeki tum elementleri alalim, tekrarsiz listte olmayanlari lsiteye ekleyelim

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])) { // icermiyorsa
                tekrarsizList.add(arr[i]);
            }


        }

        //[3, 5, 6, 8, 2, 1, 4] elemanlari tekrarsiz hale list olarak getirdik
        // ama bizden istenen array olarak yapmamiz

        arr = tekrarsizList.toArray(new Integer[0]);
        return arr;

    }

}
