package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        Java'da olusturdugumuz method'larin isminin yaptigimiz isler ile uyumlu olmasini isteriz
        mesela bir String'in bir bolumunu almak icin Java
        2 adet substring() method'u veya
        Verilen String'deki bazi parcalari yenileriyle degistirmek icin
        2 adet replace() method'u var

        Java ayni isimde birden fazla method method varsa
        hangisinin kullanilacagina parametre sayisi ve
        parametrelerin data turune gore karar verir.
         */

        String str = "Bu JAva ogrenilecek, baska yolu yok";
        str.substring(2);
        str.replace('c', 'v');
        str.replace("J", "H");
        //str.replace(5,8);

        /*
        Ayni isimde ama farkli method'lari olusturmak icin
            degistirebilecegimiz seyler
            1- parametre sayisi
            2- ayni sayida parametreye sahip olsa bile, parametrelerin data turlerini degistirebiliriz
            3- ayni sayida ve ayni data turlerinde parametreleri olan methodlarda
               parametrelerin siralanisi

         */

    }
}
