package day48_abstractClasses_interfacess;

import java.util.ArrayList;
import java.util.List;

public class C02_Auris extends C01_KuralciToyota{

    public void motor() {
        System.out.println("auris motor");
    }

    public void teker() {
        System.out.println("auris teker");

    }

    public static void main(String[] args) {

      // C01_KuralciToyota toyota = new C01_KuralciToyota();
        //toyota clasi abstract oldugundan obje olusturulamaz


       // List<String> liste = new List<>();

        List<String> liste = new ArrayList<>();
        // List abstract oldugundan esitligin sagini kullanamayiz
        // esitligin saginda List'in childi olan ArrayList() constructorunu
        // kullanmisiz

        C01_KuralciToyota toyota1 = new C02_Auris();
        toyota1.motor(); // auris motor
        toyota1.teker(); // auris teker
        toyota1.xeonFar(); // toyota araclarinda xeonFar opsiyoneldir
        toyota1.sunroof(); // toyota araclarinda sunroof opsiyoneldir







    }






}
