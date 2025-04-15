package day16_NestedForLoop;

import java.util.Scanner;

public class C05_NestedLoop {
    public static void main(String[] args) {


        /*
            kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
            orn satir = 4 , sutun= 5 oldugunda
             2 3 4 5 6
             3 4 5 6 7
             4 5 6 7 8
             5 6 7 8 9
         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen sekildeki satir sayisini girini");
        int satirSayisi = scann.nextInt();

        System.out.println("lutfen sekildeki sutun girini");
        int sutun = scann.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) { //outer loop ,
            for (int j = 1; j <= sutun; j++) { // herbir sutun sayisini belirler
                System.out.print(i+j+" ");
            }
            System.out.println();


        }

    }
}
