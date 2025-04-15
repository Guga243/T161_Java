package day42_inheritance;

public class C01_KissadanHisseler {

    /*

    hayvanlar classindan cikardigimiz sonuclar

    1- baslangic itibari ile
    child classdeki her ir obje parent class dan tum ozellilere sahipdirler

    2- child classlar parent classdeki ozellikleri kendilerine uyarlayip daha
    guncel hale getirebilirler

    3- child classlar
    parent classda olmayan ama kendilerined ortak olarak bulunan yeni ozellikler ekleyebilirler


    bu ozellikler sonucunda
    parent class da daha genel ozellikler  bulunurlen
    child class da daha guncel ve daha fazla bilgi olabilir
     */

    /*
    marry den cikardigimiz sonuca gore

    1- bir objenin tarif edildii yere gore farkli isim veya sifatlari olabilir
    (anne, kiz cocugu hala yonetici vs..)

    2- bir obje aldigi farkli sifatlara gore farkli ozellikler (hak yetki sorumluluk)
    farkli ozellikler barindabilirler (method veriable vs)

     */

    /*
    hastane orneginden cikan sonuclar:

    1- ik ve muhasebe gibi parent classlar
    child classlarin ortak ozelliklerini tutmak icin tekrarlardan kacinmak icin olusturulur

    bu parent claslardan obje olusturulmaz
    objeler en altdeki child classlardan olusur
    (doktor, bashemsire, ervis hemsiresi vb)

    3- parent classlar guncel bilgiler tasimasada
    tum child classlari kapsarlar
    parent classlarda yapilacak degisiklikler butun child classlarida kapsarlar

    4- child classdeki bir obje ayni zamanda parent class'a da aitdir
    eger child classdeki bir obje
    parent class'la ilgili bir islem yapiyorsa
    child cladddeki ozellikleri bir taraf birakip parent classdeki tum objelerle ortak ozelliklerini
    kullanir

     */
}
