package day40_stringBuilder_AccessModifier;


import static day40_stringBuilder_AccessModifier.C04_AccessModifier.intSDef;

public class C05_AyniPacegedanKullanma {
    public static void main(String[] args) {

        C04_AccessModifier obj = new C04_AccessModifier();



         //    System.out.println(obj.strSpri); // sadece veriable'in oldugu classdan kullanilabilir
        //     obj.strSpri ="hava gzuel";  //   sadece veriable'in oldugu classdan kullanilabilir

            obj.intIpro =67;
            System.out.println(obj.intIpro);

            System.out.println(intSDef);
            intSDef =76;

            obj.strIpub ="Yan";
            System.out.println(obj.strIpub);

           //  obj.priviteMethod(); //  sadece method'un oldugu classdan kullanilabilir
            obj.methodPublic();
           obj. methodProtected();
            obj.methodDefaultAccMod();




    }
}
