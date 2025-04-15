package day19_methodOlusturma;

public class C01_sifreUygunMu {
    public static void main(String[] args) {

        // verilen bir sifre icin
        // Asagdeki sartlari kontrol ediniz
        // ve sifre uygun ise true degikse falsedonduren method olusturun
        // ilk harfi kucuk harf olmali
        // son karakter rakam olmali
        // sifre bosluk icermeli
        // uzunlugu en az 10 karakter olmali

 boolean sonuc =sifreUygunMu("du ga90");

    }


    public static boolean sifreUygunMu(String sifre){


        // return type void disinda bir data tur secilmis ise
        // method'un sonunda secilen data turune uygun bir deger return edilmelidir


        int flag =10; // FLUG DEGERININ ONEMI YOK HER HATADA BIR(AYNI) KERE DEGER ATTIRACAZ

        /*
        tum hatalari yazdirmami istediginden bagimsiz if cumleleri kullanmaliyiz

        bagimsiz if  cumlelerinde
        bagimsiz  tum tum sartlar saglandiginda konrtol edebilmek icin
        FLAG VEYA SAYAC KULLANALIM

         */
        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0); // ILK HARF KAYDEDILDI

        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("ilk harf kucuk olmali");
            flag=11;
        }

        //          - son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);  // SON KARAKTER KAYDEDILDI

        if (sonKarakter < '0' || sonKarakter>'9'){
          ;
            flag=11;
        }
        //                - sifre bosluk icermemeli

        if (sifre.contains(" ") ){

            flag=11;
        }
        //              - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){

            flag=11;

        }
        /*
        flug 10 veya 11 degerini alabilir
        flug ==10 ise hicbir hata mesaji yazdirmadi
        flug == 11 ise hata mesaji yazdirldi ama kac mesaj mesaj yazdirildigini bilemmeyiz
         */


        if (flag==10){
            return true;
        }else
            return false;

    }
}






