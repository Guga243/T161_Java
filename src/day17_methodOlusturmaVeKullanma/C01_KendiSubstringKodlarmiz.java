package day17_methodOlusturmaVeKullanma;

public class C01_KendiSubstringKodlarmiz {
    public static void main(String[] args) {


        String metin = "Java Candir";

        int basIndex =2;
        int bitIndex =6;

        /*
        kullanicidan alinan bir metin
        kullanicinin girdigi baslangic ve bitis indexleri arasindeki kismi yazdirin

        kurallar:
        1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
        2- baslangic indexi bitis indexinden buyukse hata mesaji verin
        3- baslangic indexindeki karakter degil, bitis indexindeki karakter haric olmalidir

         */


        // 1- Eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
       if (basIndex<0 || bitIndex<0 || basIndex>=metin.length() || bitIndex>=metin.length()){
           System.out.println("girilen index gecersiz, metnin length'i "+metin.length());

       // 2- Baslangic indexi bitis indexinden buyukse hata mesaji verin
       } else if (basIndex>bitIndex) {
           System.out.println("baslangic indexi bitis indexinden buyuk olmaz");

       }else {
       // 3- baslangic indexindeki karakter degil, bitis indexindeki karakter haric olmalidir
           for (int i = basIndex; i <bitIndex ; i++) {
               System.out.print(metin.charAt(i));
           }
       }
        System.out.println("");

        // BU YUKARDA YAZDIGIMIZ BU KODLAR MI DAHA KOLAY YOKSA JAVA'NIN STRING CLASINA KOYDUGU SUBSTRING METODUNU
        //KULLANMAK MI DAHA KOLAY

        System.out.println(metin.substring(basIndex,bitIndex));

        metin.contains("a"); // bu kod gorevini yapti, boolean doner ama yazdirmasina gerek yok, istersek yazdiririrz

        metin.contains("k");
        // bize false soucu getirir bu sonuc yazdirilmadigi icin konsolda goremeyiz
        // kaydedilmedigi icinde bu degeri sonra kullanamayiz

        System.out.println(metin.contains("Java"));
        // burasi bize true doner\ sout da doneri yazar kosolda true goruruz
        // ancak sonucu bir veriable kaydetmedigimiz atamadigimiz icin tekrar kullanamayiz

        boolean sonuc = metin.contains(" ");
        // burasi true doner ama sonsolda goremeyiz ama sonra bir islem yapabiliriz cunku atama yapti sonuc veriable










    }
}
