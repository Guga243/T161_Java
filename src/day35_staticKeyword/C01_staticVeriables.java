package day35_staticKeyword;

import day34_constructorCall.C02_Hastane;

public class C01_staticVeriables {

    public static void main(String[] args) {
        // static veriable'lar class veriable'lari olarak da adlandirilir
        // baska class'lardan kullanilirken
        // classIsmi ile kullanilabilir

        System.out.println(C02_Hastane.hastaneIsmi);
        C02_Hastane.bashekim ="Dr.Guga";

        //instance veriableler objeye bagli o yuzden class ismi ile degil
        // obje ismi ile cagirilir

        C02_Hastane per1 = new C02_Hastane();
        System.out.println(per1.persIsmi);
        per1.persIsmi ="Hugo";

        C02_Hastane per2 = new C02_Hastane();
        per2.persAdresi ="Bremen";



    }
}
