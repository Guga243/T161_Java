package day22_Scope;

public class C01_LocalVeriables {
    public static void main(String[] args) {

        /*
        bir kod blogu icerisinde olustuurlan veriablellere Local veriable denir

        1- local veriableler sadece icerisinde olusturulduklari kod blogu icerisinde kullanilabilir

        2- bir kod blogu icerisinde ayni isimde iki veriable deklere edilemez
             farkli kod bloklari ayni isimde veriable buliundurabilir
             her veriable kendi kod bulogunda gecerlidir

             3- looplarin da kendi scoplari {} vardir
             ve loop icerisinde olusturulan bir veriablenin scopu
             loop'un {} arasidir loop disinda kullanilamaz

             4- main method icerisnde olusturulan veriablelar yine main mathod icerisinde olusturulan
             looplarin icerinde kullanilabilir

         */

        int sayiMain=23;

        int sayi = 10;
        //int sayi =23;

        for (int i = 0; i <5; i++) {
            System.out.println(i+" ");

            String str ="java candir";
            System.out.println(str);
            System.out.println(sayiMain);
            System.out.println(sayi);

        }
        // MAIN METHOD ICERISINDE AMA FOR LOOP ICERISINDE
        //System.out.println(str);
        // System.out.println(i);
    }


    public static void method1 (){
        //System.out.println(sayiMain);

        int sayi =45;
    }

    public void method2(){
        //System.out.println(sayiMain);
        int sayi = 50;


    }
}
