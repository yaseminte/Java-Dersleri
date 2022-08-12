package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini, soyismini ve yasini alip
        girilen bilgiler = Seyfi Capar 34 seklinde yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        /*
        String verileri scanner ile alirken
        next() : ilk bosluga kadar olan kismi (1 kelime) alir
        nextLine() : Satirin sonuna kadar ne yazarsak alir
        NOT: Eger ardarda birden fazla String deger alacksak nextLine() kullanmaliyiz
         */
        String isim=scan.nextLine();

        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyIsim=scan.nextLine();

        System.out.print("Lutfen yasinizi giriniz : ");
        double yas=scan.nextDouble();

        // girilen bilgiler = Seyfi Capar 34 seklinde yazdirin
        System.out.println("Girilen Bilgiler = " + isim + " "+soyIsim+" "+yas);
    }
}
