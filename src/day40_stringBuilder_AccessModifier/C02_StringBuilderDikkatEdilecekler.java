package day40_stringBuilder_AccessModifier;

public class C02_StringBuilderDikkatEdilecekler {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("java candir");

        // stringBuilder mutable oldugu icin
        // method'lar ile yapilan degisiklikler KALICI olur

        sb1.insert(1,"a"); // ekleme yapar
        System.out.println(sb1);

        System.out.println(sb1.deleteCharAt(1)); // index siler

       sb1.capacity();
       sb1.indexOf("n");
       sb1.substring(2);
        System.out.println(sb1.substring(2,7));
        System.out.println(sb1); // java candir


    }
}
