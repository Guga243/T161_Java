package day38_localDateTime;

import java.time.LocalTime;

public class C03_islemSuresiBulma {
    public static void main(String[] args) {

        // asagdeki islem icin islem suresini yazdirin

        // 1-yontem looptan once ve sonra yerel saat olustuurp farklarini bulalaim

        LocalTime baslangic = LocalTime.now();

        String str = "";
        for (int i = 0; i <100000 ; i++) {
            str+=i;
        }

        LocalTime bitis = LocalTime.now();

        System.out.println("baslangic saatti : "+baslangic);
        System.out.println("bitis saatti : "+bitis);

        System.out.println("saniye olarak fark : " +(bitis.getSecond()-baslangic.getSecond()));
        // bu yontem saglikli calismayabilir
        // dakika ya da saat gecisi oldugunda -55 saniye gibi fark verebilir

        // - yontem
        // gunun baslangicina gore saniyeler arasindeki farki bulabiliriz

        // gece yarisi 00:00 dan kodun calistigi zamana kadar gecen saniye miktari verir


        System.out.println(baslangic.toSecondOfDay()); // 74410
        System.out.println(bitis.toSecondOfDay()); // 74413
        System.out.println("calisma suresi saniye olaralk : "+(bitis.toSecondOfDay() - baslangic.toSecondOfDay()) );
        // calisma suresi saniye olaralk : 3

        // 3-yontem
        // eger zaman farkini daha hassas olarak bulmak istersek nanosaniye bakabiliriz

        System.out.println("calisma suresi Nanosaniye olaralk : "
                +(bitis.toNanoOfDay()-baslangic.toNanoOfDay())); // 2747413200


    }
}
