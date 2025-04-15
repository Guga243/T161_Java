package day29_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_kullaniciyaListeOlusturtma {
    public static void main(String[] args) {

        List<String> sinfListesi = getIsimList();
        System.out.println(sinfListesi);
    }

    public static List<String> getIsimList() {


        Scanner scann = new Scanner(System.in);

        List<String> isimlerListesi = new ArrayList<>();
        String girilenIsim = "";

        do {
            System.out.println("listeye eklemek icin bir isim girin .. " + "\nbitirmek icin Q basin");

            girilenIsim = scann.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")) { // q degilse
                isimlerListesi.add(girilenIsim);

            }


        } while (!girilenIsim.equalsIgnoreCase("q"));
        // calismaya devam etmesi icin gerekli sart

        return isimlerListesi;


}
}

    //Kullanicidan istedigi kadar isim alip,
    // Q’ya bastiginda girdigi isimleri
    // bize liste olarak dondurecek bir method olusturun.






