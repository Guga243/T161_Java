package day19_methodOlusturma;

public class C02_FaktoryelDegeriDondurme {
    public static void main(String[] args) {

       // System.out.println(faktoryelDegeri(4));
        // verilen gorevde methodun calistigin kontrol edin demedigine gore yazdirmiyoruz



    }



    // verilen 17 den kucuk pozitif bir tam sayi icin
    // faktoryel degerini hesaplayip donduren method olusturun

    public static int faktoryelDegeri(int sayi){

        int faktoryel = 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel*=i;


        }
        return faktoryel;
    }

}
