package day26_arrays;

import java.util.Arrays;

public class C01_arrayeYenidenDegerAtama {
    public static void main(String[] args) {

        // olustuulan arraye uzunluhu sonradan eleman ekleyerek veya silinerek degistirilemez

        int[] sayilar ={3,4,5};

        // 4. eleman olarak 10 ekleyin

       // sayilar [3]=10; // declere edilirken sorun degil ama ArrayIndexOfBaundsExeptions verir

        // ama arraye tamamen yeni bir deger atamasi yapabilriiz
        // var olan arraye yeni liste seklinde atama yapilamaz
        // sayilar ={5,6,7,8}; kabul etrmiyor

        // ya once arrayi baska bir isim ile olusturup sonra atama yapabilriiz
        int [] yeniArr ={5,6,7,8};

        sayilar=yeniArr;
        System.out.println(Arrays.toString(sayilar)); // [5, 6, 7, 8]


        // yada icinde defolt degerlerin oldugu arrayi direkt sayilara atama yapabilriiz
        sayilar =new int[6];
        System.out.println(Arrays.toString(sayilar));// [0, 0, 0, 0, 0, 0]



    }
}
