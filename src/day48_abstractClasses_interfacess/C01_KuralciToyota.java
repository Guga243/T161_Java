package day48_abstractClasses_interfacess;

public abstract class C01_KuralciToyota {

    // oncelikle child claass'larin kendisine uyarlamasi gereken methodlari yazalim

    public abstract void motor();
    // abstract methodlar clasik methoddan ziyade standartlari belirleyen bir cumle gibi
    // her child class motor() bulundurmak zorundadir.

    public abstract void teker();

    // child classlarinmecbur bulundurmasi gerekmeyen concrete methodlar (abstract olmayan)

    public void sunroof(){
        System.out.println("toyota araclarinda sunroof opsiyoneldir");

    }

    public void xeonFar(){
        System.out.println("toyota araclarinda xeonFar opsiyoneldir");
    }

}
