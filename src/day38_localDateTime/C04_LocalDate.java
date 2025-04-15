package day38_localDateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2025-04-04

        LocalDate tarihNewYork = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println(tarihNewYork);

        LocalDate dogumTarihi = LocalDate.of(1998,03,12);
        System.out.println(dogumTarihi);

    }
}
