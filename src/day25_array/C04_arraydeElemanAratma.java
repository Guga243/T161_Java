package day25_array;

public class C04_arraydeElemanAratma {
    // verilen int bir arrayde
    // intenen bir eleman var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun

    public static void main(String[] args) {

        int [] arr = {1,3,2,4,2,6,2,5,2,8,1,9,2};
        arraydeElemanAra(arr,4);
        arraydeElemanAra(arr,2);// 5


    }
    public static void arraydeElemanAra(int []arr, int arananSayi){

        int sayac =0;
        for (int i = 0; i < arr.length ; i++) {
            if ( arr[i]==arananSayi) sayac++;

        }

        if (sayac==0) System.out.println("aranan sayi arrayde yok");
        else System.out.println("aranan sayi "+arananSayi +"sayisi arayde "+sayac +"adet var");
    }
}
