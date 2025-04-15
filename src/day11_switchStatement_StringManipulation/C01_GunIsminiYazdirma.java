package day11_switchStatement_StringManipulation;

import java.util.Scanner;

public class C01_GunIsminiYazdirma {
    public static void main(String[] args) {

        /* kullanicidan gun numrasini girmesini isteyin
        girilen sayiya gore 1 - pazartesi 7 -pazar olacak sekilde
        gun ismini yazdirn
        kullanici 1-7 arasindaki sayi disinda bir karakter girerse hata versin
         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen gun no gir");
        int gunNo = scann.nextInt();

        if (gunNo==1) System.out.println("pazartsi");
        else if (gunNo==2) System.out.println("sali");
        else if (gunNo==3) System.out.println("carsamba");
        else if (gunNo==4) System.out.println("persembe");
        else if (gunNo==5) System.out.println("cuma");
        else if (gunNo==6) System.out.println("cumartesi");
        else if (gunNo==7) System.out.println("pazar");
        else System.out.println("hatali gun");


        // ayni islemi switch ile yapalim

        switch (gunNo){
            case 1:
                System.out.println("pazartesi");
            break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("hatali gun sayisi");

        }



    }
}
