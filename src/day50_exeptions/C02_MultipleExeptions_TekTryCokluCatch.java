package day50_exeptions;

import java.util.Scanner;

public class C02_MultipleExeptions_TekTryCokluCatch {
    public static void main(String[] args) {
        String str = "Java candir";
        int[] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        //        // kullanicidan index olarak bir tam sayi isteyin
        //        verilen negatif olmayan bir tamsayiyi index olarak kabul edip
        //        // yukardaki str ve arr'deki o index'de bulunan harfi ve sayiyi yazdirin
        //        // eger kullanici negatif veya index'den buyuk sayi girerse
        //        // hata mesaji ve son index'i yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen index olarak negatif olmayan bir tam sayi giriniz");

        int index = scann.nextInt(); // kullanicinin int girmeme riski bu soruda ignore edildi

        /*
        birden fazla exeption olsiligi oldugunda
        try-catch'i 4 farkli sekilde dizayn edebiliriz

       1-  en siple hali:
       riskli kodlari ayri ayri ele alabiliriz

       2- tek bir try bolgu ile risk sayisinda
        catch bologu yazilabilir

        eger amac sadece sorunu yakalamak ve kotrol eltina almak ise
        bu yontem daha degeli toplu ve sade oldugu icin tercih edilebilir
        ammaaa
        hatayi bulmak ve cozmek istersek
        bu yontem tavsiye edilmez

         */


        try {
            System.out.println("arrayde verilen indexdeki sayi : "+ arr[index]);
            System.out.println("arrayde verilen indexdeki karakter : "+ str.charAt(index));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index gecersiz, index 0 - " + (arr.length-1) + " bu sayi arasinda olmalidir");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index gecersiz index 0 ile " + (str.length()-1) + " arasinda olmali");
        }


    }
}
