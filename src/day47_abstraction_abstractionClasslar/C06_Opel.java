package day47_abstraction_abstractionClasslar;

public class C06_Opel extends C05_KuralciArabaClassi{

    public void motor() {

    }

    public void teker() {

    }

    public void akku() {

    }

    public static void main(String[] args) {
        C06_Opel opel1 = new C06_Opel();
        opel1.akku();
        opel1.motor();
        opel1.teker();

        opel1.klima();
        opel1.sunroof();
    }
}
