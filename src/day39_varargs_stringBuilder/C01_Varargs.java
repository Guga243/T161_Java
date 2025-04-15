package day39_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        toplamiYazdir(4,5); // 9

        toplamiYazdir(4,5,6); // 15

        toplamiYazdir(1,3,4,5,7); // z ==> [1,3,4,5,7]
        // argument olarak gonderilen 5adet sayinin toplami : 20

        toplamiYazdir(2,4,7,93); // z ==> [2,4,7,93]
        // argument olarak gonderilen 4adet sayinin toplami : 106

        toplamiYazdir();
        // argument yollamazsaniz nasil toplayayim ?


        /*
        eger bir method icin kullanilacak argument sayisi farkli farkli olsa da
        methodun calismasini istiyorsak varargs (variety of arguments) kullaniriiz

        varargs sadece parametre olarak kullanilmak uzere hazirlanmis
        bir array'dir

        kodlarin icinde varargs tanimlayip deger atamasi yapamayiz
         sadece parametre olarak kullanabilecegimiz bir yapidir

         */
    }

    public static void  toplamiYazdir (int a, int b){

        System.out.println("iki tamsayinin toplami :" + (a+b)); //
    }


    public static void  toplamiYazdir (int a, int b, int c){

        System.out.println("uc tamsayinin toplami :" + (a+b+c));
    }

    public static void  toplamiYazdir (int... z){
        int toplam =0;

        for (int each :z){
            toplam+=each;



        }
        if (z.length ==0){
            System.out.println("argument yollamazsaniz nasil toplayayim ? ");
        }else {
            System.out.println("argument olarak gonderilen "+ z.length + "adet sayinin toplami : "+toplam);
        }





    }

}
