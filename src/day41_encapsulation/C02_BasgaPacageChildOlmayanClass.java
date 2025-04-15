package day41_encapsulation;

import day40_stringBuilder_AccessModifier.C04_AccessModifier;

public class C02_BasgaPacageChildOlmayanClass {
    public static void main(String[] args) {



        C04_AccessModifier obj = new C04_AccessModifier();



        //    System.out.println(obj.strSpri); // sadece veriable'in oldugu classdan kullanilabilir
        //     obj.strSpri ="hava gzuel";  //   sadece veriable'in oldugu classdan kullanilabilir

       // obj.intIpro =67;
     //   System.out.println(obj.intIpro); // hem basga pacagede hemde child degil

      //  System.out.println(intSDef); // sadece veriable'in oldugu classdan kullanilabilir
        // intSDef =76; // sadece veriable'in oldugu classdan kullanilabilir

        obj.strIpub ="Yan";
        System.out.println(obj.strIpub);

        //  obj.priviteMethod(); //  sadece method'un oldugu classdan kullanilabilir
        obj.methodPublic();
      //  obj. methodProtected();
      //  obj.methodDefaultAccMod();
    }
}
