package day26_arrays;

import java.util.Arrays;

public class C06_methodlariKullanma {
    public static void main(String[] args) {

        int[]arr ={5,8,1,3};
        // arra'ye 5 eleman olarak 9 ekleyin

        arr= C02_arrayeKaliciOlarakYeniElemanEkleme.arrayeElemanEkleme(arr,9);
        System.out.println(Arrays.toString(arr)); //[5, 8, 1, 3, 9]

        // 6. elemaan olarak 4 ekleyin

        arr = C02_arrayeKaliciOlarakYeniElemanEkleme.arrayeElemanEkleme(arr,4);
        System.out.println(Arrays.toString(arr)); //[5, 8, 1, 3, 9, 4]

    }
}
