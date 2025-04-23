package day49_interface_Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class K04_IfElseIleCozulemeyenExeptionlar {
    public static void main(String[] args) {

        /*
        iyi bir kod yazari :
        kodu yazdiktan sonra kullanicinin hangi giciklik
         haklarini kullanabilecegini on gorur
        ve bu giciklik haklari icin cozum uretir
        bu soruya gore iki risk goruyoruz

        1- bolecek sayi olarak 0 girilmesi(aritmaticexeption)
        2- int istedigimiz halde, int disinda data turunde deger girilmesi (inputmismatchexeption)

        1-riski if else ile kontrol altina alabilriz (handle edilebilir)
        2-riski if else ile handle etmemiz mumkun degil

        if else ile cozumedigimiz riskleri
        try-catch blocklari ile hendle edebilriz

         */

        // kullanicidan 2 tam sayi isteyin
        // 1.sayiyi 2. sayiya bolup
        // islem sonucunun tam sayi kismini yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bolme islemi icin iki tam sayi giriniz");

        try {
            int sayi1 = scann.nextInt();
            int sayi2 = scann.nextInt();

            if (sayi2 !=0){
                System.out.println( "bolme islemi sonucu : "+sayi1/sayi2);
            }
        } catch (InputMismatchException e) {
            System.out.println("tam sayi gir KARDESIM");
        }


    }
}
