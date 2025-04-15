package day09_ifElseIfStatements_NestedElse;

import java.util.Scanner;

public class C04_ElseIleBitmezse {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi hem 3 hem 5 ile bolunuyorsa "super",
        // sayi sadece 3 ile bolunuyorsa "3'un kati"
        // sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin

        // (not 3 ile 5 e bolunmeyen 23 gibi sayilar gorevde hic bir sey yazdirmaz)
        /*
        ONEMLI NOTLAR:
        1. Bir elek sisteminde siralama dogru olmazsa sonucta hatali olabilir
        elekleri siralarken dar olandan baslamalisiniz !!!!

        2. else ile birbirine baglayan if cumlelerinde
        sadece biri calisir


       3. if - else if cumleleri else ile bitmek zorunda degil
         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen pozitif tamsayi giriniz");
         int tamSayi = scann.nextInt();

         if (tamSayi%5==00 && tamSayi%3==0) System.out.println("super");
         else if (tamSayi%5==0) System.out.println("5'in kati");
         else if (tamSayi%3==00) System.out.println("3'un kati");




    }
}
