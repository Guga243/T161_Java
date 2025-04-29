package day53_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList_Deque {
    public static void main(String[] args) {

        Deque<Integer> sayilar = new LinkedList<>();

        // Deque: double ended queue demektir

        sayilar.add(12); //
        sayilar.add(20);

        System.out.println(sayilar);  // [12, 20] yer bas veya sona belirtmedigimiz icin sona ekler
        sayilar.addFirst(44);
        sayilar.addLast(55);
        System.out.println(sayilar); // [44, 12, 20, 55]
        System.out.println(sayilar.getFirst()); // 44

        sayilar.removeFirst(); // en bastekini siler
        sayilar.removeFirstOccurrence(20); // 20'minin ilk kullanimi

        System.out.println(sayilar);
    }
}
