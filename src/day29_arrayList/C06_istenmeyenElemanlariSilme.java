package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06_istenmeyenElemanlariSilme {
    public static void main(String[] args) {

        // verilen String bir listede
        // istenmeyen harf iceren elementleri silip
        // kalan kismini list olarak bize donduren bir method olusturun

        List<String> liste1 =
                new ArrayList<>(Arrays.asList("Merve","Cennet","Buse","Serpil","eda","servet"));
        String silinecekHarf ="e";

        // e iceren isimleri silin

        // listedeki tum isiimleri tek tek ele alalim
        for (int i = 0; i < liste1.size() ; i++) {
            if (liste1.get(i).contains(silinecekHarf)){
                liste1.remove(liste1.get(i));

                // uzerinde calisilan listee bir silme yaptiginizda index kaymis oluyor
                // cozum, silme yapinda i'yi bir azaltabiliriz
                i--;
            }
        }
        System.out.println(liste1);




    }
}
