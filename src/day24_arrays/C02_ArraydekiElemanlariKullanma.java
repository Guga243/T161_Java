package day24_arrays;

import java.util.Arrays;

public class C02_ArraydekiElemanlariKullanma {
    public static void main(String[] args) {

        int [] sayilar = {3,7,9,12,54,16};
        // sayilar arrayindeki ilk sayi olan 3'u yazdirin

        System.out.println(sayilar[0]); // 3
        // INDEX'E GORE CAGIRIR

        //sayilar arrayindeki 9'u 29'olarak update edin

        sayilar[2]= 29; // sayilar arrayindeki 2.ci indexdeki sayiyi 29 yapar
        System.out.println(sayilar[2]); //29

        // tum elemanlari yazdirmak icin for loop ile yan yana yazdiririz

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");

            System.out.println();



        }

        // sayilar arrayine yeni bir eleman eklemek istersek
         // {3,7,9,12,54,16}; buraya yeni 7.ci eleman olarak 20 degerini eklemek istersek
       //    sayilar[7]=20;
        // ARRAY INDEX OUT OF EXCEPTION VERIR

        // Arrayi yazdirin
        System.out.println(sayilar); //[I@67b64c45
        // bir arrayi direk olarak yazdirmak isterseniz java arrayin referansini yazdirir

        // arrayi yazdirmak icin arrays classindan hazir method kullaniriz

        System.out.println(Arrays.toString(sayilar)); //[3, 7, 29, 12, 54, 16]

    }
}
