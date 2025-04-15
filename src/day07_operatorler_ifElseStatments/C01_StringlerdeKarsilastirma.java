package day07_operatorler_ifElseStatments;

public class C01_StringlerdeKarsilastirma {
    public static void main(String[] args) {

        String a1 ="Ali";
        String a2 ="Ali";
        String a3="A"+"l"+"i";
        String a4="A";
        String a5="li";
        String a6 =a4+a5;
        String a7= new String("Ali");

        System.out.println(a1 == a2); // true
        System.out.println(a1 == a3); // true
        System.out.println(a1== a6); // false
        System.out.println(a1==a7); // false
        System.out.println(a1=="Ali"); // true

        // simdilik kullanmayacaz

        // == hem metin degerine hemde konferansa bakar

        // metinlerin ayni oldugunu karsilastirmak icin equels
        // kullaniriz
        // sadece metinlere bakar ayni ise true degilse false
        System.out.println(" ============= ");
        System.out.println(a1.equals(a2));// true
        System.out.println(a1.equals(a3));// true
        System.out.println(a1.equals(a6));// true
        System.out.println(a1.equals(a7));// true
        System.out.println(a1.equals("Ali"));// true

        System.out.println(a1.equals("ali"));// false




    }
}
