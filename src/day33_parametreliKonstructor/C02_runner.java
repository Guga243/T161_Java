package day33_parametreliKonstructor;

public class C02_runner {
    public static void main(String[] args) {

        C01_araba araba1 = new C01_araba();
        System.out.println(araba1);
        // C01_araba{marka=' marka atanmadi', model='model atanmadi', ilanNo=0, yil=1000, fiyat=0}

        C01_araba araba2 =new C01_araba("BMW","333");
        System.out.println(araba2);
        // C01_araba{marka='BMW', model='333', ilanNo=0, yil=1000, fiyat=0}

        C01_araba araba3 = new C01_araba(1005,"nissan","nissano");
        System.out.println("araba 3"+araba3);
        //araba 3C01_araba{marka=' marka atanmadi', model='model atanmadi', ilanNo=0, yil=1000, fiyat=0}

        C01_araba araba4 = new C01_araba("mersiders",10008,"sprinter",2016,10000);
        System.out.println(araba4);
        // C01_araba{marka='sprinter', model='mersiders', ilanNo=10008, yil=2016, fiyat=10000}

    }
}
