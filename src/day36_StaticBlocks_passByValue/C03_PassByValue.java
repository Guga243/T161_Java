package day36_StaticBlocks_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        int number =3;

        int sayi =12;
        kareAl(number);
        /*
        java da bir kod blogundan baska bir kod bloguna veriable yollandiginda
         java gonderilen veriable'nin kendisini degil degerini (value) gonderir

         yani veriablenin kendisi degil value'si gecis yapar
         java pass by value kullanir
         */

        System.out.println(sayi); //12

    }

    public static void kareAl(int sayi){
        System.out.println("sayinin karesi: "+ sayi*sayi); // 9


        // numer'in scopu main method'dur
        // numer local veriable oldu[u icin kareAl methodundan kullnailamaz
       // System.out.println(number);

        System.out.println(sayi); //3
    }
}
