package day14_stringMonipulation;

public class C04_StringFiyatlariToplama {
    public static void main(String[] args) {

        // kullanici belirli bir formatta verdigi String fiyatlari
        // toplayip yazdirin

        // input1: "15.30$" , input2: "11.45$"
        // output : 26.75$
        //Not: sondaki para birimi degisken olabilir

        String fiyatS1 ="15.30 USD";
        String fiyatS2="11.45 USD";
        System.out.println(fiyatS1+fiyatS1); //15.30$15.30$ / ISTENEN BU DEGIL

        //ONCE para birmini kaydedin
        int sonBoslukIndexi =fiyatS1.lastIndexOf(" ");
        String paraBirimi = fiyatS1.substring(sonBoslukIndexi); // " $"

        // sonra sayi olmayan yerseyi yok edin
        fiyatS1=fiyatS1.replaceAll("\\D",""); //1530
        fiyatS2=fiyatS2.replaceAll("\\D",""); //1145

        double fiyatD1 = Double.parseDouble(fiyatS1)/100; //15.30 wrapper clas ile stringi double cevirdik
        double fiyatD2 = Double.parseDouble(fiyatS2)/100;// 11.45 wrapper clas ile stringi double cevirdik

        System.out.println(fiyatD1+fiyatD2+paraBirimi);


        // sayilardan olusan stringi toplama islemi yapabilmk icin doubla cevirelim

        //doubla cevirdigimiz fiyatlari toplayip yanina basta kaydettigimiz para birimi yazdiralim
    }
}
