package day43_constructorCall_ClassUyeleriniKullanma;

public class C02_Toyota extends C01_Car{


    C02_Toyota(){
        System.out.println("toyota constructor calisti");
    }
/*
child classlar baslangic itibari ile parent classdeki tum ozelliklere sahiptir

2- child classlarda parent classdeki ozellikleri kendilerine uyarlayabilir
daha spesifiik hale getirebilir

3- child class parent classda olmayan ama tum child class objelerinde ortak
olarak bulunan yeni ozellikler ekleyebilir




 */
    String marka ="Toyota";
    String motor ="Toyota Motor";

    String lastik = "Pirelle";
    String guvenlik ="TG1023";





}
