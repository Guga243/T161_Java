package day26_arrays;

import java.util.Arrays;

public class C02_arrayeKaliciOlarakYeniElemanEkleme {
    public static void main(String[] args) {

        int[] sayilar ={3,4,5};
        // 4. eleman olarak 10 ekleyin

        // 2.adim sayilar arrayindeki eski elemanlari yeni arraye kopyalayalim
       int[]yeniArr = Arrays.copyOf(sayilar,sayilar.length+1);
        System.out.println(Arrays.toString(yeniArr)); //[3, 4, 5, 0]

        //3.adim eklenmek istenen sayiyi son eleman olarak atayalim
        yeniArr[yeniArr.length-1]=10;
        System.out.println(Arrays.toString(yeniArr)); //[3, 4, 5, 10]

        //4,adim sayilar arrayine yeniArr olarak degr atayalim

        sayilar=yeniArr;
        System.out.println("sayilar arrayin son hali: "+Arrays.toString(sayilar)); //sayilar arrayin son hali: [3, 4, 5, 10]





    }

    // verieln bir int arrain sonuna
    // verilen int bir elementi ekleyip yeni halini donduren bir method olustrun

   public static int [] arrayeElemanEkleme(int [] eskiArray, int eklenecekSayi) {
        int[] yeniArr = Arrays.copyOf(eskiArray,eskiArray.length+1);
        yeniArr[yeniArr.length-1]=eklenecekSayi;

        return yeniArr;


   }
}
