package day56_nestedMap;

public class C04_NestedOgrenciMapKullanma extends NestedMapDepo{
    public static void main(String[] args) {

        System.out.println(ogrenciNestedMap);
        /*

            {101={sube=H, soyisim=Can, sinf=11, bolum=Mf, isim=Ali},
            102={sube=K, soyisim=Cem, sinf=10, bolum=TM, isim=Veli},
            103={sube=K, soyisim=Cem, sinf=11, bolum=TM, isim=Ali},
            104={sube=H, soyisim=Can, sinf=10, bolum=MF, isim=Ayse},
            105={sube=M, soyisim=Cem, sinf=11, bolum=TM, isim=Sevgi},
            106={sube=K, soyisim=Can, sinf=10, bolum=MF, isim=Sevgi},
             107={sube=M, soyisim=Han, sinf=11, bolum=SOZ, isim=Esra}}


         */
        mapeOgrenciEkle(110,"guga","hugo","27","Chicago","Usa");
        System.out.println(ogrenciNestedMap);
        // devamina ekledi
        // 110={sube=Chicago, soyisim=hugo, sinf=27, bolum=Usa, isim=guga}


    }

}
