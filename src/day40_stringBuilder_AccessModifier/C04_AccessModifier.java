package day40_stringBuilder_AccessModifier;

public class C04_AccessModifier {
    /*
    class uyeleri : methodlar constructorlar veya class level veriable'lar
    olustrulurken mutlaka accses modifire belirtilmelidir

    - eger bir claas uyesinin onunde public protected veya privite yazmiyorsa o class uyuesinin
    access uyesinin modifieri defoult access modifire dir

     */
    public C04_AccessModifier(){

    }

    private  C04_AccessModifier(int sayi){

    }


    public static String strIpub ="Java";
    private static  String strSpri;
    protected int intIpro;

    static int intSDef =20;
    char shrI ='a';
    static char charS ;
    boolean blI ;
    static  boolean blS = true;

    public static void methodPublic(){

    }

    protected static void methodProtected(){


    }

    static void methodDefaultAccMod(){

    }
    private static void priviteMethod(){


    }

    void method(){

        System.out.println(strSpri);
        strSpri ="hava gzuel";

        intIpro =67;
        System.out.println(intIpro);

        System.out.println(intSDef);
        intSDef =76;

        strIpub ="Yan";
        System.out.println(strIpub);

        priviteMethod();
        methodPublic();
        methodProtected();
        methodDefaultAccMod();

    }

}
