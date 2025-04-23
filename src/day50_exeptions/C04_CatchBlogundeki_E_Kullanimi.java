package day50_exeptions;

import java.util.Scanner;

public class C04_CatchBlogundeki_E_Kullanimi {
    public static void main(String[] args) {

        // kullanicidan tam bir sayi isteyip
        // karesini yazdirin

        /*
        catch blogunda yakalanan exeption E objesine kaydedilir
        objenin ismi e olmak zorunda degil ama genek=lde e kullanilir

        e objesi ait olusturuldugu exeption clasina bagli olarak bazi hazir methodlara
        sahipdir

        exeption yakalandiginda ne yapilacahi bize verilen goreve gore duzenlenir
        eger istenirse sadece bir hata mesaji yazdiririrz
        istenirse e objesi hataya ait bazi ipuclarida kullaniciya verilebilir

         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");

        int sayi = 0;
        try {
            sayi = scann.nextInt();
            System.out.println("girilen sayinin karesi : "+sayi*sayi);
        } catch (Exception e) {
            System.out.println("tam sayi giriniz dedik");
        }


    }
}
