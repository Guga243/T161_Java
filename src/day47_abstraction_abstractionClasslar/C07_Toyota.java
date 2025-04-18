package day47_abstraction_abstractionClasslar;

public abstract class C07_Toyota extends C05_KuralciArabaClassi{

    /*
    abstract bir parentin abstract bir childi olabilir

    abstract child'in amaci parent dki genel kurallari
    kendi child'lari icin uyarlama veya kendi child'lari icin yeni kurallar koyma olabilir

    ornek: toyota clasi
    arac clasinda belirlenen genel kurallari tum toyata araclar icin
    uyarlayabilir veya tum toyota'larin sahip oldugu yeni kurallar
    ekleyebilir
     */

    public void motor(){
        System.out.println("Toyota araclar Toyota motor kullanir");
    }

    public void klima(){
        System.out.println("Toyota araclar cevreci klima kullanir");
    }

    public void marka(){
        System.out.println("toyota marka");
    }
    public abstract void guvenlikStandardi();
    public abstract void fren();
}
