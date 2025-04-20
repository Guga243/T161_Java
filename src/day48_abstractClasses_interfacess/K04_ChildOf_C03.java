package day48_abstractClasses_interfacess;

public class K04_ChildOf_C03 implements I03_Interface {

    /*
    bir clasin bir interface'i parent edinmesi icin extens degil impement keyword kullailir

     */

    public static void main(String[] args) {
        System.out.println(sayi); // 10
         // sayi1=19; final oldugu icin deger atilamaz
        // interface'ler full kuralci o yuzden finaldir

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768

        // java da sabit olan degere sahip public static final
        // veriable sisimleri buyuk harfle yazilir
    }

    public void method1() {

    }

    public void method2() {

    }

    public String method3() {

        return null;
    }

    public void method5() {

    }


}
