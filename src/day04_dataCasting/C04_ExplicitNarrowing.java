package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1 = 132;
        byte sayi2 = (byte) sayi1;

        System.out.println(sayi2); // -124

        /*
        Geniş data türündeki değeri dar data türündeki variable'a atamak isterseniz
        Java sizin geniş data türündeki değerin, dar data türünün sınırlarına uyup uymayacağını
        çalıştırana kadar bilemez
        Ama Java risk almaz
        Riski sıfıra indirmek için  urada bir sorun olursa sorumluluğu kabul etmenizi bekler
        Bunun için değerin önüne parantez içerisinde istediğimiz data türünü yazmamız yeterlidir.

        Bu riski üstlendiğimizde, 3 durum oluşabilir
        1- bizim değerimiz dar kalıp değerlerine uygun olursa hiçbir kayıp olmadan cast olur
        2- double bir sayıyı int'a cast etmek gibi durumlarda data kaybı yaşayabilirsiniz
        3- geniş kalıptan değeri dar kalıba koyduğunuzda sınırları aşan durumlarda
           veri başkalaşabilir.

         */


    }
}
