package day07_operatorler_ifElseStatments;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // kullanicidan bir tam sayi aliniz
        // girilen sayi cift sayi ise "cift sayi girdiniiz"
        //yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int tamSayi = scann.nextInt();

        if (tamSayi %2 ==0){
            System.out.println("cift sayi girdiniz");
            // bagimsiz if cumleleri boolean sarta odaklanmistir
            // boolean sart girilen deger icin true ise
            // if budy calisir
            // boolean sart girilen deger ise false ise
            // if budy calismaz

            // if budy'nin calismamasi if statmentin calismadigi anlamaina
            // gelmez

            // bagimsiz if cumleleri adindan da anlasilacagi gibi
            // kodun geri kalanindan bagimsizdir


            // girilen tam sayi 5'in kati ise "sayi 5'e bolunuyor"

            if (tamSayi%5==0){
                System.out.println("sayi 5'e bolunuyor");


                // sayi 100 den buyukse "buyuk sayi girdiniz"

                if (tamSayi>100){
                    System.out.println("buyuk sayi girdiniz");
                }

                // sayi 1000 den kucukse "guzel sayi" yazdirin

                boolean sonuc = tamSayi<1000;
                if (sonuc){
                    System.out.println("guzel sayi");


                }
               // String str ="ajava";
               // if (str){
                  //  System.out.println("if de sadece boolean deger bulunur");
               // }

            }

        }
    }
}
