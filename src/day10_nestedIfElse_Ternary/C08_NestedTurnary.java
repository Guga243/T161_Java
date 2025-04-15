package day10_nestedIfElse_Ternary;

import java.util.Scanner;

public class C08_NestedTurnary {
    public static void main(String[] args) {
        // kullanicidan bir sayi isteyin
        // pozitif negatif notr seceneklerinden uygun olani yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir tamSayi giriniz");
        int sayi = scann.nextInt();

        System.out.println(sayi>0? "pozitif" : "burasi negatif veya notr olabilir");

        System.out.println(sayi>0? "pozitif" : (sayi<0? "negatif ":"notr"));

        System.out.println(sayi>0? "pozitif" : sayi<0? "negatif ":"notr");
    }
}
