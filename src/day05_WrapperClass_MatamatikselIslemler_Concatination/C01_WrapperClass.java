package day05_WrapperClass_MatamatikselIslemler_Concatination;

public class C01_WrapperClass {
    public static void main(String[] args) {

        /*
        primitive data turleri
        boolean char byte short int long float double
        Boolean Character Byte Short Integer Float Double
         */

        // 1- ayni data turundeki primitive ve Wrapper classdan
        // olusturulan veriablelari birbiirne direk atiyabiliriz

        int sayiint = 10;
        Integer sayiWrapperInt = sayiint;

        sayiWrapperInt= 40;
        sayiint=sayiWrapperInt;

        //2- Wrapper classlar non primitive olduklari icin
        // hazir methodlari vardir

        // String olarak verilen bir sayiyi matamatiksel islem yapabilecegimiz
        //dataya cevirebilmek
        String fiyat1 = "9.94";
        String fiyat2  ="21.74";
        String fiyat3 = "14.86";
        // string olarak verilen 3 fiyatin ortalamasini bulun

        System.out.println(fiyat1+fiyat2+fiyat3);//9.9421.7414.86 Yanlis

        double fyt1Dob=Double.parseDouble(fiyat1);
        double fyt2Dob=Double.parseDouble(fiyat2);
        double fyt3Dob=Double.parseDouble(fiyat3);
        System.out.println("ortalama fiyat"+(fyt1Dob+fyt2Dob+fyt3Dob)/3);//15.513333333333334

        //int data turunun alabilecegi en buyuk degeri yazdirin
        System.out.println(Integer.MAX_VALUE);//2147483647

        char chr = 'M';
        // verilen chr degeri buyuk harf ise true degilse false yazdirin
        System.out.println(Character.isUpperCase(chr));//true

        // verilen chr degeri sayi ise true degilse false yazdirin
        System.out.println(Character.isDigit(chr));//false

        // verilen chr harf  ise true degilse false yazdirin
        System.out.println(Character.isAlphabetic(chr));//true

        String str= "Java Candir";
        //stri Buyuk harfler ile yazdirin
        System.out.println(str.toUpperCase());//JAVA CANDİR

        chr='c';
        //chr veriable'nin degerini buyuk harf olarak yazdirin
        System.out.println(Character.toUpperCase(chr));

    }
}
