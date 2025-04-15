package day21_whileLoop_doWhileLoop;

public class C01_rakamlarToplaminiBulma {
    public static void main(String[] args) {
        // verilen pozitif bir tam sayinin rakamlar toplamini
        // while loop ilw bulup bize donduren bir method olusturun

        System.out.println(getRakamlarToplami(1234));


    }
    public static int getRakamlarToplami (int verilensayi){
        int rakam=0;
        int rakamlarToplami=0;
        while (verilensayi>0){
            rakam=verilensayi%10;
            rakamlarToplami+=rakam;
            verilensayi/=10;

        }
        return rakamlarToplami;
    }

}
