package day07_operatorler_ifElseStatments;

import java.util.Scanner;

public class C05_SinifGecme {
    public static void main(String[] args) {
        // kullanicidan notunu alin notu 50 veya
       // daha buyukse "sinifi gectin" yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen notunuzu girinz");

        double not = scann.nextDouble();

        if (not >= 50){
            System.out.println("sinifi gectin");

        }




    }
}
