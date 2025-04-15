package day27_multiDimentionalArrays;

public class C02_MDA_tumElementleriGozdenGecirme {
    public static void main(String[] args) {




        int[] numbers = {3, 7, 8, 1};
        // numbers Arrayindeki tum elementlerin toplamini yazdirin

        int toplam = 0;
        for (int i = 0; i < numbers.length; i++) {
            toplam+=numbers[i];
        }
        System.out.println(toplam);//19

        int[][] sayilar = {{3, 5, 4}, {2, 3, 6, 8}, {2, 4}, {10}, {3, 9, 0, 2, 7}};
        // sayilar Arrayindeki tum elementlerin toplamini yazdirin
        // sayilar 2 katli bir array oldugundan elemanlara ulasmak icin
        // sayilar[1][2] gibi 2 indexe ihtiyacimiz var

        toplam=0;


        for (int i = 0; i < sayilar.length ; i++) { // outer for loop outor arrayi kontrol eder
            // sayilar [i][]

            for (int j = 0; j <sayilar[i].length ; j++) { // iner for loop iner arrayleri konrol eder
                // sayilar [i][j]

                toplam+=sayilar[i][j];
            }

        }
        System.out.println(toplam);// 68



    }



}
