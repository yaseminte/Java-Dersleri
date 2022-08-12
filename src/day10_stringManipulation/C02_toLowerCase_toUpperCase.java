package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Beni psikopata baglamayin";

        System.out.println(str.toUpperCase()); // BENİ PSİKOPATA BAGLAMAYİN
        /*
        BENI PSIKOPATA BAGLAMAYIN ==> ingilizce klavyede bu şekilde çıkıyor
         */

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // // BENİ PSİKOPATA BAGLAMAYİN
        /*
        Eger buyuk kucuk harf donusumunda local bir dili almak isterseniz
        bu method kullanilabilir

         */
    }
}
