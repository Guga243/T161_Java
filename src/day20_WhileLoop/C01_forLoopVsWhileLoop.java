package day20_WhileLoop;

public class C01_forLoopVsWhileLoop {
    public static void main(String[] args) {

        // iki basamakli pozitif tam sayilari
        // buyukten kucuge dogru , aralarinda bir bosluk olacak sekild yazdirin

        for (int i =99; i >=10 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println("");

        // ayni gorevi while loop ile yapalim

        int sayi = 99;

        while (sayi>=10){
            System.out.print(sayi +" ");
            sayi--;
        }
        System.out.println();

        // verilen poziitif tam sayidan baslayarak, ilk 10 sayiyi yazdirin
        int verilenSayi =23;

        for (int i = 0; i <=9 ; i++) {
            System.out.print(verilenSayi+i+" ");

        }
        System.out.println();
        verilenSayi =23;
        int sayac=0;
        while (sayac<=9){
            System.out.print(verilenSayi+sayac+ " ");
            sayac++;
        }


    }
}
