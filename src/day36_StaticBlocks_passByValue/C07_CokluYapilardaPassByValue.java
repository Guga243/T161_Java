package day36_StaticBlocks_passByValue;

import java.util.Arrays;

public class C07_CokluYapilardaPassByValue {

    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5,6,76,8,};


        arrayiDegistir(arr); //  [1, 2, 3]

        System.out.println("method calldan sonra man method arr" +Arrays.toString(arr));
        // 1, 2, 3, 4, 5, 6, 76, 8]

        // method'da arrayin elemanlarina degil direk arrayin kendisine atama yapmis, java bunu kabul etmez
        // o method da yapilan degisikligi orada kalir



    }

    // verilen int elemanlari olan bir array'i
    // icinde 1,2 ve 3'un oldugu yeni bir arraye donusturup
    // son halini yazdirian bir method olusturun

    public static void arrayiDegistir(int [] sayilar){

        int [] yeniArr = {1,2,3};

        sayilar = yeniArr;

        System.out.println("method'da sayilar arrayinin son hali :" + Arrays.toString(sayilar));

    }
}
