package day24_arrays;

public class C01_arrayOlusturma {
    public static void main(String[] args) {

        //1-  array 2 turlu olusturulabilir, // bu durumda atanan eleman sayini length olarak kabul eder
        int []arr1 ={1,4,5};

        // 2- default degerlere sahip bos bir array olusturup
        // sonrasindan eleman atamasi yapabiliriz

        String [] arr2 = new String[4]; // icinde 4 tane null olan array olusturur

        // arr tanimlarkn [] koymazsak
        // java bu veriableyi array olarak kabul etmez
        // ve sadece 1 deger atamamizi bekler
        // String arr3 ={"cennet","samet","eren"};

        String[] arr3={"cennet","samet","eren"};

        // arr3'un data turu nedir? arraydir
        // string bu  arrayin icine konulacak elemanlarin data turudur
        // yani arr3 icinde string elemanlar bulunduruan array'dir




    }
}
