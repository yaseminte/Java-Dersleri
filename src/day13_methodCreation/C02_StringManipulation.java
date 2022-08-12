package day13_methodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        /*
         Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sifre giriniz : ");
        String sifre = scan.nextLine();
        int kontrol = 0;

        //ilk harf kontrolü
        if (sifre.charAt(0)>= 'A' && sifre.charAt(0)<='Z') {
            kontrol++;
        }else {
            System.out.println("ilk harf buyuk harf olmali");
        }
        //son harf kontrolü
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') {
            kontrol++;
        }else {
            System.out.println("son harf kucuk harf olmali");
        }
        // bosluk kontrolu
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else {
            kontrol++;
        }
        // sifre uzunluk kontrolu
        if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("Sifre uzunlugu en az 8 karakter olmali");
        }

        if (kontrol==4){
            System.out.println("sifreniz basari ile tanimlandi");
        }else
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
    }
}
