package day11_switchStatement_StringManipulation;

public class C07_SM_CharAt {
    public static void main(String[] args) {

        // javada index 0 dan baslar, birinci harf icin index 0 (sifir) olur
        String str ="Java Guzeldir";
        System.out.println(str.charAt(0)); //J

        //4.cu harfi yazdirin

        System.out.println(str.charAt(3));//a

        // son harfi yazdirin
        System.out.println(str.charAt(13-1));//r

        // karakter sayisinin 13 oldugunu biliyorsak
        // sondan 3 karakteri yazdirin

        System.out.println(str.charAt(10));//d

        // karakter sayisinin 13 oldugunun biliyorsak 13'ci indexteki karakteri yazdirin
       // System.out.println(str.charAt(13)); // sinirlarin disinda hata verir


    }
}
