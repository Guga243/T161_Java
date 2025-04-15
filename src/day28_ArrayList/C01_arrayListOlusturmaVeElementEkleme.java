package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arrayListOlusturmaVeElementEkleme {
    public static void main(String[] args) {

        int []  arr ={3,4,5,6};


        ArrayList <Integer> sayilar1 = new ArrayList<>();
        // data turu olarak int yazdigimizda primitive daga type yazamasin diyor

        //array List 3 sekilde declare edilebilir

        ArrayList <Integer> sayilar2 = new ArrayList<>();
        List<Integer> sayilar3 = new ArrayList<>();
        ArrayList <Integer> sayilar4 = new ArrayList<Integer>();

        // genel olarak data turunun List secilmesi tercih edilir
        List<Integer> sayilar5 = new ArrayList<>();

        // ArrayList direk olarak yazdirilabilir
        System.out.println(sayilar5);

        // array liste elemanlari tek tek ekliyebiliriz

        sayilar5.add(5);
        sayilar5.add(1);
        sayilar5.add(8);
        sayilar5.add(3);
        System.out.println(sayilar5); //[5, 1, 8, 3]

        sayilar5.add(2,9);
        System.out.println(sayilar5);

        sayilar1.add(10);
        sayilar1.add(20);

        System.out.println(sayilar1); // [10, 20]

        sayilar5.addAll(sayilar1);
        System.out.println(sayilar5); //[5, 1, 9, 8, 3, 10, 20]
        System.out.println(sayilar1); //[10, 20]

        sayilar5.addAll(1,sayilar1);
        System.out.println(sayilar5); // [5, 10, 20, 1, 9, 8, 3, 10, 20]


        // icinde "Cennet", "Yusuf", "Mertcan", "Eda" isimlerinin oldugu bir ArrayList olusturun

        List<String>isimler = new ArrayList<>(Arrays.asList("Cennet", "Yusuf", "Mertcan", "Eda"));
        System.out.println(isimler); //[Cennet, Yusuf, Mertcan, Eda]

        /*
        Array list olustururken
        eklenecek elementler belli ise
        Arrays.asList methodunu kullanabilriiz

        tek tek ekeleyeceksek add methodu ile yapabiliriz
         */





    }
}
