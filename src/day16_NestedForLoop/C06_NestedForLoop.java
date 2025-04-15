package day16_NestedForLoop;

import java.util.Scanner;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
            kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
            orn satir = 4 , sutun= 5 oldugunda
             1 2 3 4 5
             2 3 4 5 6
             3 4 5 6 7
             6 5 6 7 8
         */
        Scanner scann = new Scanner(System.in);

        System.out.println("lutfen sekildeki satir sayisini girini");
        int satirSayisi = scann.nextInt();

        System.out.println("lutfen sekildeki her satir eleman sayisini girini");
        int sutun = scann.nextInt();

        for (int i = 1; i <=satirSayisi; i++) { // satirlari
            for (int j = 1; j <=sutun; j++) { // sutun sayisi
                System.out.print(i+j-1+" ");
            }
            System.out.println();

        }
    }
}
