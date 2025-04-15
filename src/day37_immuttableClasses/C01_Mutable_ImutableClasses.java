package day37_immuttableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Mutable_ImutableClasses {
    public static void main(String[] args) {

      /*

      String ve Character classlarindan olusturdugumuz veriablelarda hazir method'larla yapilan islemler
      kalici degisiklik yapmaz iken

      Array ve List olarak olusturdugumuz veriable'larda
      hazir method'larla yapilan islemler
      kalici olarak yapiyor

      java string ve wrapper class'lari IMMUTABLE (DEGISTIRILEMEZ) olarak
      List ve Array;lari ise MUTABLE (DEGISTIRLEBILIR) olarak olusturulmistur

      amma Imutable class'lardan olusturulan
     */


        String str = "Java Candir";

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str); // Java Candir

        Character chr ='a';
        System.out.println(Character.toUpperCase(chr)); // A
        System.out.println(chr); // a

        String [] isimler ={"Yusuf","Kivanc","Sevda","Cennet"};
       Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); // [Cennet, Kivanc, Sevda, Yusuf]

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,8,2));
        sayilar.add(4);
        sayilar.set(0,5);
        sayilar.remove(2);
        System.out.println(sayilar);
    }
}
