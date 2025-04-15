package day16_NestedForLoop;

import java.util.Scanner;

public class C09_NestedLoop {
    public static void main(String[] args) {
        /*
        kullanicidan satir sayisini alin asagdeki gibi sekil cidirin

        orn satir 5
        0
        0 1
        0 1 2
        0 1 2 3
        0 1 2 3 4

         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen satir sayisni giriniz");
        int satir = scann.nextInt();

        for (int i = 1; i <=satir; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j-1+" ");

            }
            System.out.println();


        }

    }
}
