package day38_localDateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTimeMethodlari {
    public static void main(String[] args) {

        LocalTime yerelSaat = LocalTime.now(); // calisma sistemi verir
        System.out.println(yerelSaat); // 20:13:17.000174100

        LocalTime japonyaSaati = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(japonyaSaati); // 03:13:17.003273200

        LocalTime newYorkSaati = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYorkSaati); // 14:16:31.326201500

        // get....() methodlari

        System.out.println(yerelSaat.getHour()); // 20

        // with methodlari
        System.out.println(yerelSaat.withMinute(0)); // 20:00:28.268483400

        System.out.println(yerelSaat.withSecond(0).withNano(0)); // 20:22

        // plus.. () ve mines methodu
        System.out.println(yerelSaat.plusHours(100).plusMinutes(12)); // 00:37:02.684525300

        System.out.println(yerelSaat.isBefore(newYorkSaati)); // false


    }
}
