package day08_IfElseStatments;

import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class C05_ifElseSinifGecme {
    public static void main(String[] args) {
        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.
        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not = scann.nextDouble();

        if (not>=50){
            System.out.println("sinifi gectin dostum");
        }else {
            System.out.println("kaldin dostum");
        }
    }
}
