package day09_ternary_Switch;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin
        // Sayi pozitif ise sayiyi yazdirin
        // Sayi 0 veya negatif ise bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        double sayi = scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
        }else {
            System.out.println("Lutfen bir sayi giriniz :");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi*sayi2);
        }

    }
}
