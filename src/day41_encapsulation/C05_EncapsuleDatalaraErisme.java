package day41_encapsulation;

public class C05_EncapsuleDatalaraErisme {
    public static void main(String[] args) {

        C04_EncapsuleDatalar obj = new C04_EncapsuleDatalar();

        /*
        eger hicbir islem yapmazsak bu veriablelelrin acces modifirei
        default oldugu icin deger atama (write) ile deger goruntuleme (read)
        yetksini bir birinden ayiramayiz
         */

        /*
        write ile read yetkisini ayirmak gerektiginde
        bu veriable'leri privite yapmaliyiz kimse ulasamaz disardan/
        sadece kendi classi ulasabilir

        simdi bize verilen goreve uygun olarak write ve read yetkileri icin
         ozel methodlar olusturacagiz


         */

        //  obj.satisTutari =4500;  // write yetkisi
      //  System.out.println(obj.satisTutari); // read yetkisi

    //    obj.ToplamSatisTutari =3400000;
      //  System.out.println(obj.ToplamSatisTutari);
    }
}
