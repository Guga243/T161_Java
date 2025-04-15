package day25_array;

public class C02_enBuyukElemaniBulma {
    public static void main(String[] args) {

        // int verilen arraydeki en buyuk elemani yazdirin

        int[]sayilar ={-2,-5,-7,-11,-4,-7};
        // eger verilen bir gorevi tum elementleri gozden gecirmemiz gerekiyorsa for loop
        // kullaniriz

        int enBuyukEleman =sayilar[0];

        for (int i = 0; i < sayilar.length ; i++) {

           if ( sayilar[i] > enBuyukEleman){
               enBuyukEleman=sayilar[i];

           }


        }
        System.out.println("arraydeki en buyuk eleman :"+enBuyukEleman);







    }
    // verilen int bir arrayi en buyuk elemani donduren bir method olusturun
    public static int getEnBuyukEleman (int[]arr){

        int enBuyukEleman =arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] > enBuyukEleman){
                enBuyukEleman=arr[i];

            }


        }
        return enBuyukEleman;

    }


}
