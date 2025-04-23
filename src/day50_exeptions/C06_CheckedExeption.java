package day50_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C06_CheckedExeption {
    public static void main(String[] args) throws FileNotFoundException {



    /*
    checked exeption:
    javanin kontrol edip farkina varabildigi exeption turleridir

    java yazdigimiz kodlar icerisinde compile time da
    bir exeption riski gorurse altini kirmizi cizer
    ve bizden cozum bekler

    cozum iki turlu olabilir

    1- try catch kullanarak
       exeptionu handle edilebilir
       exeption olustugunda normal calismaya devam etmesini saglayabiliriz

    2- eger exeptionu kontrol altina almak istemiyorsak
        sadece kodun calisir hale gelmesi icin kirmizi cizgiyi kaldirmak istiyorsak
        javaya sorumlulugu aldigimizi beyan etmeliyiz

         public static void main(String[] args) throws FileNotFoundException {
         bunun icin method signituresine muhtemel exeption
         class ismini yazmaliyiz
        bu method da FileNotFoundException olusma riski var demektir
        \
       2 faydasi

       1- sorumlulugu aldik dedik
       2- bu clasi sonradan kulanacak kisiler
       veya parent edinecek classlar bu riskin farkina varmis olurlar


     */

        //  String str =45; // equired type: Provided:

      //  List<String> isimler = new List<>();
        // 'List' is abstract; cannot be instantiated

        int[] arr1 ={1,2,3};
       //  arr1 ={3,4,5}; // Array initializer is not allowed here

        // java kodlari ile txt dosyalarindeki bilgilere ulasabiliriz
        // java ile txt ile veya exel gibi dosyalara ulasmak icin
        // fileinputstrem dosyasi kullanilir

        String dosyaYolu ="src/day50_exeptions/deneme.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        // Unhandled exception: java. io. FileNotFoundException
        //  public static void main(String[] args) throws FileNotFoundException {

    }
}
