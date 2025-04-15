package day16_NestedForLoop;

import java.util.Scanner;

public class C07_NestedForLoop {
    public static void main(String[] args) {
        /*
        kullanicidan satir ve sutun sayisini alip asagidaki sekli cizdirin
        orn satir = 3 , sutun= 6 oldugunda
                * * * * * *
                * * * * * *
                * * * * * *
         */
        Scanner scann = new Scanner(System.in);

        System.out.println("lutfen sekildeki satir sayisini girini");
        int satirSayisi = scann.nextInt();

        System.out.println("lutfen sekildeki her satir eleman sayisini girini");
        int satirdekiElemanSayisi = scann.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) { // satirlar
            for (int j = 1; j <=satirdekiElemanSayisi ; j++) { // her satirdeki eleman sayisi
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
