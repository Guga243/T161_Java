package day36_StaticBlocks_passByValue;

public class C01_staticBlocks {



    C01_staticBlocks(){
        System.out.println("construcktor calisti");
    }


    public static void main(String[] args) {

        System.out.println("mein method calisti"); //mein method calisti

        C01_staticBlocks obj = new C01_staticBlocks(); // construcktor calisti

        method(); // method calisti




    }


    public static void method(){
        System.out.println("method calisti");
    }

    static {
        System.out.println("static block calisti");

        // static blocklar clasdeki herseyden hatta main method'dan bile once calisir


    }
    static {
        System.out.println("asagdeki static bloc calisti");
    }



}
