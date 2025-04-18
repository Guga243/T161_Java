package day47_abstraction_abstractionClasslar;

public abstract class C03_KuralciParent {

    /*
    bir classi kendisini parent edinecek child classlar icin
    kural koyabilen bir hael getirek icin oncelikle
    bu durumu class declarationuna eklemeliyiz

    BUNUN ICIN CLASS DECLARASYONUNA abstract keywordu eklemeliyiz


    child classlarin mutlaka bulundurmasi gereken
    methodlar bildigimiz classik methodlardan farkli olmalidir
    bu method'lar method olmaktan ziyade
    cild classlari uyaaklari kurallari belirten bir cumle gibi dusunlebilir

    biz burada sunu demek istiyoruz:
    her child class'da mutlaka method1() olsun

     */
 // method1 child classlar tarafindan
    // Mutlaka overridde edilsin
    public abstract void method1();



    // method2'i child classlarin istegine birakiyoruz
    // isterlerse parent classdan kullansinlar
    // isterlerse overridde etsinler
    public void method2(){


        /*
        methodlarda abstraction kullanirken
        methodlari abstract methodlar ve abstract olmayan methodlar ayirmak yerine
        abstract olmayan yapilara : Concrete denir
         */

    }
    // method1 child classlar tarafindan
    // Mutlaka overridde edilsin
    public abstract void method3();



}
