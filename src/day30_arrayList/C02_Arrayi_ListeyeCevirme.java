package day30_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Arrayi_ListeyeCevirme {
    public static void main(String[] args) {


        Integer[] arr ={3,5,7,8,9,0,4,32,5};
// arr'yi arrayListe'ye cevirin

        List<Integer> arrList = new ArrayList<>(Arrays.asList(3,5,7,8,9,0,4,32,5));
        arrList.add(5);
        System.out.println(arrList); //[3, 5, 7, 8, 9, 0, 4, 32, 5, 5]

        // verilen arrayi copy past yapmak disinda
        // arrayList'e cevirmek isterseniz asList() kullanabilirsiniz
        // ama  2 buyuk nagatif yan etkisi var

        // 1- her ne kadar hazirMethodList bir lsit olsa da
        // ekleme ve silme gibi uzunlugu etkileyen method'lari kullanamazsiniz

        //2 hazir methodla cevirilen list ve array ortak haraket ederler
        // birinde yapilan degisiklik
        // otomatik olarak digerinde de isler

        // BU YUZDEN BU YONTEM COK KULLANILMAZ

        List<Integer> hazirMethodList = Arrays.asList(arr);
        System.out.println(hazirMethodList); // [3, 5, 7, 8, 9, 0, 4, 32, 5, 5]

        // hazir method ile cevirdigimiz lsitenin sonuna 10 ekleyin
       //  hazirMethodList.add(10);
       //  System.out.println(hazirMethodList); //UnsupportedOperationException

        System.out.println(Arrays.toString(arr)); //[3, 5, 7, 8, 9, 0, 4, 32, 5]
        System.out.println(hazirMethodList);      //[3, 5, 7, 8, 9, 0, 4, 32, 5]

       //  arr'in 0 indexindeki elemani 10 yapin
        arr[0]=10;
        System.out.println(Arrays.toString(arr));

        System.out.println(hazirMethodList);

        //PEKI bir arrayi'i liste cevirmemiz gerekirse
        // ne yapmaliyiz

        String [] harfler ={"a","v","d","r"};
        // bos bir list olusturup
        // array'deki elementleri loop ile arrayListe kopyalariz

        List<String > harflerListesi = new ArrayList<>();

        for (int i = 0; i <harfler.length ; i++) {
            harflerListesi.add( harfler[i] );

        }
        System.out.println(harflerListesi); //[a, v, d, r]

        harflerListesi.add(3,"y");
        System.out.println(harflerListesi); //[a, v, d, y, r]
        

    }




}
