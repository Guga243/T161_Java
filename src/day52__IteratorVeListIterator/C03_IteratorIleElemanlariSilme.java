package day52__IteratorVeListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_IteratorIleElemanlariSilme {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,8,1,6,0,9,9,4,6,4,2,5,6,8,9));
        // iterator ile listedeki cift sayilari silin

        Iterator iterator = sayilar.iterator();
       //  iterator.hasNext();
       //  iterator.next();
       //  iterator.remove();

        while (iterator.hasNext() == true){
            // bu boolean control, iteratorun yaninda elemanin oldugu middetce while loopu
            if((Integer)iterator.next() %2 ==0){
                iterator.remove();
            }
        }
        System.out.println("sayilarin listesinin son hali  : " +sayilar);
        // yukardeki loop ile iteratoru en sona kadar goturduk
        // en sonda oldugu icin ayni itearor ile en asagdeki islemi yapmaya calistik
        // olmaz hasnext false verir yani
        //   iterator = sayilar.iterator(); yeniden baslamak icin iteratora yeni deger atamaliyiz



        // sayilarin listesinin yeni halinde
        // 5 den buyuk olan sayilari silin

        iterator = sayilar.iterator();

        while (iterator.hasNext()) {
            // bu boolean control, iteratorun yaninda elemanin oldugu middetce while loopu
            if ((Integer) iterator.next() > 5) {
                iterator.remove();
            }
        }
        System.out.println("sayilarin en son hali " +sayilar);



    }
}
