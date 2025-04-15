package day16_NestedForLoop;

import java.util.Scanner;

public class C10_nestedLoops {
    public static void main(String[] args) {
        /*
        kullanicidan satir sayisini alin asagdeki gibi sekil cidirin

        orn satir 9
        0
        0 1
        0 1 2
        0 1 2 3
        0 1 2 3 4
        0 1 2 3
        0 1 2
        0 1
        0

         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen satir sayisni giriniz");
        int satir = scann.nextInt();

        if (satir%2==0){
            System.out.println("satir sayisi cift olamaz");

        }else {

            for (int i = 1; i <= satir / 2 + 1; i++) { // satirlar
                for (int j = 1; j <= i; j++) {
                    System.out.print(j - 1 + " ");

                }
                System.out.println();


            }

            /*
            5.satira kadar her satirda satir sayisi kadar olacak sekilde ucgen cizdik
            6.satirda 4, 7.satirda 3, 8.satirda 2 9.satirda 1, 10.satirda (2*satir sayisi) 0
            olacak sekilde azaltarak 2.bolum yazdiracak
            ayni bir nsted for loop yazdirmaliyiz

             */

            for (int i = satir/2; i >=1 ; i--) { // satirlar
                for (int j = 1; j <= i; j++) {
                    System.out.print(j - 1 + " ");

                }
                System.out.println();
            }
        }























    }
}
