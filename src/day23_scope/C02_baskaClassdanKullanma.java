package day23_scope;

public class C02_baskaClassdanKullanma {

    /*
    local veriableller olusturulduklari
    kod blogunun disindan kullanilamaz

    ama class level veriabller olusturulduklari classin her yerinden
    kullanilabilir ama static keyworuna bagli olarak

    static class icindeki hersey  (veriable/method)
    baska classdan kullanilacaksa
    classIsmi.staticClassUyesiIismi sekilde kullanilabilir

    Instence veriableler veya statoc olmayan methodlari kullanmak icin
    yine obje olusturmamiz gerekir

    static klass uyeleri de istenirse obje uzerinden kullanilabilir
    ancak bu durumda java static olan bir class uysine neden inctence
    referance ile ulasiyorsun diye sariya boyar
     */
    public static void main(String[] args) {
        System.out.println(C01_ClassLevelVeriableler.strS);
        System.out.println(C01_ClassLevelVeriableler.sayiS);

        C01_ClassLevelVeriableler.method1();

        C01_ClassLevelVeriableler obj = new C01_ClassLevelVeriableler();
        System.out.println(obj.blI);
        obj.method2();


    }
}
