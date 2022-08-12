package day08_IfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // 50'ye esit veya buyuk 60'dan kucukse “C”,
        // 60'a esit veya 80'den kucukse “B”,
        // 80'e esit veya uzerinde ise “A”
        // gecersiz not girildiginde uyari verelim

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 0'dan 100'e kadar bir not degeri giriniz : ");
        double note = scan.nextDouble();

        if (note<0 || note>100){
            System.out.println("Lutfen gecerli bir not giriniz!");
        } else if (note<50) {// bu satira geldiysek notumuz 0 ile 100 arasindadir
            System.out.println("Notunuz : D");
        }else if (note<60){ // bu satira geldiysek notumuz 50 ile 100 arasindadir
            System.out.println("Notunuz : C");
        }else if (note<80){ // bu satira geldiysek notumuz 60 ile 100 arasindadir
            System.out.println("Notunuz : B");
        }else {
            System.out.println("Notunuz : A");
        }
    }
}
