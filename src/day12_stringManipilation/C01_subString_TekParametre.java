package day12_stringManipilation;

public class C01_subString_TekParametre {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(3));//a

        System.out.println(str.substring(3));//a Candir
        // 3. indextan baska sonuna kadar yazdir

        System.out.println(str.charAt(str.length() - 3));//d

        System.out.println(str.substring(str.length() - 3));//dir

        System.out.println(str.charAt(str.length() - 5));
        System.out.println(str.substring(str.length() - 5));// andir

        //str dan son 4 karakter yazdirin
        System.out.println(str.substring(str.length() - 4));// ndir


        // charAt () ve substring farkli davranabilir
        System.out.println(str.charAt(str.length() - 1));//r
        System.out.println(str.substring(str.length()-1));//r

        System.out.println(str.charAt(str.length() ));//
        System.out.println(str.substring(str.length()));//




    }
}
