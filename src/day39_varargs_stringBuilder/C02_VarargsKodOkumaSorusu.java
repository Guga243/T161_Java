package day39_varargs_stringBuilder;

public class C02_VarargsKodOkumaSorusu {

    public static void main(String[] args) {

        islemYap(2,"al","veli","can");

        islemYap(0,"sinan"); //b ={sinan} b[0] ==> sinan  sianin lengti ==> 5

        islemYap(4); // b = {}  b[4] ==>  CTE
    }




    public static void islemYap(int a,String... b){

        // System.out.println(b[a].length()); // 3
        // b b'r array 2 ise indexi 2 indexin length'ini yazdirir

        System.out.println(b[a].length());
        // //b ={sinan} b[0] ==> sinan  sianin lengti ==> 5


    }
}
