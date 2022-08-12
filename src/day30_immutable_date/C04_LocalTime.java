package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 19:12:23.678574400
        /*
        Bizim olusturdugumuz date ve time
        canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satirda
        o anki tarih veya saati alip
        bizim variable'imiza store eder.
        time1 variable'inin degeri SABITTIR
         */

        //kodu uykuya alma methodu Thread istedigimiz sure kadar sonra calisiyor
        Thread.sleep(3000); // 3 sn sonra

        time1 = LocalTime.now();

        System.out.println(time1);

        System.out.println(time1.getSecond()); //33

        System.out.println(time1.plusSeconds(10000)); // 22:19:13.616916800

        System.out.println(time1.minusMinutes(200)); //16:13:47.436715600

        System.out.println(time1.withHour(3)); // saati 3 yapip yazdirdi
    }
}
