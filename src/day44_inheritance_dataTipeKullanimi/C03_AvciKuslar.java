package day44_inheritance_dataTipeKullanimi;

public class C03_AvciKuslar extends C02_Kuslar {


    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";


    public static void main(String[] args) {

        String name  ="Ali";
        // string dta turu mu ypksa class midir?
        // string javaniin olusturdugu bir classdir
        // ama ayni zamanda name veriable icin data turudur
        /*

        bir objenin hangi classdan olusturuldugunu
        constructora bakip anlayabiliriz

        ama objenin hangi ozellikleri tasidigiini anlamak icin sadece constructor yetmez
        data turu de onemlidir


        *** eger ozellikler veriable olarak olustruulmussa
        1- gorus gecer;li olur
        obje hamgi data turunu kunnaiyorsa ayni data turune sahip
        tum objelerle oertak ozellikler gosterir

        ornek: data turu hayvanlar classi secilmisse butun hayvanlarla ortak ozelliklere sahip olur

         */


        // avci kuslardan bir obje olsturun
        C03_AvciKuslar AvciKartal = new C03_AvciKuslar();
        // avci kartalin C03_AvciKuslar clasinin objesidir
        // avciKartalin data turu C03AvciKuslar'dir

        System.out.println(AvciKartal.gaga); // av sivri gagali
        System.out.println(AvciKartal.pence); // av pencelidir
        System.out.println(AvciKartal.beslenme); // av et yerler
        System.out.println(AvciKartal.hareket);  // av ucarlar

        System.out.println(AvciKartal.cogalma); // k yumurta ile
        System.out.println(AvciKartal.solunum); // k akcigerle
        System.out.println(AvciKartal.kanat); // k kanatlidirlar

        System.out.println(AvciKartal.omur); // h yasar ve olurler



        C02_Kuslar KusgillerdenAvciKartal = new C03_AvciKuslar();
        // kusgillerdenavcikartal C03_AvciKuslar clasinin objesidir
        // kusgillerdenavciKartalin data turu C02Kuslar'dir

        System.out.println(KusgillerdenAvciKartal.gaga); // k gagalari vardir
       //  System.out.println(KusgillerdenAvciKartal.pence); // av pencelidir,  KUSLAR CLASSIN'DA PENCE YOK CTE
        System.out.println(KusgillerdenAvciKartal.beslenme); // h beslenirler
        System.out.println(KusgillerdenAvciKartal.hareket);  // h hareket ederler

        System.out.println(KusgillerdenAvciKartal.cogalma); // k yumurta ile
        System.out.println(KusgillerdenAvciKartal.solunum); //
        System.out.println(KusgillerdenAvciKartal.kanat); //

        System.out.println(KusgillerdenAvciKartal.omur); //




        C01_Hayvnlar hayvangillerdenAvciKartal = new C03_AvciKuslar();
        // hayvangillerdenAvciKartal C03_AvciKuslar clasinin objesidir
        // hayvangillerdenAvciKartal data turu C01_Hayvnlar

        // System.out.println(hayvangillerdenAvciKartal.gaga); // hayvanlar CLASSIN'DA gaga YOK CTE
        //  System.out.println(hayvangillerdenAvciKartal.pence); //   hayvanlar CLASSIN'DA PENCE YOK CTE
        System.out.println(hayvangillerdenAvciKartal.beslenme); // h beslenirler
        System.out.println(hayvangillerdenAvciKartal.hareket);  // h hareket ederler

        System.out.println(hayvangillerdenAvciKartal.cogalma); // h cogalir
        System.out.println(hayvangillerdenAvciKartal.solunum); // h anefes alir
       // System.out.println(hayvangillerdenAvciKartal.kanat); // hayvanlar CLASSIN'DA kanat YOK CTE

        // kuslar clasindan bir obje olusturun
        C02_Kuslar KusKartal = new C02_Kuslar();
        // kusKartal C02_Kuslar clasinin objesidir
        // kusKartal data turu C02_Kuslar

        System.out.println(KusKartal.gaga); // k gagalari vardir
        //  System.out.println(KusKartal.pence); //  KUSLAR CLASSIN'DA PENCE YOK CTE
        System.out.println(KusKartal.beslenme); // h beslenirler
        System.out.println(KusKartal.hareket);  // h hareket ederler

        System.out.println(KusKartal.cogalma); // k yumurta ile
        System.out.println(KusKartal.solunum); //
        System.out.println(KusKartal.kanat); //

        System.out.println(KusKartal.omur); //



        C01_Hayvnlar hayvangillerdenKusKartal = new C02_Kuslar();
        // hayvangillerdenKusKartal C02_Kuslar() clasinin objesidir
        // hayvangillerdenKusKartal'in data turu C01_Hayvnlar

        //  System.out.println(hayvangillerdenKusKartal.gaga); // hayvanlar CLASSIN'DA gaga YOK CTE
      //  System.out.println(hayvangillerdenKusKartal.pence); //   hayvanlar CLASSIN'DA PENCE YOK CTE
        System.out.println(hayvangillerdenKusKartal.beslenme); // h beslenirler
        System.out.println(hayvangillerdenKusKartal.hareket);  // h hareket ederler

        System.out.println(hayvangillerdenKusKartal.cogalma); // h cogalir
        System.out.println(hayvangillerdenKusKartal.solunum); // h anefes alir
       // System.out.println(hayvangillerdenKusKartal.kanat); // hayvanlar CLASSIN'DA kanat YOK CTE
        System.out.println(KusKartal.omur); //


        // hayvanlar clasindan bir obje
        C01_Hayvnlar hayvanKartal = new C01_Hayvnlar();

        // hayvanKartal C02_Kuslar() clasinin objesidir
        // hayvanKartal'in data turu C01_Hayvnlar

       //  System.out.println(hayvanKartal.gaga); // hayvanlar CLASSIN'DA gaga YOK CTE
      //  System.out.println(hayvanKartal.pence); //   hayvanlar CLASSIN'DA PENCE YOK CTE
        System.out.println(hayvanKartal.beslenme); // h beslenirler
        System.out.println(hayvanKartal.hareket);  // h hareket ederler

        System.out.println(hayvanKartal.cogalma); // h cogalir
        System.out.println(hayvanKartal.solunum); // h anefes alir
      //  System.out.println(hayvanKartal.kanat); // hayvanlar CLASSIN'DA kanat YOK CTE
        System.out.println(KusKartal.omur); //



    }

}
