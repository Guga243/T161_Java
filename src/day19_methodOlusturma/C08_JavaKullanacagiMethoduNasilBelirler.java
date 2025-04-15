package day19_methodOlusturma;

public class C08_JavaKullanacagiMethoduNasilBelirler {
    public static void main(String[] args) {

        topla(3,4); // topla int int 7
        topla(2.2,4.5); // topla doubel double 6.7

        topla(2,3.4); // topla  int double

        topla(5.3,4); // 9.3

        topla('a','b'); // topla char char // 195




    }





    public static void topla(int a, int b){
        System.out.println("iki int toplami :"+ (a+b));
    }

    public static void topla(double a, double b){
        System.out.println(" iki double toplami :"+(a+b));
    }

}
