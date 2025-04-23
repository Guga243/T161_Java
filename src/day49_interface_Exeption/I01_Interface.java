package day49_interface_Exeption;

public interface I01_Interface {
   // void method1(){}
    //  Interface abstract methods cannot have body

    /*
    bir interface'e sonradan bir method eklenirse
    o interface'i daha onceden implements eden tum class'lar
    yeni methodu kendilerine uyarlamak zorunda kalirlar

    Proje buyukse ve interface'i cok fazla class implement ettiyse
    sonradan eklenen method KAOS olusturabilir

    java8 ile developer'larin istegi uzerine bu kaos'u olusturmadan
    interface'lere method ekleyebilmek icin bir istisna getirmistir


    interface full abstraction saglar

    methodlarin basina abstract yazmasakta java interface icinde
    olusturulan methodlari abstract olarak tanimlar
    ammaaa :
    istinai olarak
    child class'larin implemesi zorunlu olmayan methodlar olusturmak isterseniz
    java'nin belirledigi iki anahtar kelimeyi kullanabiliriz

    bu anahtar kelimeleri kullandigimizda
    java onlarin istisnai method oldugunu bilir
    child classlarin imlement etmesi mecbur olmasi diye
    bu methodlara body olusturmasina izin verir


    bu iki keyword: defoult ve static'dir

    bu iki keywordu kullandigimiz methodlar abstract olarak tanimlanamaz
    ve baody'lari olmak zorundadir




     */

    void method2();
    int method3();
   public String method4();
   abstract double method5();
   void yeniMethod();

   public default void method7(){
       System.out.println("bu method  defould keyword kullandigi icin\" +\n" +
               "               \" child claslarin implement etmesi orunlu degil");

   }

   public static void method8(){
       System.out.println("bu method  static keyword kullandigi icin" +
               " interface icinde olmasina ragmen bodysi vardir");
   }

//    public static abstract void method9();
   // Illegal combination of modifiers 'abstract' and 'static'

  //   public static void method9();
   // Static methods in interfaces should have a body

}
