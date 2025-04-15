package day37_immuttableClasses;

public class C02_StringeYeniDegerAtama {
    public static void main(String[] args) {

        String str ="java";

        str = "Tava";

        int [] arr= {3,5,6};
        // arr arrayin'e 5.eleman olarak 8 eklenemez

        // yeni array olustuurp eskiyi yeniye ekleme yapariz

        int [] yeniArray ={3,4,5,6,7};
        arr =yeniArray;

    }
}
