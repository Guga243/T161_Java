package day13_stringManipulation;

import java.util.Scanner;

public class C03_Soru {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        //        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        //        // 1- cumle aranan metni icermiyor
        //        // 2- cumle aranan metni sadece 1 adet iceriyor
        //        // 3- cumle aranan metni 1'den fazla iceriyor

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scann.nextLine();

        System.out.println("cumlede aranacak metni giriniz");
        String metin = scann.nextLine();

        int metinIlkIndex= cumle.indexOf(metin);
        int metinIkinciIndex = cumle.indexOf(metin,metinIlkIndex);

        if (metinIlkIndex==-1){ // ilk index -1 ise zaten hic bulunmamaistir
            System.out.println("aradiginiz metin cumlede yok");
        } else if (metinIlkIndex!=-1 && metinIkinciIndex==-1) {
            System.out.println("aradiginiz metin cumlede sadece bir kere geciyor");

        }else{
            System.out.println("aradiginiz metin cumlede birden fazla kullanilmis");
        }


    }
}
