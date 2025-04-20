package day48_abstractClasses_interfacess;

public class K07_MultipleInheritance extends K06_ConcreteParent
                                     implements I05_Interface,I03_Interface{




    /*
        java da mulitiple inheritance yoktur
        yani bir class extens ile birden fazla class'i
        INHERIT EDEMEZ

        ANCAAAK imlements keyword ile birden fazla interface'e imlement edebilir
         */
    public static void main(String[] args) {
        System.out.println(I05_Interface.sayi1);
        System.out.println(K06_ConcreteParent.sayi1);
        K06_ConcreteParent.sayi1=45;

        // birden fazla interface'de veya parent class da ayni isimde veriable
        // varsa java hangisini tercih ettigimizi bilmek ister
        // tek basina sayi1 degil I03_sayi1 veya K06.sayi1 yazmaliyiz

        System.out.println(sayi9);
        // veriable tek ise cakisma olmayacagi icin direk veriable ismi ile kullanailabilir

        // K07 constructoru olarak farkli sekilde kac sekilde olusturuabilriz

        K07_MultipleInheritance obj1 = new K07_MultipleInheritance();
        K06_ConcreteParent obj2 = new K07_MultipleInheritance();
        I03_Interface obj3 = new K07_MultipleInheritance();

    }




    /*methodlara gelince...

        multiple interface'de sorun olmaz

        I05 ==> child class'larda method1() olsun ister
        I03 ==> child class'larda method1() olsun ister

        child class method1 olusturursa iki interface de mutlu olur

        ancak iki interface de ayni isimde ama return typ farkli olursa olmaz
        I05 ==> gezmeye git ama donuste int getir
        I03 ==> gezmeye git ama donuste birsey alip gelme
        ikisini birden mutlu edemez

         */
    public void method1() {

    }

    @Override
    public void method5() {

    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public int method8() {
        return 0;
    }
}
