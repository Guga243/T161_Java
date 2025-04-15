package day31_forEachLoop;

public class C09_parametresizConstructor {
    int sayic=20;
    String  isim ="ali can";


    C09_parametresizConstructor (){

        sayic +=20;
        isim =isim.substring(0,3);
    }

    public static void main(String[] args) {

        C09_parametresizConstructor obj = new C09_parametresizConstructor();

        System.out.println(obj.isim);
        System.out.println(obj.sayic);
    }

}
