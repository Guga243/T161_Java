package day16_NestedForLoop;

import java.util.Scanner;

public class C03_stringTerseCevirme {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve
       // String’i tersine cevirip tersMetin isminde bir variable'a kaydedin.

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen metin gir");
        String metin = scann.next();

        String tersMetin = "";

        for (int i = metin.length()-1; i>=0 ; i--) {
            tersMetin +=metin.charAt(i);

        }
        System.out.println("girilen metnin tersi "+ tersMetin);

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("palindrome");
        }else {
            System.out.println("degil");
        }
    }
}
