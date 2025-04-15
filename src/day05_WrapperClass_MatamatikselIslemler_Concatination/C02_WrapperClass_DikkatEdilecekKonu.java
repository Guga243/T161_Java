package day05_WrapperClass_MatamatikselIslemler_Concatination;

public class C02_WrapperClass_DikkatEdilecekKonu {
    public static void main(String[] args) {
        int sayiInt = 23;
        double sayiDbl= 45.3;


        double a= sayiInt;
        int b= (int)sayiDbl;

        //auto widening ve explicit narrowing wrapper
        // claslar icin de geverli midir

        Short shrtWrap =24;
        Integer intWrap =34;
        // Wraper classlar non-primitive turleridir
        //non-primitive data turlerinde casting sadece parent-Child
        //arasinda olur
        //Wraper classlarin arasinda oyle bir iliski olmadigindan casting yapilamaz

        //Integer ab= shrtWrap; OLMAZ
       // Integer ac= (Integer) shrtWrap; OLMAZ
       // Short bc = intWrap;
       // Short bc = (Short) intWrap;

        // String'i integer'e cevirme

        String str ="123";
        Integer ParsedInt =Integer.parseInt(str);
        System.out.println(ParsedInt);//123




    }
}
