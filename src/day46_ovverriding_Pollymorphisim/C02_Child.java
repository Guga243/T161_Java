package day46_ovverriding_Pollymorphisim;

import java.util.List;

public class C02_Child extends C01_Parent{








    public static void method1(){

    }

    public void method2(){

    }

    public  void method3_(){
        // final keyword nerede kullanilirsa kullanilirsin
        // son degeri bu, bunu degistiremezsiniz demektir
        // method degistirmek overridding ile memnun oldugundan
        // final keyword'e sahip methodlar methodlar
        // verriddine edilemez

    }





  protected   void method4(){
        // parent classdeki method4 defoult acc modifire sahip
        // oldugundan child classin acc modifire'i
        // aynisi veya prootected yada puvlic olabilir

    }
   public void method5(){
        // parent classdeki method5 public acc modifire sahip
        // oldugundan child classin acc modifire'i
        // sadece puvlic olabilir
    }








    public int method6(){
        // parent classdeki method6 return type'i int
        // oldugundan child classin acc modifire'i
        // sadece int olabilir
        return 10;
    }
    public void method7(){
        // parent classdeki method7 return type'i void
        // oldugundan child classin acc modifire'i
        // sadece void olabilir
    }

    public Integer method8(){
        // parent classdeki method8'in return type'i Integer
        // oldugundan child classin methodun return type'i
        // Intiger veya Integer'in child'i bir class olabilir
        return 0;
    }

    public List<String> method9(){
        // parent classdeki method8'in return type'i Objekt
        // oldugundan child classin methodun return type'i
        //  Objekt veya Objekt'in child'i String Intiger List<> Short..
        //  olabilir
        return null;
    }
    @Override
    public void method10() {

        super.method10();
        // hem overriden hemde overdiing birlikte calismasini istersek
        // child classdeki methoda super. method ismi yazabiliriz
        // daha guncel oldugu icin child calisir child dekide parenti calistir
           
    }
}
