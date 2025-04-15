package day13_stringManipulation;

import java.util.Scanner;

public class C05_Soru {
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

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);

        if (ilkIndex==-1){
            System.out.println("aranan metin cumlede kullanilmamis");

        } else if (ilkIndex ==sonIndex) {
            System.out.println("aranan metin cumlede bir kere kullanilmis");

        }else {
            System.out.println("birden fazla kullanilmis");

        }




    }
}
