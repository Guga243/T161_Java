package day31_forEachLoop;

import java.util.Arrays;

public class C01_forEachLoop {
    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 7, 8, 9, 0, 3, 4};

        // arr deki tum elemanlarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];


        }
        System.out.println("for loop ile elementlerin toplami : " + toplam); //45


        // for each loop bana arr'deki tum int leri getir mantigi ile calisir
        toplam = 0;

        for (int each : arr) {
            toplam += each;

        }
        System.out.println("each ile intlerin toplami :" + toplam); //45

        // arr'deki tum elemenleri yazdrini

        for (int each : arr) {
            System.out.print(each); //356789034
        }
    }

}
