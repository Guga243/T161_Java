package day22_Scope;

public class C03_ClassLevelVeriables {
    /*
    class levelde olusturulan veriable larin scopu tum classi dir

    yani tum class dan bu veriableleri kullanabilriiz
    ANCAKKK - class level veriabller
    tanimlanirken static keyword kullanilip kullanilmamasina gore
    class icerisinden erisim yontemleri degisir

    static keyword kullanmayan veriable'lar Instance olarak adlandirilir


    NOT: local veriableler de static keyword kullanilamaz

    eger veriable static ise her methoddan kullanilabilir

    ama veriable static degilse
    o zaman secim hakki methoda gecer
    method sttic ise olmayan hic bir sayi sinirlarindan gecemez


    static olmayan methodun secim hakki olmaz
    tum veriableler static olmayan methodlardan kullanilabilr

     */

    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    public static void main(String[] args) {


        method1();
       //  method2(); // static olmayan static method icine giremez

      //  System.out.println(
              //  sayiS+ " "+strI+ " "+ sayI+ " "
      //  );

    }


    public static void method1(){

     //   System.out.println(
            //    sayiS+ " "+strI+ " "+ sayI+ " "
     //   );

    }



    public void method2(){
        System.out.println(
                sayiS+ " "+strI+ " "+ " "
        );

    }
}
