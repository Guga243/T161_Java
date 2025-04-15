package day04_dataCasting;

public class C03_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
        biz java'a explicit casting yapmasinini soylersek java degeri veriablenin turune
        uygun hale getirmek icin degerini degistirebilir ve data kayiplari olabilir

        dbl1 = 74.3 ==> int'a cast edildiginde 74 olur ondalikli sayi silinir

         */

        int sayi1= 17;
        int sayi2 = 125;
        int sayi3= 134;
        int sayi4 = 145;
        int sayi5 = 260;
        int sayi6 = 520;
        int sayi7= 1245621;

        byte byt = (byte) sayi1;
        System.out.println("17nin bytea cast edilmis hali"+byt);//17

        byt = (byte) sayi2;
        System.out.println("125nin bytea cast edilmis hali"+byt);//125

        byt = (byte) sayi3;
        System.out.println("134nin bytea cast edilmis hali"+byt);//-122

         byt = (byte) sayi4;
        System.out.println("145nin bytea cast edilmis hali"+byt);//-111

        byt = (byte) sayi5;
        System.out.println("260nin bytea cast edilmis hali"+byt);//4

         byt = (byte) sayi6;
        System.out.println("520nin bytea cast edilmis hali");//8

         byt = (byte) sayi7;
        System.out.println("12456721nin bytea cast edilmis hali");//-75


    }
}
