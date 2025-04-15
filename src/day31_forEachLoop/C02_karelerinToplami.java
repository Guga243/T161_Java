package day31_forEachLoop;

public class C02_karelerinToplami {
    public static void main(String[] args) {
        //Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] sayilar ={1,3,4,5};
        karelerinToplami(sayilar); //51
    }

    public static void karelerinToplami (int[] arr){
            int toplam =0;

            for (int each : arr){
                toplam+=each*each;
            }
        System.out.println("arraydeki elementlerin karelerin toplami : "+ toplam);
    }
}
