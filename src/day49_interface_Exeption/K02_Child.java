package day49_interface_Exeption;

import java.util.ArrayList;
import java.util.List;

public class K02_Child implements I01_Interface{


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


    public static void main(String[] args) {
        List<String > isimler = new ArrayList<>();

        I01_Interface.method8(); // bu method  static keyword kullandigi icin interface icinde olmasina ragmen bodysi vardir


        I01_Interface obj = new K02_Child();
        obj.method7(); // bu method  defould keyword kullandigi icin" +
      //   " child claslarin implement etmesi orunlu degil
    }




    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    @Override
    public String method4() {
        return null;
    }

    @Override
    public double method5() {
        return 0;
    }

    @Override
    public void yeniMethod() {

    }
}
