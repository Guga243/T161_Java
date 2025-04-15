package day33_parametreliKonstructor;

public class C03_objeOlusturma {
    public static void main(String[] args) {

        C01_araba araba1 = new C01_araba();
        System.out.println(araba1);
        // C01_araba{marka=' marka atanmadi', model='model atanmadi', ilanNo=0, yil=1000, fiyat=0}

        C01_araba araba2 = new C01_araba("Porse","910");
        System.out.println(araba2);
        // C01_araba{marka='Porse', model='910', ilanNo=0, yil=1000, fiyat=0}

        C01_araba araba3 = new C01_araba(1010,"mini","counrtey");
        System.out.println(araba3);
        // C01_araba{marka='mini', model='counrtey', ilanNo=1010, yil=1000, fiyat=0}

        C01_araba araba4 = new C01_araba("1011",1011,"sahin",1990,130000);
        System.out.println(araba4);
        // C01_araba{marka='sahin', model='1011', ilanNo=1011, yil=1990, fiyat=130000}


    }



}
