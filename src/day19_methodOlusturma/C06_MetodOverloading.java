package day19_methodOlusturma;

public class C06_MetodOverloading {
    public static void main(String[] args) {

        String str ="Jasva ile hersey mumkun";
        System.out.println(str.substring(10));  //ersey mumkun

        System.out.println(str.substring(2,7));// va il

        /*

        ayni siimde ama farki isleve sahip farkli methodlar olabilir
        java hangi methodu kullanacaina
        girdigimiz argumanlara gore karar verir
        ornegin 7 satirda bir arguman girdigi icin bua uygumlu substring calisti buna karsilik
        9 satirda 2 arguman girilince farkli substring substring calisti
         */
    }
}
