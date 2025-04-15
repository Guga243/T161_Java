package day13_stringManipulation;

public class C02_indexOf_2Parametre {
    public static void main(String[] args) {
        //
        String str ="Ali topu at, at Ali at";

        // metinde 2 adet Ali gectigi biliniyorsa 2.ali'nin indexini bulun

        int ilkAliIndexi = str.indexOf("Ali");
        System.out.println(ilkAliIndexi);//0

        int ikinciAliIndexi =str.indexOf("Ali",ilkAliIndexi+1);//
        System.out.println(ikinciAliIndexi);// 16

        // str da 3  at gectigi biliniyorsa
        //3.at kelimesinin indexi'ni yazdirin
        int ilkAtIndexi = str.indexOf("at");
        int ikinciAtIndexi = str.indexOf("at",ilkAtIndexi+1);
        int ucuncuAtIndexi = str.indexOf("at",ikinciAtIndexi+1);
        System.out.println(ucuncuAtIndexi);// 20


        //"Ali topu at, at Ali at";
        // str da top kelimesinin 1, 2, 3 kullanimlarinin indexlerini yazdirin

        int ilkTopIndexi = str.indexOf("top");
        int ikinciTopIndexi = str.indexOf("top",ilkTopIndexi+1);
        int ucuncuTopIndexi = str.indexOf("top",ikinciTopIndexi+1);
        System.out.println(ilkTopIndexi);// 4
        System.out.println(ikinciTopIndexi);// -1
        System.out.println(ucuncuTopIndexi); // 4






    }
}
