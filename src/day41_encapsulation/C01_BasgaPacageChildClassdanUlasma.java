package day41_encapsulation;

import day33_parametreliKonstructor.C04;
import day40_stringBuilder_AccessModifier.C04_AccessModifier;

public class C01_BasgaPacageChildClassdanUlasma extends C04_AccessModifier {
    public static void main(String[] args) {

        C01_BasgaPacageChildClassdanUlasma obj = new C01_BasgaPacageChildClassdanUlasma();

      //  System.out.println(obj.strSpri); // sadece veriable'in oldugu classdan kullanilabilir
     //   obj.strSpri ="hava gzuel";  //   sadece veriable'in oldugu classdan kullanilabilir

        obj.intIpro =67;
        System.out.println(obj.intIpro);

       // System.out.println(intSDef);// sadece veriable'in oldugu classdan kullanilabilir
      //  intSDef =76; // sadece veriable'in oldugu classdan kullanilabilir

        obj.strIpub ="Yan";
        System.out.println(obj.strIpub);

        //  obj.priviteMethod(); //  sadece method'un oldugu classdan kullanilabilir
        obj.methodPublic();
        obj. methodProtected();
      //  obj.methodDefaultAccMod(); //  sadece method'un oldugu classdan kullanilabilir
    }
}
