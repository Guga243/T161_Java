package day06_Increament_Decrement;

public class C02_preincrement_postincrement {
    public static void main(String[] args) {

        //1. ihtimal ayni satirda yazdirma islemi olursa

        int a = 20;
        int b= 30;

        System.out.println(a++);//20 cunku once degeri yazar sonra arttirdik
        System.out.println(a);// 21 cunku sonra arttirdi

        a=20;
        System.out.println(++a);//21 cunku once ++ var sonra yazdirir

        System.out.println("b'nin degeri"+b--);//30 cunku once yazdirir sonra azaltir
        System.out.println("b'nin degeri "+b);//29
        System.out.println("b'nin degeri"+--b); // 28 cunku once azaltir sonra yazar

        //2. ihtimal ayni satirda atama islemi olursa

        a=20;
        int c= a++;
        System.out.println("a'nin degeri "+a+"c"+c);//21 20

        a=20;
        c=++a;
        System.out.println(a+","+c);//21 21

        b=40; // once b'nin degerini c'e ata
        c=b--;// sonra b'nin degerini 1 azalt
        System.out.println(b+","+c);// 39 40


        //3. ihtimal ayni satirda matamatiksel islemi olursa

        a=20;
        c=2* a++ -3;
        System.out.println(a +","+c); // 21 37

        a=20;
        c=++a+20;
        System.out.println(a+","+c); //21 41

        b=40;
        c=3*(b-- -2);
        System.out.println(b+","+c); //39 /114

        b=40;
        c=2* --b+3;
        System.out.println(b+","+c); // 39 81










    }
}
