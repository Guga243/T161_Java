package day23_scope;

public class C01_ClassLevelVeriableler {

    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    /*
    main method static oldugu icin inctence veriabllerin main methoddan drek kullanmasina
    izin vermez

    eger static methodun icinden static olmayan bir veriable'yi kullanmak istersek
    kullanmak istedigii instence veriable'in icinde oldugu class'dan bir obje olusturmaliyiz

    local veriableler deger atamasi yapilamdan declere edilebilir
    ancak deger atama yapilmadan kullanilamaz

    class level veriableler ister static ister instance olsun deger atamasi yapilamadan
    declere edilebilir ve kullanilabilir

    class level bir veriable'a kodu yazan kisi deger atamasi yapmazsa
    java defaulf(varsayilan) deger kullanir

    java'nin belirledigi defoult degerler sunlardir

    string ve diger non primitive icin NULL
    sayisal primitive icin : 0 (byte short int long float double
    boolean : false
    char : hiclik

     */


    public static void main(String[] args) {
        System.out.println(sayiS);
        System.out.println(strS);
        System.out.println(blS);
        System.out.println(chrS);

        C01_ClassLevelVeriableler obj = new C01_ClassLevelVeriableler();

        System.out.println(obj.strI);
        System.out.println(obj.blI);
        System.out.println(obj.chrI);
        System.out.println(obj.sayiI);

    }
    public static void method1(){

        System.out.println(sayiS);
        System.out.println(strS);
        System.out.println(blS);
        System.out.println(chrS);

        C01_ClassLevelVeriableler obj = new C01_ClassLevelVeriableler();

        System.out.println(obj.strI);
        System.out.println(obj.blI);
        System.out.println(obj.chrI);
        System.out.println(obj.sayiI);
    }

    public void method2(){

        System.out.println(sayiS);
        System.out.println(strS);
        System.out.println(blS);
        System.out.println(chrS);

        System.out.println(strI);
        System.out.println(blI);
        System.out.println(chrI);
        System.out.println(sayiI);
    }

    }

