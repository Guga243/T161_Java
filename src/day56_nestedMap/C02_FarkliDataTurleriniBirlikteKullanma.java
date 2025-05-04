package day56_nestedMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_FarkliDataTurleriniBirlikteKullanma {

    public static void main(String[] args) {

        // bir listenin icinde farkli data turlerinden degerler yazilabilir mi

       //  List <String> seyler = new ArrayList<>();
        // seyler lsitesinin kullandigi data turu olarak string secersek
        // java icine sadece string veriler eklememize izin verir
        // baska hicbir data turunu kabul etmez

        List <Object> seyler = new ArrayList<>();


        seyler.add("Ali");
        seyler.add(20);
        seyler.add(true);
        seyler.add('a');
        Integer[] arr ={3,5,6};
        seyler.add(arr);

        // seyler listesini yazdirin
        System.out.println(seyler); // [Ali, 20, true, a, [I@1cd072a9]

        //lsitenin ilk elmani olan Ali'nin karakter sayisini yazdirin

        // data turu olarak Objekt sectigimizde
        // objekt tum data turlerin parenti oldugundan her turlu datayi bu listeye ekleyebilriz
        // ammaaa  baslangicta eklemek avantaj olsada
        // elemanlari kullanmak objekt class'i en parent oldugu icin child classlara
        // ait olan ozelliklere sahip olmaz
        // bu durumda

        // seyler listesini yazdirin
        System.out.println(seyler); // [Ali, 20, true, a, [I@1cd072a9]

        // listenin ilk elemani olan ali'nin karakter sayisini yazdirin
        System.out.println(((String) seyler.get(0)).length()); // 3

        // listenin ikinji elemani olan 20'nin 2 katini yazdriin

        System.out.println((Integer) seyler.get(1)*2); // 40

        // 4 indexdeki arrayi yazdirin
        System.out.println(Arrays.toString(   (Integer[]) seyler.get(4)  )); // [3, 5, 6]

    }
}
