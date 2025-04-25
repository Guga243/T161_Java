package day52__IteratorVeListIterator;

import java.util.Arrays;

public class C01_IndexsizislemYapma {
    public static void main(String[] args) {

        /*
        array ve arraylistler index destekledigi icin
        array ve arraylistin elemanlarinda kalici degisiklik yapmak istedigimizde
        index kullanan for loop kullanabiliriz

        ammaaaa
        java da array ve arraylist disinda da coklu eleman barindiran yapilar vardir
        ve bunlardan bazilari index kullanmaz
        index kullanmadan tum elemanlari ele alabilecegimiz
        su ana kadar  ogrendigimiz
        for-each loop var
        ancakk
        for each loop ile kalici degisiklikler yapilamaz
        bu durumda index kullanmadan kalici degisiklik yapabilecek bir yapiya
        ihtiyac var

         */

        int[] arr ={2,3,4,5,6};
        // index kullanmadan arr'deki tum sayilariin toplamini bulun

        int toplam =0;
        for (int each : arr){
            toplam+=each;

        }
        System.out.println("sayilarin toplami : "+toplam); // 20;

        // index kullanmadan tum elemanlari iki arttirin
        toplam=0;
        for (int each : arr){
            each+=2;
            System.out.println(each+"");;

        }
        System.out.println("for each den sonra "+ Arrays.toString(arr));

    }
}
