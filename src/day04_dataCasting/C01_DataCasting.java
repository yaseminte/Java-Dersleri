package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf = 'a';
        char yeniHarf = (char) (harf + 1); // kod bu durumda önce sağdaki işlemi yapar
                                           // char yeniHArf = 97 + 1 --> 98
                                           // char bir variable 98 olamayacagi icin Java hata verir.
        System.out.println(yeniHarf);

        /*
        Bazen bir variable'a oluşturulduğu data türü dışından değer atanabilir
        Bunlardan bazısını otomatik olarak kabul eder

        Java eğer bu değer atamasında sorun oluşacağını
        (data kayıpların olabileceği veya datanın başkalaşabileceği) görürse
        bu durumda otomatik olarak bu atamayı kabul etmez
        sizden eğer bu atamayı istiyorsanız sorumluluğu almanızı bekler
         */

        int sayi1 = (int) 7.3;
        System.out.println("sayi1 = " + sayi1); // 7

        double sayi2 = 10;
        System.out.println("sayi2 = " + sayi2); // 10.0

        int sayi3 = 'c';
        System.out.println("sayi3 = " + sayi3); // 99

        char harf2 = 98;
        System.out.println("harf2 = " + harf2); // b


    }
}
