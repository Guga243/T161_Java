package day41_encapsulation;


import day40_stringBuilder_AccessModifier.C04_AccessModifier;

public class C03_AccsessModifierIleYetkiAyirma {
    public static void main(String[] args) {

        C04_AccessModifier obj = new C04_AccessModifier();

        /*
        access modifire ile

        bir class uyesine deger atama yetkisi ile 
         */

        // baska bir class dan privite class uyelerine ulasilamaz
       // System.out.println(obj.strSpri);
       // obj.strSpri ="";
        //  obj.priviteMethod;


        // defoult access modifiree sahip olan class uyelelerine
        // pacage disindan ulasilama
       // System.out.println(obj.intSDef);
       // obj.intSDef =23;
       // obj.methodDefaultAccMod();


        // protected access modifire sahip class uyelerine
        // kendi pacagedekiler ve baska pacagedeki child classlar
        // ulasabilir
        // bu class baska pacage class altinda ve child class degil
        //System.out.println(obj.intIpro);

        obj.strIpub ="tava";




    }
}
