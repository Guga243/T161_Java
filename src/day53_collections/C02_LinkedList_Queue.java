package day53_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C02_LinkedList_Queue {
    public static void main(String[] args) {

        /*
        queue kuyruk: yeni eklenenler en sona eklenir
                      cikacaklar bastan cikar
         */
        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(10);
        sayilar.add(25);
        sayilar.add(12);
        sayilar.add(10);
        sayilar.add(45);
        // elemanlar ekleme sirasina gore eklenir
        System.out.println(sayilar); //[10, 25, 12, 10, 45]
        // sileme islemi otomatik en bastekini siler
        sayilar.remove();
        System.out.println(sayilar); // [25, 12, 10, 45]

    }
}
