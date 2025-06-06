package day18_MethodOlusturma;

public class C03_ismiDuzenleme {
    //   verilen isim ve soyismini kontrol edip
    //	- ismi daha uzun ise,
    //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
    //  - soyisim daha uzun ise,
    //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.

    public static void main(String[] args) {
        verilenIsimiDuzenleYazdir("yusuf","dikmen");
    }


    public static void verilenIsimiDuzenleYazdir(String isim, String soyisim){

        if ( isim.length() > soyisim.length()){
            // isim daha uzunsa
            //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).toLowerCase()
            );
        } else if (soyisim.length() > isim.length()) {
            // soyisim daha uzunsa
            //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.
            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyisim.toUpperCase()
            );
        }
    }

}
