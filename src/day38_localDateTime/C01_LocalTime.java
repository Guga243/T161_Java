package day38_localDateTime;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime yerelSaat = LocalTime.now();
        System.out.println("loopdan once yerel saat : "+yerelSaat); // 19:47:01.319467

        // bu method calistigi andeki degeri bize getirir bir kronometre gibi zamani tutmaya devam etmez
        // yerel saat degeri yeni bir atama olmadikca degismez


        // asagdeki islemin kac saniyede bitirildigini yazdirin
       LocalTime baslangicSaati = LocalTime.now();
        System.out.println("looptan sonra baslangic saati: "+baslangicSaati);

        String str ="";
        for (int i = 0; i <4000000 ; i++) {
            str+=i;



        }
        LocalTime bitisSaati = LocalTime.now();
        System.out.println("looptan sonra yerel saat : "+yerelSaat);
        System.out.println("looptan sonra bitis saat : "+bitisSaati);
    }
}
