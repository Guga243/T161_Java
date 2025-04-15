package day07_operatorler_ifElseStatments;

public class C03_And_Or_Tercihi {
    public static void main(String[] args) {


    /*
    verilen bir degerin
    verilen bir aralikta olup olmadigini kontrol
    etmemiz istenirse
    And kullanilir

     */

        int sayi = 34;
        //verilen sayinin 2 basamakli pozitif sayi ise true
        // 2 basamakli degilse false yazdirin

        System.out.println(sayi>=10 && sayi<=99);//true

        // verilen sayi 97 den buyuk ve 212 den kucuk ise true
        // bu sarti saglamiyorsa false

        System.out.println(sayi>97 & sayi<212);//false

        char karakter ='K';
        // verilen karakter kucuk harf ise true degilse false yazdirin

        System.out.println(karakter >='a' && karakter<='z');//false

        //Wrapper klas ile de bu soruyu cozebiliriz
        System.out.println(Character.isLowerCase(karakter));//false

        /*
        vrilen bir degerin verilen aralik disinda olmasi isteniyorsa
        o zaman || operatoru
        */

        sayi=54;
        // verilen sayi iki basamakli degilse pozitif sayi degilse true
        // degilse false

        System.out.println(sayi<10 || sayi >99);


        karakter ='K';
        //verilen karakter buyuk harf ise false
        // degilse true yazdirin

        System.out.println(!Character.isUpperCase(karakter));

        System.out.println(karakter<'A' || karakter>'z');

        System.out.println(!(karakter >= 'A' && karakter<='z')); 







    }
}
