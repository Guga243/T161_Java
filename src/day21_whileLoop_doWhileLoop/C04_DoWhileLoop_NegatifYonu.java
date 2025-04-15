package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop_NegatifYonu {
    public static void main(String[] args) {


        /*
        do while loop'un avantaji:
        loop body'sinin en az bir kere calismasidir

        do while loop'un dezavantaji nedir
         loop body'si en az bir kere calisir

         ornegin gorevdeki gibi 0 girdiginde loop bady'sinin hic calismamasi gerekirken
         do body'si calistigi icin 0 yazdirdi
         */



        // kullanicidan alinna pozitif tamsayidan baslayarak
        // 1'e kadar olan sayilari aralarinda 1 bosluk olacak sekilde
        // yan yana yazdirin


        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayyi giriniz");
        int sayi = scann.nextInt();

        do {
            System.out.print(sayi+" ");
            sayi --;
        }while (sayi>=1);

    }
}
