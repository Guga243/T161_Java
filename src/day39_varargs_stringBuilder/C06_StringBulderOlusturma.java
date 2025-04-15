package day39_varargs_stringBuilder;

public class C06_StringBulderOlusturma {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        // bos bir stringbuilder olusturur ve 16 kapasitesli stringbulder olustururu (standart)
        System.out.println(sb1);
        System.out.println(sb1.length());



        StringBuilder sb2 = new StringBuilder(10);
        //  10 karakter alabilecek bir stringbulder olsturmus oluruz
        System.out.println(sb2);
        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity()); //  10



        StringBuilder sb3 = new StringBuilder("java candir");
        System.out.println(sb3); //java candir
        System.out.println(sb3.length()); // 11
        System.out.println(sb3.capacity()); // 16 + 11 =27


        // bos bir string buildere atama yapmak
        // direk olarak metin degeri atayamayiz
         // sb1 = "ali can";
        // new ile yapabiliriz ama gereksiz yere yeni obje olusturus oluruz
        //  sb1 = new StringBuilder("ali can ");

        // en iyisi
        sb1.append("java kral");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1);


    }
}
