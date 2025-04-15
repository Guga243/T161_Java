package day13_stringManipulation;

public class C04_LastIndexOf {
    public static void main(String[] args) {

        String str = "Hersey cok guzel olacak cok";

        System.out.println(str.indexOf("e"));// e'inin indexini yazdirir 1

        //2.e'inin indexini yazdirin
        System.out.println(str.indexOf('e',2));//4

        // cumlede kullanilan son a'nin son indexi
        // eger bir char veya metnin son kullanim indexini isterseniz
        // lastIndexOf kullaniriz
        System.out.println(str.lastIndexOf('a'));//21

        str="Java ile kod yaz, kod yazmak cok guzel";

        System.out.println(str.indexOf("Java"));//0
        System.out.println(str.lastIndexOf("Java"));//0

        System.out.println(str.indexOf("kod"));//9
        System.out.println(str.lastIndexOf("kod"));//18

        System.out.println(str.lastIndexOf('a',15));//14

        System.out.println(str.lastIndexOf('a',13));//3
    }
}
