package day18_MethodOlusturma;

public class C01_methodOlusturma {
    public static void main(String[] args) {

       // verilen 2 sayidan buyuk olmayani yazdirian bir method olusturun
        int sayi1 =23;
        int sayi2 = 40;


        buyukOlmayaniYazdir(60,80);
    }

    public static void buyukOlmayaniYazdir(int sayi1, int sayi2){
        System.out.println(sayi1>sayi2? sayi2 :sayi1);

    }
}
