package day25_array;

public class C03_pozitifSayilarinToplami {
    // verilen int bir arraydeki poziti tamsayilari toplayip
    // sonucu donduren bir method yaziniz

    public static void main(String[] args) {

        int [] arr ={1,-3,4,-5,2,-7};

        int toplam =0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){
                toplam += arr[i];
            }

        }
        System.out.println("pozitif sayilarin toplami :"+toplam);
    }

    public static int getPozitifElemanlarinToplami(int[] arr){
        int toplam =0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){
                toplam += arr[i];
            }

        }
        return toplam;
    }
}
