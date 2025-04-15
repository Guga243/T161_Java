package day18_MethodOlusturma;

public class C04_StringFiyatlariToplama {
    public static void main(String[] args) {
        // belirli bir formatta verilen String fiyatlari
        // toplayip yazdiran bir method olusturun
        // input1 : "15/30 $" , input2: "11.45 $"
        // output: 26.75$
        // not: sondeki para birimi degisken olmali

        fiyatToplaminiYazdir("15/30 usd","11.45 usd");


    }

    public static void fiyatToplaminiYazdir(String fiyatS1, String fiyatS2){

        //ONCE para birmini kaydedin
        int sonBoslukIndexi =fiyatS1.lastIndexOf(" ");
        String paraBirimi = fiyatS1.substring(sonBoslukIndexi); // " $"

        // sonra sayi olmayan yerseyi yok edin
        fiyatS1=fiyatS1.replaceAll("\\D",""); //1530
        fiyatS2=fiyatS2.replaceAll("\\D",""); //1145

        double fiyatD1 = Double.parseDouble(fiyatS1)/100; //15.30 wrapper clas ile stringi double cevirdik
        double fiyatD2 = Double.parseDouble(fiyatS2)/100;// 11.45 wrapper clas ile stringi double cevirdik

        System.out.println(fiyatD1+fiyatD2+paraBirimi);
    }
}
