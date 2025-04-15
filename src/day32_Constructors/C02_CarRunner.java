package day32_Constructors;

public class C02_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        // car1 in tum ozelliklerini yazin

        // System.out.println(car1); //day32_Constructors.Car@7c75222b
        // referansi yazar

        // eger class da toString() yoksa
        // car1 objesini yazdirirsak referansi verir
        // tek tek yazdirmamaiz gerekir
        System.out.println(car1.fiyat);
        System.out.println(car1.ilanNo); // gibi

        // eger toString ile yazdirirsak hepsini yazdirabiliriz


        System.out.println(car1);
        //C01_Car{marka=' marka atanmadi', model='model atanmadi', ilanNo=0, yil=1000, fiyat=0}

        car1.fiyat=4000;
        car1.yil=2019;
        car1.model="camry";
        System.out.println(car1);
        // C01_Car{marka=' marka atanmadi', model='camry', ilanNo=0, yil=2019, fiyat=4000}


    }
}
