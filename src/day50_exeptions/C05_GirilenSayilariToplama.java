package day50_exeptions;

import java.util.Scanner;

public class C05_GirilenSayilariToplama {
    public static void main(String[] args) {

        // kullanicidan girmek istedigi kadar tam sayi girmesini isteyin
        // kullanici tam sayi disinda bir input girerse
        // kullaniciya uyari yazdirin ve o inputu isleme almayin
        // kullanici islemi bitirmek icin Q veya q ya basmalidir
        // kullanici islemi bitirdiginde
        // kac gecerli sayi girdigini ve girilen gecerli sayilarin toplamini yazdirin

        Scanner scann = new Scanner(System.in);

        int girilenSayi =0;
        int toplam =0;
        int sayac=0;
        String girilenSayiDisiDeger ="";
        // islemin kac kere tekrar edecegi belli olmadigindan while loop'u
        // islem icin kullanicinin oncellikle deger girmesinin istedigiizden do while loopu
        // tercih ettiik

        do {

            try {
                System.out.println("lutfen toplanmak uzere bir tamsayi giriniz");
                girilenSayi= scann.nextInt();
                toplam+=girilenSayi;
                sayac++;
            } catch (Exception e) {
               // kod buraya geldiyse scann.nextInt(); konsola gittiginde
                // tam sayi bulamamais ve islem yapmadan exeption vermistir
                girilenSayiDisiDeger = scann.nextLine();

                if (girilenSayiDisiDeger.equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("tam sayi girmelisiniz");
                }

            }

        }while (! girilenSayiDisiDeger.equalsIgnoreCase("q")); // loopunndevam etmesi icin gerekli sart
        // q'e esit olmadigi surece devam etsin

        System.out.println("girilen "+sayac + " tamsayinin toplami "+toplam);



    }
}
