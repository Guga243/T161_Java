package day07_operatorler_ifElseStatments;

public class C02_And_OperatorleriKarsilastirma {
    public static void main(String[] args) {

        /*
        & veya && kullanimini asagdeki nota gor tercih edebiliriz
        eger sonuc odakli isek ve bir an once sonuca ulasmak istiyorsak
        && kullanmaliyiz

        eger islem odakli isek ve tum karsilastirmalari mutlaka kontrol etmek istiyorsak
        & kullanmaliyiz

         */
        int a = 10;
        int b = 20;

        boolean sonuc1=true;
        boolean sonuc2=true;
        boolean sonuc3=true;

        boolean genelSonuc =  (sonuc1= a>=b)     &  (sonuc2 = a<b)     &      (sonuc3=a>b-8) ;

        System.out.println( "& sonuc1 : " + sonuc1);
        System.out.println( "& sonuc2 : " + sonuc2);
        System.out.println( "& sonuc3 : " + sonuc3);
        System.out.println( "& genelSonuc : " + genelSonuc);
        boolean sonuc4=true;
        boolean sonuc5=true;
        boolean sonuc6=true;
        boolean genelSonuc3 =  (sonuc4= a>=b)     &&  (sonuc5 = a<b)     &&      (sonuc6=a>b-8) ;
        System.out.println( "&& sonuc4 : " + sonuc4);
        System.out.println( "&& sonuc5 : " + sonuc5);
        System.out.println( "&& sonuc6 : " + sonuc6);
        System.out.println( "&& genelSonuc3 : " + genelSonuc3);

























    }
}
