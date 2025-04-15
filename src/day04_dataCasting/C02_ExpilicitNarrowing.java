package day04_dataCasting;

public class C02_ExpilicitNarrowing {
    public static void main(String[] args) {

        int a = 13;
        int b =4567;

        //byte c = a;
       // byte d = b;

        /*
        java kodlari compile ederken (kodlari gozden gecirirken bilgisayardan alacagi 1 ve 0 lara
        dondururken yani run tusuna basmadan once
        sadece syntex yazilim sekili ile ilgilenir
        degerlere bakmaz

        daha kapsamli data turundeki degeri
        daha dar kapsamli datat turundeki veriable atamk isterseniz java bunu otomatik yapmaz
        sorumluluk almanizi ister
         */

        byte c= (byte) a;// a'nin data turu int ama biz byte'a atamak istiyoruz
        byte  d= (byte) b;
        System.out.println("13'un byte veriableine atanis hali :"+c);//13
        System.out.println("3567'in byte veriablea atanis hali"+d);// -41

        double dbl1 = 74.3;
        float fl1 = 57.98f;

        int sayi1 = (int) dbl1;
        int sayii2 =(int) fl1;
        System.out.println("74.3un int veriable'a atilmis hali"+ sayi1);// 74 int oldugu icin ondalikli halini atiyor
    }
}
