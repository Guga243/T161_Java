package day31_forEachLoop;

public class C08_parametresizConstructor {

    /*
    default constructor
        java tarafindan olusturulur
        gorunmez
        parametresi yoktur
        bady'sinde kod olmaz


     */

    C08_parametresizConstructor(){
        sayi =30;


    }

    // parametresiz konstructor'i kod yazanlar tarafindan olusturulur
       // parametresi yoktur
       // bady'sinde kod olabilir


    int sayi =10;
    int num =20;

    public static void main(String[] args) {

        C08_parametresizConstructor obj1 = new C08_parametresizConstructor();
        System.out.println(obj1.sayi);
        System.out.println(obj1.num);
    }

}
