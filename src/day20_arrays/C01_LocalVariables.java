package day20_arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {

        int sayi =10;
       // System.out.println(sayiMethod); // sayiMethod method1'de olusturulmustur local variable'dir

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        // System.out.println(i); i loop'da olusturulmus local variable'dir
        // sadece loop icerisinde kullanilabilir


        // static int sayiStatic=20; static keyword sadece class level'da kullanilabilir
        // method'larin icerisinde static

    }

    public static void method1(){

        // System.out.println(sayi); sayi main method'da olusturulmus local bir variable'dir
        // ve sadece main method'da gecerlidir

        int sayiMethod = 20;
    }

}
