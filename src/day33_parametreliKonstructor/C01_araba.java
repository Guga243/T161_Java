package day33_parametreliKonstructor;

public class C01_araba {

    String  marka =" marka atanmadi";
    String model ="model atanmadi";
    int ilanNo =0;
    int yil =1000;
    int fiyat =0;

    C01_araba(String mrk, String  mdl){

        marka=mrk;
        model=mdl;
    }

    public C01_araba(String model, int ilanNo, String marka, int yil, int fiyat) {
        this.model = model;
        this.ilanNo = ilanNo;
        this.marka = marka;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    C01_araba(int ilanNo, String  marka, String model){

        // constructor'lara intelij'e de oluturtabiliriz


       // ilanNo = ilanNo;

        // esitligin sol tarafindeki veriablelere siz class veriable deki
        // class veriable'siniz demesi gerekiyor
        // java bu islem icin ozel keyword olusturmus
        // this....

        this.ilanNo = ilanNo;
        this.marka=marka;
        this.model= model;

    }

    C01_araba(){

    }

    @Override
    public String toString() {
        return "C01_araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", ilanNo=" + ilanNo +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }



}
