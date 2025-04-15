package day27_multiDimentionalArrays;

import java.util.Arrays;

public class C07_ayniIndexdekiElementlerinToplami {

    public static void main(String[] args) {

        // verilen 2 katli ve 2 inner arraye sahip int bir arrayde
        // ayni indexe sahip elementleri toplayip
        // yeni olusturacagimiz tek katli arayye bu toplamlari atayin

        // input:   in[][] arr = {{3,4,5},{2,3,6,7}};
        // output:  [5,7,11]

        int [][] arr = {{3,4,5},{2,3,6,7,8,9,1}};

        // once ortak index adedini bulmamiz lazim
        // iki inner arrayden hangisinin element sayisi azsa
        // ortak index sayisi o inner arrayin element sayiis olur

        int ortakIndexSayisi =arr[0].length < arr[1].length? arr[0].length : arr[1].length;

        //2.adim
        // ortak elemanlari topladigimizda toplayacagimiz arrayi olusturalim

        int[]outputArr = new int [ortakIndexSayisi];

        for (int i = 0; i <outputArr.length ; i++) {
            outputArr[i]=arr[0][i]+arr[1][i];

        }
        System.out.println(Arrays.toString(outputArr)); //[5, 7, 11]

    }
}
