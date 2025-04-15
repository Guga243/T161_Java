package day43_constructorCall_ClassUyeleriniKullanma;

public class C01_Car {

    /*

    1- bir child class da olusturulan objeler
    parent class(lardeki) tum ozelliklere sahip olur

    2- bir obje olusturulurken
    ilk deger atamasini (instance veriablelerin bir kopyasini
    objeye yapistirma islemini) konstructor yapar

    yuardeki iki maddeyi birlestirirsek child class da olustuurlan bir objenin parent class deki
    ozelliklere sahip olmasi icin parent class constructorun calismasi gerek

    java inheritance kullanan (extense) ile parent edinen
    classlardeki her constructorun ilk satirinda
    parent class constructorunu calistiracak
    super constructor call yerlestirmistir

    bir constructorda birden fazla constructor call olmayacagi icn eger codu yazan kisi
    ilk satira constructor call yazarsa java kendi koydugu super constructor siler
     */

    C01_Car(){
        System.out.println("car constructor calisti");
    }


    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public String motor = "Motor secenegi belirtilmedi";
    public String sanzuman = "Sanzuman secilmedi";
    public String kasa = "Kasa secilmedi";
}
