package day16_NestedForLoop;

public class C04_nestedForLoop {
    public static void main(String[] args) {
        // bir for loop ile 1 2 3 4 yazdirirn

        for (int i = 1; i <=4; i++) {
            System.out.print(i+" ");

        }

        System.out.println("      ");

        // ayni loopu lullanarak 2 4 6 8 yazdirin

        for (int i = 1; i <=4; i++) {
            System.out.print(2*i+" ");

        }
        System.out.println("  ");
        for (int i = 1; i <=4; i++) {
            System.out.print(3*i+" ");

        }
        System.out.println("  ");

        // ayni loopu kullanarak 4 8 12 16

        for (int i = 1; i <=4; i++) {
            System.out.print(4*i+" ");

        }

        /*'
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16

        eger farkli satirlar ve her satirda esit miktarda eleman yazdirlacaksa
        ic ice nested looplar kullanabiliriz

        eger olusturulacak sekil diktortgen sekilindeyse diardeki loop ile kac satir olacagini
        icerdeki loop ile her satirda kac eleman olacagini blirleriz


         */

        for (int i = 1; i <=4; i++) { // outer loop , kac satir olacagini belirler
            for (int j = 1; j <=4; j++) { //inner loop, her satirda kac eleman olacagini blirler
                System.out.print(i*j+ " ");

            }
            System.out.println();
        }

    }
}
