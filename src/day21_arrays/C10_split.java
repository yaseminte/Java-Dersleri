package day21_arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() bir array method'u degil, String method'udur
        ama array dondurdugu icin bu konuda anlatiyoruz


        */

        String str = "Java, ne kadar guzel."; // spaceleri bulur isaretler, sonra onlari yok eder

        String [] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, guzel]

        String [] kelimelerNe = str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // [Java ,  kadar guzel]

        String [] kelimelerE = str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); // [Java n,  kadar guz, l]

        String [] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));


    }
}
