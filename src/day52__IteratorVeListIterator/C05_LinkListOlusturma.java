package day52__IteratorVeListIterator;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C05_LinkListOlusturma {
    public static void main(String[] args) {

        // linkedList 3 tane Interface'i implement etmistir
        // 4 objede LinkList<>() kullandigi icin
        // LinkList class'inin objekeridir
        // amma  data turu farkli secildiginden
        // bu objelerin sahip olacahi methodlar da farkli farkli olabilir


        LinkedList<String> linkedList1= new LinkedList<>();

        List<String> linkedList2= new LinkedList<>();
        // data turu List oldugundan bugune kadar kullandigimiz arrayList() icin kullandigimiz
        // method'larla ayni methodlara sahip

        Deque<String> linkedList3= new LinkedList<>();
        // .... bircok bilmedigimiz methoda sahip

        Queue<String> linkedList4= new LinkedList<>();

        // 4 objede LinkList<>() kullandigi icin
        // LinkList class'inin objekeridir
        // amma  data turu farkli secildiginden
        // bu objelerin sahip olacahi methodlar da farkli farkli olabilir

    }
}
