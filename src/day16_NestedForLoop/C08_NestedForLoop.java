package day16_NestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {

/*
        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5
                *
                * *
                * * *
                * * * *
                * * * * *
         */

        Scanner scann = new Scanner(System.in);

        System.out.println("lutfen sekildeki satir sayisini girini");
        int satirSayisi = scann.nextInt();

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }















    }
}
