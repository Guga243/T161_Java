package day23_scope;

public class C04_hastaneRunner {
    public static void main(String[] args) {

        C03_Hastane personel1 = new C03_Hastane();

        System.out.println(personel1.personelIsim); // isim atanmadi
        System.out.println(personel1.personelAdres); // adres atanmadi
        System.out.println(personel1.personelTelefonu); // tel atanmadi

        System.out.println(personel1.hastaneIsmi);// yildiz
        System.out.println(personel1.hastaneBasHekim);// dr guga

        personel1.personelIsim="Fulya";
        personel1.personelAdres ="Kuglu";
        personel1.personelTelefonu="352344";





        C03_Hastane personel2 = new C03_Hastane();
        personel2.personelIsim= "Sevda";
        personel2.personelAdres ="besiktas";
        personel2.personelTelefonu="3498902";
        personel2.hastaneBasHekim= "Dr Hugo";
        personel2.hastaneAdresi ="Istanbl";


        System.out.println(personel1.hastaneIsmi); // istanbul olacak
        System.out.println(personel1.personelIsim); // fulya degismeyecek
        System.out.println(personel1.hastaneBasHekim); // Dr Guga degil Hugo olur
        
        // eger instance degistirirse sadece kendisi icin degisir
        // eger static degistirise her obje icin gecerlidir







    }





}
