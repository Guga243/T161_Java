package day26_arrays;

import java.util.Arrays;

public class C04_arraydeElemanArama {
    public static void main(String[] args) {
        int []arr ={5,1,8,4,12,-2,7};

        // arrayde bir elemanin olup olmadigini binary search() ile
        // kontrol edebiliriz

        System.out.println(Arrays.binarySearch(arr, 5)); //7
        System.out.println(Arrays.binarySearch(arr, 1));//1
        System.out.println(Arrays.binarySearch(arr, 8));// -8
        System.out.println(Arrays.binarySearch(arr, 4));// 3
        System.out.println(Arrays.binarySearch(arr, 12));// -8
        System.out.println(Arrays.binarySearch(arr, -2)); // -1
        System.out.println(Arrays.binarySearch(arr, 7)); // 6

        /* binarySearch() elementlerin indexini verir.
        Ancak binarySearch()in dogru calismasi icin once
        siralamin yapilmis olmasi gerekiyor.






         */
        System.out.println("=========");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[-2, 1, 4, 5, 7, 8, 12]

        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 12));
        System.out.println(Arrays.binarySearch(arr, -2));
        System.out.println(Arrays.binarySearch(arr, 7));

        // olmayan elemani aratirsak?
        // olmayan elemanlarin olmadigini belirtmek icin nagatif bir deger doner
        // string deki index of () olmayan bir metin icin -1 donuyordu
        // ama arraydeki binarysearch () bir adim daha ilderiye giderek
        // olmayan elemani arrayde olasaydi nerde olacak bilgisini bize verir

        System.out.println(Arrays.binarySearch(arr, -9));
        System.out.println(Arrays.binarySearch(arr, 0));
        System.out.println(Arrays.binarySearch(arr, 9));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 15));
        System.out.println(Arrays.binarySearch(arr, 20));
        System.out.println(Arrays.binarySearch(arr, 50));




    }
}
