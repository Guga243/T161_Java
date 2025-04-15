package day32_Constructors;

import java.util.Locale;

public class C04_KodOkumadaHatayaDusulecekDurumlar {
    int sayi =30;

    String isim ="Ali";

    C04_KodOkumadaHatayaDusulecekDurumlar(){

        sayi =20;
        isim="Can";



    }
    C04_KodOkumadaHatayaDusulecekDurumlar(String str){
        isim = isim.toLowerCase(Locale.ROOT);
        sayi/=2;

    }
    C04_KodOkumadaHatayaDusulecekDurumlar (String a, int b){
        isim= a.substring(2);
        sayi=a.length();
    }


    public static void main(String[]args){
        C04_KodOkumadaHatayaDusulecekDurumlar obj1 = new C04_KodOkumadaHatayaDusulecekDurumlar();

        System.out.println(obj1.isim); // can
        System.out.println(obj1.sayi); // 20

        C04_KodOkumadaHatayaDusulecekDurumlar obj2 = new C04_KodOkumadaHatayaDusulecekDurumlar("veli");

        System.out.println(obj2.isim);// ali
        System.out.println(obj2.sayi); // 165


        C04_KodOkumadaHatayaDusulecekDurumlar obj3 = new C04_KodOkumadaHatayaDusulecekDurumlar("serpil",5);
        System.out.println(obj3.isim); // rpil
        System.out.println(obj3.sayi); // 6
    }
}
