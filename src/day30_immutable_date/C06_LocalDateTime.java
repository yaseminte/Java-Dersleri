package day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat);//2022-07-23T19:40:47.460049700

        System.out.println( tarihSaat.plusMonths(3).plusHours(100)); // 2022-10-27T23:42:06.076644200

        System.out.println(tarihSaat.toLocalDate());//2022-07-23

    }
}
