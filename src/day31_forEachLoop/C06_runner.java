package day31_forEachLoop;

public class C06_runner {
    public static void main(String[] args) {


        C05_hastane personel1= new C05_hastane();
        /*
        bir clasdan bir obje olusturup
        ilk deger atamasi yapabilmek icin
        mutlaka bir constructor calismalidir

        java bir class olusturuldugunda classa gorunur bir
        constructor olusturulmazsa
        obje olustuurlabilmesini saglamak icin clasa default
        constructor koyar

        defoult constructor gornmex
        parametresizdir ve body'sinde kod olmaz
         */

        System.out.println(personel1.personelAdres); // atanmadi

        personel1.personelAdres="cankaya";
        System.out.println(personel1.personelAdres); // cankaya

        //esitliginin sol tarafini yazsak
        C05_hastane personel2 ;
        // personel2 icin bir constructor calisti mi? hayir

        // System.out.println(personel2.personelAdres);
        // per2 deger atanmamis olabilir hata verir

        //esitligin sadece sag tarafi
        System.out.println(new C05_hastane().personelAdres); // adres atanmadi
        System.out.println(new C05_hastane().personelIsim);//  isim atanmadi

        // atama yapilmadigi icin tek kullanilmis olir


    }
}
