package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kulanicidan ismini isteyin, girilen ismi
        // isminiz : Mehmet  seklinde yazdirin

        // insanlarin dunyasindan kodlarimizin bulundugu class'a deger almak icin
        // Scanner class'ini kullaniriz

        // 1- Scanner objesi olusturalim
        Scanner scan = new Scanner(System.in);

        // 2- Kullaniciya ne istedigimizi soyleyelim
        System.out.print("Lutfen isminizi giriniz : ");

        // 3- Olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        // olusturacagimiz uygun bir variable'a atayalim
        String kullaniciIsmi = scan.nextLine();

        System.out.println("isminiz : " + kullaniciIsmi);
    }
}
