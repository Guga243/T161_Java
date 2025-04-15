package Team01_Odevleri;

public class O01_Odev1 {
    public static void main(String[] args) {

       /* 2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

        Test Data:
        str1: Java is
        str2: fun

        Beklenen Çıktı:
        java is fun

        */

        String str1 = "Java is";
        String str2 = "fun";
        System.out.println(str1 +" "+ str2);



        int sum=0;

        for(int i=10; i>0; i=i-5) {

            sum=sum+i;

        }

        System.out.println(sum);

        int carpim = 1;

        for(int i=5; i>=0; i--){

            carpim = carpim * i;

        }

        System.out.println(carpim);




    }
}
