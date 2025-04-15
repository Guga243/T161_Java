package day07_operatorler_ifElseStatments;

import java.util.Scanner;

public class C07_DikkatEdilecekler {
    public static void main(String[] args) {


        // Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scann.nextInt();


        if (sayi%3==0){
            System.out.println("uc ile bolunebilen sayi");
        }
    }
}
