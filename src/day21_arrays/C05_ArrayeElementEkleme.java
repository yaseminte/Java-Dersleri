package day21_arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

        // Soru 5- Verilen bir array’e yeni bir element ekleyen bir method olusturun

        String [] sinifListesi = {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim = "Murat Babayiğit";

        sinifListesi = elemanEkle(sinifListesi,eklenecekIsim);

        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String [] yeniSinifListesi = new String[sinifListesi.length+1]; // [null, null]
        // Eski listeden 1 element fazla uzunlukta yeni bir array olusturdum

        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i]= sinifListesi[i];
        }
        // oncelikle eski listedeki elemanlari yeni listeye tasidim

        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        // son index'e ise eklenecek ismi atadim


        return yeniSinifListesi;
    }
}
