package day19_methodOlusturma;

public class C07_AayniIsimdeBirdenFazlaMethodOlusturma {

    /*
    1- bir class da bir biri ile tamamen ayni olan birden fazla metod olusturulamaz

    2- method da parametre olarak kullanilan veriabllerin isimlerinin degisik olmasi
    methodlarin birbirinden farkli hale getirmez

    3- JAVA BIR METHODU METHOD SIGNATUREI ILE TANIMLAR
       JAVA DEKI SINGATURE = METHOD ISMI + PARAMETRELERIN DATA TURLERI
       OLARAK TANIMLANABILIR


    4- BIR KLASS DA AYNI ISIMDE BIRDEN FAZLA METHOD OLUSTURABILMEK ICIN METHODLARIN
    SINATURELERINI FARKLILASTIRMALIYIZ

    5- bir class da singature farklilastirarak ayni isimde birden fazla method olusturmaya overloading denir
     */
    public static void main(String[] args) {
        toplama(4, 6);

    }

    //bir klas da ayni isimde birden fazla method olusturulur mu
    public static void toplama(int sayi1, int sayi2){ // TOPLAMA INT INT
        System.out.println("2int toplami" +(sayi1+ sayi2));
    }
    public static void toplama(int sayi1, double sayi2){ // TOPLAMA INT DOUBLE
        System.out.println("2int toplami" +(sayi1));
    }

}




