package day44_inheritance_dataTipeKullanimi;

public class C01_Hayvnlar {

    /*

    kartal hem hayvanlar clasinda
    hem kuslar clasinda
    hem de avci kuslar clasinda var

    pekii
    hayvanlar clasindeki kartal ile kuslar clasindeki kartal
     ve avci kuslar clasindeki kartal ayni ozellikleri mi tasir

     bu konuda iki farkli gorus var
     1- her obje clasindeki diger objelerle ortak ozellikler tasimalidir
     ornek: kartal da BUTUN HAYVANLAR GIBI HAREKET EDER

     2-her obje clasindeki diger objelerle ortak ozellikler tasimalidir,
     (hayvanlar clasindeki kartal icin gaga kanat veya pence den bahsetdemeyiz)
     AMMAAA var olan ortak ozelliklerin mumkun ise en guncel halini alalim
     ornek: kartal da BUTUN HAYVANLAR GIBI HAREKET EDER,
     HEMDE BU HARAKETI  DAHA GUNCEL BILGI OLARAK UCAR OLARAK SOYLIYEBILIRIZ

     kartal da BUTUN HAYVANLAR GIBI HAREKET EDER,
     HEMDE BU HARAKETI  DAHA GUNCEL BILGI OLARAK ET YER OLARAK SOYLIYEBILIRIZ

     JAVA kullanicilarina
     objelerin iki sekilde de davranabilmesi icin
     bir opsiyon sunumustur

     EGER ozelliklerin 1.maddedeki gibi davranmasini istiyorsaniz
       ozellikleri veriable olarak olusturmalisiniz

     EGER ozelliklerin 2.maddedeki gibi davranmasini istiyorsaniz
       ozellikleri method olarak olusturmalisiniz
     */

    public String hareket =  "hareket ederler";
    public String solunum = "nefes alirlar";
    public String beslenme =  "beslenirler";
    public String cogalma = "cogalirlar";
    public String omur =  "yasar ve olurler";
}
