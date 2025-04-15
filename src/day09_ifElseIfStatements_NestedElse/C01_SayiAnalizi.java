package day09_ifElseIfStatements_NestedElse;

import java.util.Scanner;

public class C01_SayiAnalizi {
    public static void main(String[] args) {
        // Kullanicidan tamsayi isteyin
        // kullanici negatif sayi girerse uyarin
        // tek basamakli sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasi (sinirlar dahil) sayi girerse " iki basamakli sayi"
        // kullnaici 100-999 arasi sayi girerse "uc basamakli sayi"
        // kullanici 1000 ile daha buyuk sayi girerse " cok buyuk sayi " yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scann.nextInt();
        
        if (sayi<0) System.out.println("pozitif sayi giriniz");
        else if (sayi<10) System.out.println("girdigiiz sayi rakam");
        else if(sayi<100) System.out.println("iki basamakli sayi");
        else if (sayi<1000) System.out.println("uc basamakli sayi");
        else System.out.println("cok buyuk sayi");




    }
}
