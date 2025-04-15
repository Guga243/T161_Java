package day25_array;

public class C01_arrayElemanlariniToplama {
    // verilen int arrayin tum lementlerini toplayip topklam degerini yazdiri

    public static void main(String[] args) {
        int[] sayilar ={3,5,7,2,4};

        int toplam =0;


        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("arraydeki elemanlerin toplami : "+toplam);
    }

// verilen int arrayin tum lementlerini toplayip topklam degerini yazdiran
    // bir method olusturun


    public static void elementToplaminiYazdir(int[] arr){
        int toplam =0;


        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        System.out.println("arraydeki elemanlerin toplami : "+toplam);
    }

    // verilen int arrayin tum lementlerini toplayip topklam degerini donduren
    // bir method olusturun

    public static int getElementlerinToplami(int[]arr){
        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        return toplam;
    }
}
