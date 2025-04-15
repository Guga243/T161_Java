package day32_Constructors;

public class C01_Car {

    String  marka =" marka atanmadi";
    String model ="model atanmadi";
    int ilanNo =0;
    int yil =1000;
    int fiyat =0;

   C01_Car(String mrk,String mdl,int yl,int fyt,int iNo){
       marka=mrk;
       model=mdl;
       fiyat=fyt;
       yil=yl;
       ilanNo=iNo;

   }

   // biz gorunur konstructor olusturdugumuzda defoult constructoru siler
    // bu durumda daha once defoult constructor ile olusturulan objeler
    // CTE verir

    // bunun onune gecmek icin bir class da herhangi gorunur constructor
    // olusturdugumuzda parametresiz constructor da olustururuz

    C01_Car(){

    }

    /*
    bir class' olusturdugumuzda baska class'larda
     bu class'dan obje olusturuldugunda
    objenin referansini degil tum ozelliklerini yazdirmasini isterseniz

    toString() methodunu classiniza uyarlamaliyiz

    */

    @Override
    public String toString() {
        return "C01_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", ilanNo=" + ilanNo +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
