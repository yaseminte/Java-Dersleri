package day40_final;

public class A {

    String isim = "Cuneyt";
    final static String OKUL = "Yildiz Koleji";
    /*
    Bir variable final olarak tanimlandiysa
    baska class'lardan veya icinde oldugumuz class'tan
    bu variable'a baska deger atanmasi mumkun degildir.

    Mademki degeri degistirilemiyor
    genelde static de yaparak
    bu variable'a erisim kolaylastirilabilir
    ve genelde static final olarak belirlenen variable isimleri  BUYUK harfle yazilir

     */

    final void finalMethod() {
        System.out.println("final methodlar override edilemez");
        /*
        bir methd'u final olarak isaretlerseniz
        bu method degistirilmez demektir
        (override edilemez)
         */
    }


}
