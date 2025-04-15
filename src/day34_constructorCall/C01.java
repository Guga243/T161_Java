package day34_constructorCall;

public class C01 {

    // java da isim(ilgili parametreler) sintex'i method call icin kullanilir

    // method icinde obje olusturulurken C01() yazarsak constructoru,
    // obje olusturma disinda C01() yazarsaniz method calistiriir

    // ihtiyac oldugunda constructor icinde obje olusturmadan baska konstructoru
    // call yapabilmek icin this() kullanilir

    /*
    KURALLAR

    1- konstructor call ilk satirda yapilmalidir ==> this()
    2- birinci kuraldan dolayi bir constructpr icinden birden fazla constructor call yapilamaz
     */

    C01(){

    }


    C01(String isim){
        this( );
        C01(); // METHODU CALISTIRIR


    }

    public static void main(String[] args) {

        C01 obj1 = new C01(); // constructor'i calistirir

        C01(); // method call
    }

    public void method1 (){

        C01 obj2 = new C01();
    }

    public static void C01(){

    }


}
