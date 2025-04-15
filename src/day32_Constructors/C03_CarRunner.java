package day32_Constructors;

public class C03_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();
        System.out.println("car1"+car1);
        // obje olusturulurken defoult contructor kullanilirsa
        //C01 clasindeki instance veriable degerlerine sahip
        // bir obje olusturuurlur


        car1.marka="Toyota";
        car1.fiyat=5000;
        car1.ilanNo=1001;
        car1.yil=2019;
        car1.model="corolla";
        System.out.println("car1'e atanan :" +car1);

        /*
        olusturulan objeye istenen ozelliklere sahip olmasi icin
        mutlaka atama yapilmalidir

        Ancakk: bu atamayi her obje icin tek tek yapmak yerine argument olarak
        constructora'a yollayip
        obje constructor'da olusturulurken
        atama isleminide aradan cikarabiliriz

         */

        C01_Car car2 = new C01_Car("Mercedes","E200",2000,3000,1002);

        System.out.println("car2 :"+car2);
        // car2 :C01_Car{marka='Mercedes', model='E200', ilanNo=1002, yil=2000, fiyat=3000}

       C01_Car car3 = new C01_Car("Tesla","t4",2020,7000,1003);
        System.out.println(car3);
     }
}
