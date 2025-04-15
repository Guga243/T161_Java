package day04_dataCasting;

public class C05_charDataTurundeCasting {
    public static void main(String[] args) {

        /*
        char data turu askii table kodlarini kullanir
        herbir char karakterin matamatiksel bir karsiligi oldugu icin
        char data turu matamatiksel islemde kullanilirsa
        aski table deki isleme gore girer

        char data turu bu ozelligi ile
        int data turu ile iliskilendirebilir

        metni olusturan karakterleri tutmasi yonuyle de
        String ile 
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

        //chr =bl;
        //chr =(char) bl;

        //chr = str;
        //chr=(char)str;

        chr=(char) byt;
        chr=(char) shrt;
        chr=(char) sayiInt;
        chr=(char) lng;
        chr=(char) flt;
        chr=(char) dbl;

        char chr1 ='a';
        char chr2 ='b';
        System.out.println(chr1+chr2);//195

        System.out.println('H'>'B');//true
        System.out.println('b'>'B');//true

        // verilen bir char karakterden sonraki 3 karakteri yazdiirn
        // orn: input 'm' ise output  n o p olacak

        char verilenKarakter ='m';
        System.out.println((char) (verilenKarakter+1));
        System.out.println((char) (verilenKarakter+2));
        System.out.println((char) (verilenKarakter+3));





    }
}
