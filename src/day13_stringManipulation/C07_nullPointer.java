package day13_stringManipulation;

public class C07_nullPointer {
    public static void main(String[] args) {

        String ogrenci1 ="Yusuf";
        String ogrenci4 ;

        System.out.println(ogrenci1);
        //System.out.println(ogrenci4);
        // java da method icerisinde deger tamadan veriable declare edebiliriz ama
        // deger atamadan o veriableyi kullanamayiz

        String ogrenci5="";
        System.out.println(ogrenci5); // bos satir
        // yazdirabilmek icin hiclik atamak iyi bir cozum olabilir ama
        // bu durumda ogrenci 5'e bir isim atanmis olur java bu degerin ne oldugu ile ilgilenmez
        // atama yapildi olarak algilar

        /*
        java BON PRIMITIVE bir veriable'i hem bos birakip(deger atamayip) hem de yazdirabilmemiz icin
        NULL POINTER olusturmuatur

        ONEMLI NOT:
        java null olarak isaretlenen veriableleri sadece yazdirmaya izin veirir yazdirma disinda kullanirsaniz
        eror veriyor

         */

        String ogrenci6 = null;
        System.out.println(ogrenci6); //null
        System.out.println(ogrenci6.length());
        System.out.println(ogrenci6.isEmpty());

    }
}
