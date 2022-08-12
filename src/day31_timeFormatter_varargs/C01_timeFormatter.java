package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_timeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);
        //ilk olusturulan tarih : 2022-07-25T21:40:31.419652900


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy  hh:mm");

        System.out.println(dtf.format(tarihSaat)); // 25/7/22  09:48

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyy  HH:mm");

        System.out.println(dtf2.format(tarihSaat)); // 25/Tem/2022  21:48


    }
}
