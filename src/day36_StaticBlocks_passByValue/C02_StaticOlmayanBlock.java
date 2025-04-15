package day36_StaticBlocks_passByValue;

public class C02_StaticOlmayanBlock {

    C02_StaticOlmayanBlock(){
        System.out.println("constructor calisti");


    }


    public static void main(String[] args) {
        System.out.println("main method calisti");

        C02_StaticOlmayanBlock obj1 = new C02_StaticOlmayanBlock();
        System.out.println("obj1");

        C02_StaticOlmayanBlock obj2 = new C02_StaticOlmayanBlock();
        System.out.println("obj2");

        C02_StaticOlmayanBlock obj3 = new C02_StaticOlmayanBlock();
        System.out.println("obj3");

    }


    public static void method1(){
        System.out.println("method1 calisit");
    }

    static {
        System.out.println("static block calisti");
    }

    {
        System.out.println("static olmayan kod blogu calisiti");
    }
    /*
    static blocklar CLASS CALISMAYA BASLAMADAN YAPILACAK ON HAZIRLIKLAR ICIN KULLANILIR

    static olmayan blocklar' da OBJE OLUSTURMADAN YAPILMASI GEREKEN ON HAZIRLIKLAR ICIN KULLANILIR
     */


}
