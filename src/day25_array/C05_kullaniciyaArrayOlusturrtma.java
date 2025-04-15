package day25_array;

import java.util.Arrays;
import java.util.Scanner;

public class C05_kullaniciyaArrayOlusturrtma {
    // kullanicidan arrayi'in boyutunu ve String elementlerini alip arrayi olusturan
    // ve olusturulan arrayi donduren bir method olusturuun

    public static void main(String[] args) {

        System.out.println(Arrays.toString(kullaniciyaArrayOlusturt()));



    }
    public static String[] kullaniciyaArrayOlusturt(){

        // arrayi olusturmak icin oncellikle length'i almaliyiz
        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen arrayin kac eleman olacagini giriniz");
        int elemanSayisi = scann.nextInt(); //  3

        String [] arr= new String[elemanSayisi]; // [null, null , null]

        for (int i = 0; i <elemanSayisi ; i++) {
            System.out.println("lutfen "+i + ".index icin bir metin giriniz");
            arr[i]= scann.next();

        }
        return arr;

    }
}
