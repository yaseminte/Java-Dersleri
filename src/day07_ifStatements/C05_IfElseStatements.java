package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz :");
        char harf = scan.next().toLowerCase().charAt(0);
        if ((harf>='a' && harf<='z')){
            System.out.println("Girilen karakter bir harf");
        }else
            System.out.println("Girilen karakter harf degil!");
    }
}
