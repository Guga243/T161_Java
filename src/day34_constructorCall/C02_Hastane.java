package day34_constructorCall;

public class C02_Hastane {

    /*
    local veriable'lar static olarak tanimlanamaz

    static keyword class levelde kullanilabilir

    class level veriablelerin static veya instance olmasina
    objelerin bu veriableleri kullanmasina gore karar veririz

    - tum veriableler icin ortak tek bir deger alan veriable varsa "static:"
    - her bir obje icin birbirinden farkli, bagimsiz bir deger almasi gereken varsa "instance" tanimlanir

    500 personeli olan hastane de
    static olarak tanimlanan bashekim ismi veriable'i sadece bir tane olusturulur
    ve tum objelerin bashekim ismi degeri aynni olur

    instance olarak tanimlanan personel ismi veriable'i
    java tarafindan 500 kere kopyalanip tum personele atamalar yapilir

    instance veriable mi daha iyidir
    yoksa static veriable mi?

    - erisim acisindan static veriable daha avantajlidir
    - veriable'larin deger kontrolu yapilmasi acisindan ise instance


     */

    public static String hastaneIsmi ="Yildiz Hastanesi";
    public static String hastaneAdresi ="Cankaya";
    public static String hastaneTelefonu ="312565489";
    public static String bashekim ="Dr.Eda";

    public String persIsmi= "isim atanmadi";
    public String persAdresi ="adres atanmadi";
    public String persTelefonu ="tel atanmadi";


    public static void main(String[] args) {

       //  static int sayi1 =45;
        // Modifier 'static' not allowed here

    }
    public static void method1(){

       //  static String isim ="";
        // Modifier 'static' not allowed here
    }

    public void method2(){
       //  static char chr ='a';
        // Modifier 'static' not allowed here

    }
}
