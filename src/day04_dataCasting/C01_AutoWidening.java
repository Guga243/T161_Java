package day04_dataCasting;

public class C01_AutoWidening {
    public static void main(String[] args) {
        /*
        java daha dar kapsamli data turunde degeri daha genis data yurune
        otomatik olarak atar

         */

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";


        /*bl = chr;
        bl= sayiInt;
        bl =str

        str = bl;
        str= chr;
        str = lng;
        str = dbl;

        boolean ve Sreing  data turundeki bir veriablea
         baska data turundeki bir degeri atamayiz
        */

       // byt = shrt; // 23
       // byt = sayiInt; // 30
       // byt = lng; // 40
       // byt = flt; // 3.5F
       // byt = dbl; // 4.5

        shrt = byt;
        //shrt = sayiInt;
       // shrt = lng;
       // shrt = flt;
       // shrt = dbl;

        sayiInt = byt;
        sayiInt = shrt;
//        sayiInt = lng;
//        sayiInt = flt;
//        sayiInt = dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
//        lng = flt;
//        lng = dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
//        flt = dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;

        int sauo1 = 20;
        int sayi2 = sauo1; // casting bir veriableya farkli data turunden deger atamak demektir bu dger atamadir
    }
}
