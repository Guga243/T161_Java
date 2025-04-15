package day42_inheritance;

public class C06_Child extends C05_Parent{

    int childInt =67;
    String childString ="Java bir tane";

    public static void main(String[] args) {

        /* child clas da olusturulan bir obje
         otomatik olarak parent classdeki  tum ozelliklere sahip olur

        bir objeye classdeki instance veriableler ve degerlerinin
        bir kopyasini alip yapistirma gorevi
        Constructorda dir

        yanii child classdeki objenin parent classdeki
        sahip olmasi icin child class constructoru ile birlikte
        parent class constructoru da calismalidir

        bunun icin java extends keyword kullanan classlerdeki
        her constructorun ilk satirina
        gizli bir super() konstructor koymustur
         

         */

        C06_Child child1 = new C06_Child();

        System.out.println(child1.childInt);
        System.out.println(child1.childString);

        System.out.println(child1.parentInt);
        System.out.println(child1.parentStr);

    }

}
