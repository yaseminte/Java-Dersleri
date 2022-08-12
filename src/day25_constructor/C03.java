package day25_constructor;

public class C03 {
    /*
    proje olustururken bazi class'lar run etmek icin degil
    variable ve method olusturup
    bunlari baska class'lardan kullanmak icin olusturulur
     */
    /*
    Default constructor, parametresizdir
    goremezsek bile ihtiyac oldugunda calisir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturursak
    Java default constructor'i siler
     */

    C03(){

    }

    /*
    Olusturdugumuz parametresiz bu constructor
    Default constructor ile bire bir aynidir
    ama biz olusturdugumuz icin buna
    default constructor demeyiz
    paramaetresiz constructor deriz
     */

    String isim = "Etka";

    public void method1(){

        System.out.println("C03 method calisti");
    }

}
