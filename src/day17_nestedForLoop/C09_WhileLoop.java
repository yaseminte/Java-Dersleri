package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
          /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

         */

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;

        while (!sifreBasariliMi) {
            // kullanicidan bir sifre alalim
            System.out.print("Lutfen bir sifre giriniz : ");
            sifre = scan.nextLine();
            // 4 kontrolu yapalim, her gecen kontrol icin kontrol variable'ini 1 artiralim
            //ilk harf kontrolü
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("ilk harf buyuk harf olmali");
            }
            //son harf kontrolü
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("son harf kucuk harf olmali");
            }
            // bosluk kontrolu
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol++;
            }
            // sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre uzunlugu en az 8 karakter olmali");
            }
            if (kontrol == 4) { // tum kontrollerden gecmis
                System.out.println("sifreniz basari ile tanimlandi");
                sifreBasariliMi = true;
            } else { // sifre basarisiz
                     // tekrar basa donecek
                     // kontrol variable sifirlanmali

                kontrol=0;

            }
        }
    }
}
