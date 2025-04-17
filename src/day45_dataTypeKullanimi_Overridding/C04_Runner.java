package day45_dataTypeKullanimi_Overridding;

public class C04_Runner {
    public static void main(String[] args) {

        // avci kuslar classindan bir obje olusturun
        C03_AvciKuslar avciKartal = new C03_AvciKuslar();
        // avcikartal C03_AvciKuslar() clasinin objesidir
        // avcikartalin data turu C03_AvciKuslar
        // cumlemiz soyle baslar: avcikartal da butun avxi kuslar gibi ...
        avciKartal.gaga(); // av sivri gagali
        avciKartal.pence(); // av pencelidir
        avciKartal.beslenme(); // av et yerler
        avciKartal.hareket(); // av ucarlar
        avciKartal.cogalma(); // k yumurta ile cogalirlar
        avciKartal.solunum(); // k akciger ile nefes alirlar
        avciKartal.kanat();// k kanatlidirlar
        avciKartal.omur(); // h  yaar ve olurler


        C02_Kuslar kuscugillerdenAvciKartal = new C03_AvciKuslar();
        //

        // cumlemiz soyle baslyiypr,kuscugillerdenAvciKartal butun kuslar  gibi ..
        // hem de daha guncel olarak
        kuscugillerdenAvciKartal.gaga();
        // kuscugillerdenAvciKartal.pence(); // kuslarda yok cte
        // kuscugillerdenAvciKartal butun kuslar gibi pencelidir diyemeyiz
        kuscugillerdenAvciKartal.beslenme();
        kuscugillerdenAvciKartal.hareket();
        kuscugillerdenAvciKartal.cogalma();
        kuscugillerdenAvciKartal.solunum();
        kuscugillerdenAvciKartal.kanat();
        kuscugillerdenAvciKartal.omur();

        C01_Hayvanlar hayvangillerdenAvciKartal = new C03_AvciKuslar();

        // cumlemiz soyle baslyiypr, hayvangillerdenAvciKartal hayvanlar gibi ..
        // hem de daha guncel olarak

     //    hayvangillerdenAvciKartal.gaga();
       //  hayvangillerdenAvciKartal butun hayvanlar gibi gagalidir diyemeyiz hayvanlar clasinda yok cte
       //   hayvangillerdenAvciKartal.pence(); // kuslarda yok cte
        //  hayvangillerdenAvciKartal butun hayvanlar gibi pencelidir diyemeyiz hayvanlar clasinda yok cte
        hayvangillerdenAvciKartal.beslenme();
        hayvangillerdenAvciKartal.hareket();
        hayvangillerdenAvciKartal.cogalma();
        hayvangillerdenAvciKartal.solunum();
     //    hayvangillerdenAvciKartal.kanat();
        //  hayvangillerdenAvciKartal butun hayvanlar gibi kanatlidir diyemeyiz hayvanlar clasinda yok cte
        hayvangillerdenAvciKartal.omur();

        /*

        onceki gun ozellikleri veriable olarak olusturdugumnzda
        onemli olan: data turudur
        data turu ayni olan objelerin
        constructoru farki olsa bile ayni ozelliklere sahip oldugunu gorduk

        ozellikler method olarak olusturuldugunda
        constructor daha onemli hale geliyor
        constructoru ayni olan objeler
        ya ayni sonucu verir yada cte olusur
         */



        // kuslar clasindan bir obje olusturun
        C02_Kuslar kusKartal= new C02_Kuslar();

        // kusKartal C02_Kuslar() clasinin objesidir
        // kusKartal data turu C02_Kuslar
        // cumlemiz soyle baslar: kusKartal da butun  kuslar gibi ...

        kusKartal.gaga(); // av sivri gagali
       //  kusKartal.pence(); // av pencelidir
        kusKartal.beslenme(); // av et yerler
        kusKartal.hareket(); // av ucarlar
        kusKartal.cogalma(); // k yumurta ile cogalirlar
        kusKartal.solunum(); // k akciger ile nefes alirlar
        kusKartal.kanat();// k kanatlidirlar
        kusKartal.omur(); // h  yaar ve olurler


        C01_Hayvanlar hayvangillerdenKusKartal = new C02_Kuslar();

        // hayvangillerdenKusKartal C02_Kuslar() clasinin objesidir
        // hayvangillerdenKusKartal data turu C01_Hayvanlar
        // cumlemiz soyle baslar: kusKartal da butun  kuslar gibi ...
        // hem de

       // hayvangillerdenKusKartal.gaga(); // av sivri gagali
       // hayvangillerdenKusKartal.pence(); // av pencelidir
        hayvangillerdenKusKartal.beslenme(); // av et yerler
        hayvangillerdenKusKartal.hareket(); // av ucarlar
        hayvangillerdenKusKartal.cogalma(); // k yumurta ile cogalirlar
        hayvangillerdenKusKartal.solunum(); // k akciger ile nefes alirlar
       // kusKarhayvangillerdenKusKartaltal.kanat();// k kanatlidirlar
        hayvangillerdenKusKartal.omur(); // h  yaar ve olurler

        /*
        onemli not : ozelligin gucel halini ararken
        inebilecegimiz son class constructorun clasidir
        daha asagda guncel bilgi olsa bile asagya inilmez
         */


        // hayvanlar clasindan bir obje olusturun

        C01_Hayvanlar hayvanKartal = new C01_Hayvanlar();

        // hayvanKartal.gaga(); // av sivri gagali
       // hayvanKartal.pence(); // av pencelidir
        hayvanKartal.beslenme(); // av et yerler
        hayvanKartal.hareket(); // av ucarlar
        hayvanKartal.cogalma(); // k yumurta ile cogalirlar
        hayvanKartal.solunum(); // k akciger ile nefes alirlar
         //hayvanKartal.kanat();// k kanatlidirlar
        hayvanKartal.omur(); // h  yaar ve olurler



    }
}
