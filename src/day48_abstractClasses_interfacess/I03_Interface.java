package day48_abstractClasses_interfacess;

public interface I03_Interface {
    /*
    tum veriableler public static ve final'dir
    basinda bu keyword lar kullanilmasada bu ozellikleri tasir
    // bunlari yazsakta yazmasakta

     */

    public static final int sayi =10;
    public final int SAYI2 =2;
    static  final int SAYI3 =4;
    public static int SAYI7 =7;

 //    int sayi9;
    // interface de tum veriable de final oldugundan sonradan deger
    // atanamaz
    // baslangicta deger atanmasi zorunlu


    /*
    TUM METHODLAR PUBLIC VE ABSTRUCT'DIR
     */


    public abstract void method1();
     abstract void method2();
     public String method3();

    void method5();



}
