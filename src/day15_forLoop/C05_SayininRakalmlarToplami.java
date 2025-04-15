package day15_forLoop;

import java.util.Scanner;

public class C05_SayininRakalmlarToplami {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alip
        // rakamlar toplamini asagdeki gibi yazdirin
        // input 1453 => 1+4+5+3 =13
        //output "girilen 1453 sayinin rakamlar toplami : 13"

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi girinz");
        int girilenSayi = scann.nextInt();
        int sayi=girilenSayi;

        int rakam =0;
        int rakamlarToplami =0;

        //123
        rakamlarToplami+=sayi%10;
        sayi/=10;

        rakamlarToplami+=sayi%10;
        sayi/=10;

        System.out.println("giriln"+girilenSayi + "sayinin rakamlar toplami "+rakamlarToplami);

    }
}
