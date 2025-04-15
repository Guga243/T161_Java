package day39_varargs_stringBuilder;

public class C04_VarargsDikkatEdilecekler {
    public static void main(String[] args) {


        islemYap(); // verilen argumentler islem icin yeterli degil

        islemYap(2); // verilen argumentler islem icin yeterli degil

        islemYap(1,2,3); // islem sonucu : 3

        islemYap(1,2,3,4,5,6,7); // islem sonucu : 21

        //  Kac tane argument yazarsak yazalim
        //  son argument haric geriye kalanlari toplayip
        //  bulunan toplam ile ilk argumanin carpimini yazdiran bir method olusturun


    }
    /*
    public static void islemYap(int...bastekiSayilar, int sonSayi) {
        int toplam = 0;

        varargs devreye girdikten sonra tum argumentleri almak ister
        bu sebeple varargs da dikkat etmemiz gereken en onemli sey varargs
        bir method da parametre olarak varargs varsa
        en sonda olmalidir

        bu kurala gore dusunursek
        bir methodda birden fazla varargs parametre olmaz
     */

    // bu soruyu varargs ile cozmek icin tum argumeti varargs a alip son elementi varargs icinden secebiliriz

    public static void islemYap(int... tumArgumentler){
        int toplam =0;
        int sonEleman=0;

        if (tumArgumentler.length <2){
            System.out.println("verilen argumentler islem icin yeterli degil");
        }else {
            sonEleman = tumArgumentler [tumArgumentler.length-1];


            for (int i = 0; i < tumArgumentler.length-1 ; i++) {

                toplam+=tumArgumentler[i];




            }
            System.out.println("islem sonucu : "+toplam*sonEleman);

        }
    }
}
