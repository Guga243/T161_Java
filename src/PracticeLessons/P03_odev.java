package PracticeLessons;

public class P03_odev {
    public static void main(String[] args) {

        /*
        ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
        **********  WISE BANK   **********
            WISE ATM'YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        **********  WISE BANK   **********

         */
        System.out.println(" **********  WISE BANK   **********"
                + "\n\tWISE ATM'YE HOŞGELDİNİZ"
                +"\n\t1 – Bakiye Sorgulama"
                +"\n\t2 – Para Yatırma"
                +"\n\t3 – Para Çekme"
                +"\n\t4 – Bilgi Güncelleme"
                +"\n\t5 – Kart İade"
                +"\n**********  WISE BANK   **********");

         int a=3;
         int b= a++ + ++a + --a + a--;
        System.out.println("a: "+a);//3
        System.out.println("b: "+b);//16

        int x = 5 ,y = 10, z = 0;

        z = x-- - --y + ++x + y++ - x++;

        System.out.println("x: " + x);//6
        System.out.println("y: " + y);//10
        System.out.println("z: " + z);//5





    }
}
