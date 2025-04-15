package day11_switchStatement_StringManipulation;

import java.util.Scanner;

public class C04_yuzdenKucukPozitifSayiYazdirma {
    public static void main(String[] args) {

        // kullanicidan 100den kucuk pozitif tam sayi isteyin
        // girilen rakami yazi ile yazdirin
        // orn input 17 , output : onyedi
        //  0 ile 99 arasindeki sayilar disinda sayi yazarsa
        // hata mesaji verin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen 100den kucuk pozitif bir tam sayi girinz");
        int sayi = scann.nextInt();
        String mesaj = " ";

        //17 ==> onlar basamagi ==> on  birler basamagi 7==> onyedi
        //54 ==> onlar basamagi ==> on  birler basamagi 54==> ellidort

        int birlerBasamagindkiRakam =sayi %10;
        int onlarBasamagiRakam =sayi/10;

        if (sayi <=0 || sayi>=100){
            System.out.println("hatali sayi");
        }else { // burasi iki basmaakli pozitif sayilar bolgesi
            // once sayinin onlar basamagini bulup yaziya cevirelim
            switch (onlarBasamagiRakam) {
                case 0:
                    break;
                case 1:
                    mesaj = "on";
                    break;
                case 2:
                    mesaj = "yigrimi";
                    break;
                case 3:
                    mesaj = "otuz";
                    break;
                case 4:
                    mesaj = "kirk";
                    break;
                case 5:
                    mesaj = "elli";
                    break;
                case 6:
                    mesaj = "altmis";
                    break;
                case 7:
                    mesaj = "yetmis";
                    break;
                case 8:
                    mesaj = "seksen";
                    break;
                case 9:
                    mesaj = "doksan";
                    break;

                // sonra birler basamagindeki sayiyi onlar basamaginin yanina ekleyelim

            }

            switch (birlerBasamagindkiRakam) {
                case 0:
                case 1:
                    mesaj += "bir";
                    break;
                case 2:
                    mesaj += "iki";
                    break;
                case 3:
                    mesaj += "uc";
                    break;
                case 4:
                    mesaj += "dort";
                    break;
                case 5:
                    mesaj += "bes";
                    break;
                case 6:
                    mesaj += "alti";
                    break;
                case 7:
                    mesaj += "yedi";
                    break;
                case 8:
                    mesaj += "sekiz";
                    break;
                case 9:
                    mesaj += "dokuz";
                    break;
            }
        }
        System.out.println(mesaj);





    }
}
