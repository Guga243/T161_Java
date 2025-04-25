package day51_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ParentChildCheckExeptions {

    public static void main(String[] args) throws IOException {


        // day50 pacage'deki deneme.txt dosyasindeki
        // yazilari konsolda yazdirin

        // dosya yolunu kullanarak fileinputstream olusturmaliyiz

        String dosyaYolu = "src/day50_exeptions/deneme.txt";
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(dosyaYolu);
            int k = 0;
            while((k= fileInputStream.read() ) != (-1)) {
                //  Unhandled exception: java. io. IOException
                System.out.print((char) k);
            }

            // child parent iliskisi varsa once child exeption sonra parent exeption kullanilir

        } catch (FileNotFoundException e) { // child exeptiom
            System.out.println("dosya bulunamadi");
        }catch (IOException e){  // parent exeption
            System.out.println("dosya okunamadi");

        }




    }
}
