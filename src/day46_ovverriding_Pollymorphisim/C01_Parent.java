package day46_ovverriding_Pollymorphisim;

public class C01_Parent {

    /*

    1- overridde icin methodlarin isim ve singaturleri ayni olmalidir

    2- static methodlarda overriding olmaz
     */

    public static void method1(){

    }

    private void method2(){
        // privite methodlarda overriding olmaz

    }
    public final void method3(){

    }
    // method signeture  = isim + parametrelerin data turu
    // access modifire method signuterine dahil degildir
    // ammaaaa overrriding de etkilidir

    // child classdeki methodun accsess modifire'i parent classdeki
    // accsess modifirenindan daha kisitlayci olmaz
    // child parenti kisitlayamaz
    // privite ==> defoult acc mod. ==> protected ==> public


    void method4(){

    }



   public void method5(){

    }

    // return type method signaturesine dahil degildir
    // ammaa overriding de return type da etkilidir

    //parent classdeki methodun return type'i
    // void veya primitive ise child classdeki method da ayni return typr
    // sahip olmalidir

    public int method6(){
        return 0;
    }




    public void method7(){

    }


    // parent classdeki method6 return type'i
    // non-primitive ise
    //  child classin method'da
    // ya ayni return type sahip olur
    // yada o clasin child classi olan bir return type sahip olur

    public Integer method8(){
        return 0;
    }




    public Object method9(){
        return null;
    }


    public void method10(){

    }
}
