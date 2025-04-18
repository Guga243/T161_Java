package day47_abstraction_abstractionClasslar;

public abstract class C05_KuralciArabaClassi {

    //  araba classini inherit edecek child class'lar
    // yeni araba uretecek markalar
    // arabalarin mutlaka bulundurmasi gereken ozellikleri
    // bu class da belirleyebilriz

    public abstract void motor();
    public abstract void teker();
    public abstract void akku();

    // arabalarin bulundurmasi zorunlu olmayan
    // yani arabalarin tercihine birakilan
    // ozellikleri siradan bildigimiz (concrite method) olusturabilriiz

    public void klima(){
        System.out.println("araba klimali");

    }
    public void sunroof(){
        System.out.println("araba sunrooflu");
    }
}
