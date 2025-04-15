package day27_multiDimentionalArrays;

import java.util.Arrays;

public class C01_MDA_kullanma {

    public static void main(String[] args) {

        int[][] sayilar = {{3,5,4},{2,3,6,8},{2,4},{10},{3,9,0,2,7}};


        // sayilar arrayinin kac elemani var
        System.out.println(sayilar.length); // 5

        // sayilar arrayindeki 9 u yazdirin

        System.out.println(sayilar[4][1]);

        // sayilar arrayindeki icindeki 2.indexdeki inner arrayi yazdir

        System.out.println(sayilar[2]); //[I@e580929 Arrayi direk yazdirilamaz

        System.out.println(Arrays.toString(sayilar[2])); //[2, 4]

        // arr 3 un eleman sayisi kactir
        System.out.println(sayilar[3].length); //1

        // sayilar[3] u yazdirin
        System.out.println(Arrays.toString(sayilar[3]));// [1]
        //sayilar 3un icindeki sayiyi yazdirin
        System.out.println(sayilar[3][0]); //10

        // sayilar[1] i yazdirin

        System.out.println(Arrays.toString(sayilar[1]));// [2, 3, 6, 8]

        // sayilardeki eleman olan 8i yazdirin
        System.out.println(sayilar[1][3]); //8

        // tum arrayi yazdirin
        System.out.println(sayilar); //[[I@1cd072a9
        System.out.println(Arrays.toString(sayilar)); //[[I@7c75222b, [I@4c203ea1, [I@e580929, [I@27f674d, [I@1d251891]

        // multi dimentional arrayi yazdirmak icin
        System.out.println(Arrays.deepToString(sayilar)); // [[3, 5, 4], [2, 3, 6, 8], [2, 4], [10], [3, 9, 0, 2, 7]]




    }
}

