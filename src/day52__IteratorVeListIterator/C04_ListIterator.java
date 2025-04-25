package day52__IteratorVeListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {

        // ListIterator , iteratorun child'dir
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,8,1,6,0,9,9,4,6,4,2,5,6,8,9));

        ListIterator listIterator = sayilar.listIterator();
        // index kullanmadan 7 den buyuk sayilari silin
        // iterator ile yapalim

        while (listIterator.hasNext()){
            if ((Integer) listIterator.next() >7){
                listIterator.remove();
            }
        }
        System.out.println("ilk islemden sonra List :" + sayilar); //[3, 1, 6, 0, 4, 6, 4, 2, 5, 6]

        // ayni iteratoru kullanarak listeden 5 den buyuk olanlari silin
        /*
        iterator ile islem yaparken en onemli 2 sey
        1- iterator nerde biraktik
        2- her dongude sadece bir kere next kullan
         */
        // iterator en sonda suan!

        while (listIterator.hasPrevious()){
            if ((Integer) listIterator.previous() >5){
                listIterator.remove();
            }
        }
        System.out.println("ikinci elemandan sayilar : "+sayilar); // [3, 1, 0, 4, 4, 2, 5]

        // ayni iteratoru kullanarak
        // sayilari elemanlarini sondaan basa yazdin
        // once sona gitmeliyiz


        while (listIterator.hasNext()) {
            listIterator.next();
        }
           // lit artik sonda
        while (listIterator.hasPrevious()) {

            System.out.print(listIterator.previous() + " ");//  5 2 4 4 0 1 3
        }

        // listenin son hali:  [3, 1, 0, 4, 4, 2, 5]
        // kalici olarak 2 artir

        while (listIterator.hasNext()){
            listIterator.set((Integer)listIterator.next()+2);
                            // atanacak deeger lit.next () ile alacagimiz eski degere 2 fazlasi olacak
        }
        System.out.println("sayilarin  2 artirmis hali : "+sayilar);
          // listenin son hali:  [3, 1, 0, 4, 4, 2, 5]
         //  sayilarin  2 artirmis hali : [5, 3, 2, 6, 6, 4, 7]

    }
}
