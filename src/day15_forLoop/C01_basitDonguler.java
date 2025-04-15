package day15_forLoop;

import java.util.Scanner;

public class C01_basitDonguler {
    public static void main(String[] args) {

        // birden 5e kadar olan sayilari
        // yan yana aralarinda bir bosluk olacak sekilde yazdirin

        System.out.println("1 2 3 4 5");

        // birden 1000'den 50000'e kadar olan sayilari
        // yan yana aralarinda bir bosluk olacak sekilde yazdirin


        // kullanicidan baslangic ve bitis degerlerini alip
        // bu degerleri ve aralarindeki tum sayilari
        // yan yana aralarinda bir bosluk olacak sekilde yazdirin


        // birden 101'den(sinirlar dahil) 145'e kadar olan sayilari
        // yan yana aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 151; i <=175 ; i++) {
            System.out.print(i+" ");

        }
        System.out.print("   === = == = = = =  ");

        // iki basamakli cift sayilari yazdirin

        for (int i = 10; i <100 ; i+=2) { // 2ser arttirmasi icin
            System.out.print(i+" ");

        }


        System.out.println("");
        // 100den baslayarak 245e kadar 9'ar 9'ar arttirarak yazdirin

        for (int i = 100; i <=245 ; i+=9) {
            System.out.print(i+" ");

        }

        // 100 den baslayarak geriye dogru 3'er 3'er azaltarak
        //0'a kadar olan sayilari yazdirn

        System.out.println("");

        for (int i = 100; i >=0; i-=3) {
            System.out.print(i+" ");


        }

        // kullanicidan baslangic be bitis degerlerini alip
// bu degerleri ve aralarindaki tum sayilari
// yanyana aralarinda bir bosluk olacak sekilde yazdirin

        System.out.println("");


        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen baslangic degerini giriniz");
        int baslangic = scann.nextInt();

        System.out.println("lutfen bitis degerinin giriniz");
        int bitis = scann.nextInt();

        for (int i = baslangic; i <=bitis; i++) {
            System.out.print(i+" ");

        }


    }
}
