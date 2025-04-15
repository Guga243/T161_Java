package day08_IfElseStatments;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {

        /*
        kullanicidan bir tam sayi isteyip
        asagda verilen 4 sarti kontrol edin
         ve istenenleri yazdirin

         eger 4 konrtolden hic birin'de if budy calisip
         mesaj yazdirilmazsa
         "nasil sayi sectin, hicbir sarti saglamiyor yazdirin"
         */

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scann.nextInt();



        // girilen tamsayi 5'in kati ise "sayi 5'e bolunuyor" yazdirin
        if ( sayi % 5 == 0){
            System.out.println("sayi 5'e bolunuyor");
        }
        // sayi 100'den buyukse "buyuk sayi girdiniz" yazdirin
        if (  sayi > 100 ){
            System.out.println("buyuk sayi girdiniz");
        }
        // sayi 1000'den buyukse "guzel sayi" yazdirin
        boolean sonuc = sayi > 1000;
        if (sonuc) {
            System.out.println("guzel sayi");
        }

        // sayi cift sayi ise "cift sayilari severim yazdirim

        if (sayi%2 ==0){
            System.out.println("cift sayilari severim");
        }

        // 1yontem tum sartlari tersine ! tek bir if ile
        // kontrol edebiloiriz

        if (!(sayi % 5 == 0) &&
                !(  sayi > 100 ) &&
                !sonuc &&
                !(sayi%2 ==0)){
            System.out.println("\"nasil sayi sectin, hicbir sarti saglamiyor yazdirin\"");
        }


    }
}
