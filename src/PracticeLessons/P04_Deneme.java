package PracticeLessons;

import java.util.Scanner;

public class P04_Deneme {
    public static void main(String[] args) {

        /*Bir öğrencinin notuna göre harf notunu belirleyen bir Java programı yazın.

        90 ile 100 arasındaki notlar için "A"
        80 ile 89 arasındaki notlar için "B"
        70 ile 79 arasındaki notlar için "C"
        60 ile 69 arasındaki notlar için "D"
        60'tan düşük notlar için "F" yazdırılsın.

         */
        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu giriniz");

        double not = scann.nextDouble();

        if (not>=90 && not<=100) System.out.println("A");
        else if (not>=80 && not<=89) System.out.println("B");
        else if (not>=70 && not<=79) System.out.println("C");
        else if (not>=60 && not<=69) System.out.println("D");
       else if (not>=0 && not<60) System.out.println("F");
       else System.out.println("geversizz Not");



       // bir sayinin pozitif veya negtif veya 0 oldugunu yazdirin

        Scanner scann1 = new Scanner(System.in);
        System.out.println("Lutfen bir sayi griiniz");
        int sayi= scann.nextInt();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String text = scanner.nextLine();

        // 5. ve 10. karakterler arasındaki kısmı almak
        String substring = text.substring(4, 10);  // 4. index'ten (5. karakter) 10. index'e kadar

        System.out.println("Alınan substring: " + substring);


        String str5 ="guga";
        System.out.println(str5.length());



    }



}
