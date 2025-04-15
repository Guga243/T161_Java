package day39_varargs_stringBuilder;

public class C03_DikkatEdilecekler {

    public static void main(String[] args) {

        //  Kac tane argument yazarsak yazalim
        //  ilk argument haric geriye kalanlari toplayip
        //  bulunan toplam ile ilk argumanin carpimini yazdiran bir method olusturun
        islemYap(3,5,2); // islem sonucu : 21
        islemYap(3,1); // islem sonucu : 3
        islemYap(0,2,3,4,5,6,7,8); // 0

        islemYap(0);
       // ==>  parametresiz olmaz cunku varargs degil
        // islemYap();

        /*
        parametre olarak kullanilan bir varargs istenen sayida argument kabul eder
        eger varargs'a hic eleman yollanmazsa\ varargs'in degeri bos bir array olur
        CTE vermez,
        AMMAAAA varargs disindaki parametrelere deger atanmadiginda CTE olur
         */

    }

    public static void islemYap(int ilkSayi, int ... geriyeKalanlar){

        int toplam =0;
        for (int each :geriyeKalanlar){
            toplam+=each;

        }

        if (geriyeKalanlar.length ==0){
            System.out.println("verilen ergumentler islem yapmamk icin uygun degel");
        }else {
            System.out.println("islem sonucu : "+ilkSayi*toplam); // islem sonucu : 21
        }
    }
}
