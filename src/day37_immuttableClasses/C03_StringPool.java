package day37_immuttableClasses;

public class C03_StringPool {
    public static void main(String[] args) {
        String str1 = "Ali"; //

        String str2 = "Ali"; //

        String str3 = new String("Ali"); //

        String str4 = "A" + "li"; //

        String s = "A"; //

        String t = "li"; //

        String str5 = s + t ; //

        String r = "ali"; //
        String str6 = r.substring(0,1).toUpperCase()+ r.substring(1); //
        // "Ali"


        System.out.println(str1 == str2); // Ali <==> Ali  ==> true
        System.out.println(str1 == str3); // Ali <==> Ali  ==> false
        System.out.println(str1 == str4); // Ali <==> Ali  ==> true
        System.out.println(str1 == str5); // Ali <==> Ali  ==> false
        System.out.println(str1 == str6); // Ali <==> Ali  ==> false
        System.out.println(str1 == "Ali"); // Ali <==> Ali  ==> true
        System.out.println(str2 == "Ali"); // Ali <==> Ali  ==> true
        System.out.println(str3 == str4); // Ali <==> Ali  ==> false
        System.out.println(str5 == str6); // Ali <==> Ali  ==> false
        System.out.println(str6 == str2); // Ali <==> Ali  ==> false

        System.out.println("===========");

        System.out.println(str1.equals(str2)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str6)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali  ==> true






    }
}
