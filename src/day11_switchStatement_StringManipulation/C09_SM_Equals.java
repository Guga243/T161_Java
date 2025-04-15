package day11_switchStatement_StringManipulation;

public class C09_SM_Equals {
    public static void main(String[] args) {

        String str= "Ali";
        String str2 ="A"+"l"+"i";
        String str3 = new String("Ali");

        // String de farki 2 metinin ayni oldugunu kontrol etmek icin == kullanmayiz simdilik
        // onun yerine equals kullaniriz

        System.out.println(str.equals(str2));//true
        System.out.println(str.equals(str3)); //true
        /*
        equals methodu metinleri karsilastirirken karakter sayisina ve ayni indexteki karakterlerin
        ayni olmasina bakar
        eger farklilik varsa false verir eger karakter saysi ve tum karakterler ayni ise true verir

         */


        String str4= "AlI";
        String str5= "ALi";
        String str6= "ALI";
        String str7= "A li";
        System.out.println(str7.equals(str6)); // false



         /*
        esitligi kontol ederken sadece kucuk buyuk harf farkliliklarini onemsememesini isterseniz

     */
        System.out.println(str.equalsIgnoreCase(str5));// true




    }
}
