package day11_switchStatement_StringManipulation;

import java.util.Scanner;

public class C03_SayiyiYaziyaCevirme {
    public static void main(String[] args) {
        // kullanicidan bir rakam isteyin
        // girilen rakami yazi ile yazdirin
        // orn input 7 , output : yedi
        // 0 ile 9 arasindeki sayilar disinda sayi yazarsa hata mesaji verin

     Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scann.nextInt();

        switch (sayi){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("hatali rakam girdiniz");
        }
    }
}
