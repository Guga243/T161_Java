package day25_array;

public class C07_odev {
    // kullanicidan deger alaral string bir array olusturturun
    // strin arraydeki en uzun ve en kisa ismi yazdirin

    public static void main(String[] args) {

        String [] kelimeler  = C05_kullaniciyaArrayOlusturrtma.kullaniciyaArrayOlusturt();

        String enKisaKelime = kelimeler[0];
        String enUzunKelime =kelimeler[0];

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length() < enKisaKelime.length()){
                // loop'un getirdigi (i) isim en kisa isimden daha kisa
                enKisaKelime=kelimeler[i];

            }
            if (kelimeler[i].length() > enUzunKelime.length()){
                // loop'un getirdigi (i) isim en uzun isimden daha uzun
                enUzunKelime= kelimeler[i];
            }
        }
        System.out.println("girilen kelimelerden en uzun olan : "+enUzunKelime);
        System.out.println("girilen kelimelerden en kisa olan : "+enKisaKelime);


    }
}
