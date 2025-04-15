package day27_multiDimentionalArrays;

public class C03_CiftSayilarinToplami {
    public static void main(String[] args) {

        //Verilen 2 katli bir array’de bulunan cift sayilari toplayip
        // , sonucu yazdiran bir method olusturun.

        int[][] sayilar = {{3, 5, 4}, {2, 3, 6, 8}, {2, 4}, {10}, {3, 9, 0, 2, 7}};


          // method call ile cagirmaliyiz
        ciftSayilarinTopla(sayilar); //38
    }

    public static void ciftSayilarinTopla(int[][]arr){

        int toplam =0;

        for (int i = 0; i < arr.length; i++) {  // outer arrayı konreol eder

            for (int j = 0; j <arr[i].length; j++) { // inner arrayi kontrol eder

                if (arr[i][j] %2 ==0){
                    toplam+=arr[i][j];
                }

            }

        }
        System.out.println("arraydeki cift sayilarin toplami :"+toplam);

    }
}
