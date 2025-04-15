package day13_stringManipulation;

public class C08_replace {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.replace('a', 'A'));//JAvA CAndir
        System.out.println(str.replace('J','H'));//Hava Candir

        System.out.println(str.replace("Java","Tava"));//Tava Candir

        System.out.println(str.replace("a",""));//Jv Cndir

    }
}
