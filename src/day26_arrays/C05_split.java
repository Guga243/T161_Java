package day26_arrays;

import java.util.Arrays;

public class C05_split {
    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        String str ="ali topu at, at ali at";
        System.out.println(Arrays.toString(str.split("t"))); // [ali , opu a, , a,  ali a]
        System.out.println(Arrays.toString(str.split("topu"))); // [ali ,  at, at ali at]

        // cumledeki en uzun kelimeyi yazdirin
         str =str.replace(",",""); // cumledeki , virgulleri yok eder
         String [] cumledekiKelimeler = str.split(" "); // bosluklardan parcalara yirararak array olusturduk

        // odev bu arraydeki en uzun kelimeyi bulun





        // "Ali topu at at Ali at"

        System.out.println(Arrays.toString(str.split("")));
        //[a, l, i,  , t, o, p, u,  , a, t,  , a, t,  , a, l, i,  , a, t]


        // odev cumledeki kucuk harfleri dogal siralasak
        // en sonda hangi kucuk harf olur?



    }
}
