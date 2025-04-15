package day27_multiDimentionalArrays;

import java.util.Arrays;

public class C05_TumElemanlariArtirma {

    public static void main(String[] args) {



        // verilen iki katli int bir arraydeki
        // tum elementleri artirin

        int[][] sayilar = {{3, 5, 4}, {2, 3, 6, 8}, {2, 4}, {10}, {3, 9, 0, 2, 7}};

        int artisMiktari =1;

        for (int i = 0; i < sayilar.length ; i++) {

            for (int j = 0; j <sayilar[i].length ; j++) {

                sayilar[i][j]+=artisMiktari;
            }


            
        }
        System.out.println(Arrays.deepToString(sayilar));
    }


    
}
