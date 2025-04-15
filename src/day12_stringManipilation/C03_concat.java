package day12_stringManipilation;

public class C03_concat {
    public static void main(String[] args) {

        String s1 ="Java";
        String s2 =" ";
        String s3="Guzel";
        String s4="";
        int sayi1 =4;
        int sayi2=5;


        // sadece veriableleri kullanarak asagdeki metinleri yazdirin

        // java guzeldir

        System.out.println(s1+s2+s3);

        System.out.println(s1.concat(s2.concat(s3)));
    }
}
