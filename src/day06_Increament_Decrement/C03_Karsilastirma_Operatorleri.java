package day06_Increament_Decrement;

public class C03_Karsilastirma_Operatorleri {
    public static void main(String[] args) {

        int a= 10;
        int b=15;
        int c=25;

        System.out.println(a>=b);// false
        System.out.println(c==a+b);//true
        System.out.println(c!=b);//true
        System.out.println(c=b);// atama yapar c'i yazdiriri 15

        //eger karsilastirma operatorleri char degerler icin kullanilirsa

        System.out.println('f'>'c');// true 102>99
        // askii tabl degerlerine gore karsilastirma yapar

        System.out.println('B'<'z');//true
        System.out.println('q'!='q');//false

        int x=127;
        int y=127;
        int u=128;
        int o=128;

        System.out.println(x==y);//true
        System.out.println(u==o);//false int 127kadar
        



    }
}
