package day_BilmemKac;

public class deneme01 {
    public static void main(String[] args) {
        String a ="hallo";
        String b="";

        try {
            int c= a.length()+b.length();
            throw new RuntimeException();

        } catch (NullPointerException e) {
            System.out.println("nul pointer uzunlugu olmaz");

        } catch (RuntimeException e) {
            System.out.println("throw keyword");
        }



    }
}
