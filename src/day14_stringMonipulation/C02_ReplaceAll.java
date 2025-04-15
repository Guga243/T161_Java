package day14_stringMonipulation;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str = "Java ile kodlama cok guzel";

        System.out.println(str.replace("a", "")); //Jv ile kodlm cok guzel

        System.out.println(str.replaceAll("a", "A")); //JAvA ile kodlAmA cok guzel

        /*
        eger metinde verilen bir metin parcasini yeni bir metin ile degistireeksek replace ve replaceall
        ayni islemi gorur

         */

        // butun kucuk a ve butun e leri buyuk harfe ceirin

        System.out.println(str.replaceAll("a","A").replaceAll("e","E"));
        //JAvA ilE kodlAmA cok guzEl
        System.out.println(str.replace("a","A").replace("e","E"));
        //JAvA ilE kodlAmA cok guzEl
        System.out.println(str.replace('a','A').replace('e','E'));
        //JAvA ilE kodlAmA cok guzEl

        str="Ja67va 89C0a54n34d76i12r";
        System.out.println(str.replaceAll("\\d","")); //Java Candir
    }
}
