package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        isimlerini yazdirin
        Ornek:
        ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        ilkHarf=S output = “Sali”
        *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir gun ismi giriniz : ");
        String girilenGun= scan.next().toLowerCase();

        // Pazar, pazar, PAZAR, PaZar, PAzar ??? bilemeyiz,
        // pazar, pazar, pazar, pazar

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){

            System.out.println("Girilen gun HAFTASONU ");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
            || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
            || girilenGun.equals("cuma")){

            System.out.println("Girilen gun HAFTAICI");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma") || girilenGun.equals("pazar")
                || girilenGun.equals("cumartesi"))){

            System.out.println("Lutfen gecerli bir gun ismi giriniz!");
        }


    }
}
