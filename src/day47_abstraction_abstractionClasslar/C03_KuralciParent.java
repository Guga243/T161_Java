package day47_abstraction_abstractionClasslar;

public abstract class C03_KuralciParent {

    /*
    bir classi kendisini parent edinecek child classlar icin
    kural koyabilen bir hael getirek icin oncelikle
    bu durumu class declarationuna eklemeliyiz

    BUNUN ICIN CLASS DECLARASYONUNA abstract keywordu eklemeliyiz

     */
 // method1 child classlar tarafindan
    // Mutlaka overridde edilsin
    public void method1(){


    }
    // method2'i child classlarin istegine birakiyoruz
    // isterlerse parent classdan kullansinlar
    // isterlerse overridde etsinler
    public void method2(){


    }
    // method1 child classlar tarafindan
    // Mutlaka overridde edilsin
    public void method3(){


    }
}
