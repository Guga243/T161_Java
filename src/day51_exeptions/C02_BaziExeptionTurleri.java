package day51_exeptions;

public class C02_BaziExeptionTurleri {
    public static void main(String[] args) {

        // 1- StringIndexOutOfBoundsExption
        String str ="java";
       // System.out.println(str.charAt(13)); // StringIndexOutOfBoundsException

        // 2- ArrayIndexOutOfExeption
       String [] isimler ={"ali","veli"};
      //  System.out.println(isimler[23]); // ArrayIndexOutOfBoundsException

        //3- arithmeticexeption
      //  System.out.println(6/0); // ArithmeticException: / by zero

        //4- filenotfoundexeption
        // bilgisayardan bir dosyaya ulasmak istediinde dosya bulunamazsa

        //5- IO Exeption
        // dosyadan bilgi okuma ve doyaya bilgi ekleme ile ilgili tum exeptionlarin parentleri

        //6-
        String a ="";
        String b ;
        String c =null;
       //  System.out.println(b); // Variable 'b' might not have been initialized
      //   System.out.println(c.length());
        // null olarak isaretlenen bir string yazdirlabilir ama baska bir islem icin  ==> NullPointerException

        // 7-  ClassCastException
        // aralarinda parent child iliskisi olmayan class'lari
        // objekt araci yaparak atama yapmaya calisirsaniz
        String s ="Ali";
    //   Integer k = s; // Required type:Integer , Provided:String
        Object obj = s; // objekt parent class oldugundan kabul eder

        Integer k = (Integer) obj;  // farkli data turlerini bir birine atanamaz
                          //  parent - child arasinda atama yapilabilir



        // 8- // NumberFormatException
        String sayi1 ="22"; // eger sayi disinda baska birsey girersen
        String sayi2 ="67"; // // NumberFormatException
        // strin olarak verilen iki sayiyi toplayin
        System.out.println(Integer.parseInt(sayi1)+Integer.parseInt(sayi2)); // 90

        // 9 runtimeexeptions
        // run time da ortaya cikan exeptionlar

        // 10-



    }
}
