package day_BilmemKac;

import java.util.Scanner;

public class ornek_if_Else_If {
    public static void main(String[] args) {

        // Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yaş bilgisini alıyoruz
        System.out.print("Yaşınızı girin: ");
        int age = scanner.nextInt();

        // Kullanıcıdan öğrenci durumunu alıyoruz
        System.out.print("Öğrenci misiniz? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Koşullara göre mesajı yazdırıyoruz
        if (age >= 18 && isStudent) {
            System.out.println("Genç ve üniversite öğrencisi: Yetkin.");
        } else if (age >= 18 || isStudent) {
            System.out.println("Genç, fakat üniversite öğrencisi değil.");
        } else {
            System.out.println("Hatalı giriş, tekrar deneyiniz.");
        }





    }
}
