package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        // Dar veri türündeki bir değeri geniş veri türündeki variable'a otomatik olarka assign eder.

        byte sayi1 = 23;
        short sayi2 = 55;

        int sayi3 = sayi1 + sayi2; // 78

        double sayi4 = sayi1*sayi2; // 1265

        sayi4 = (double) sayi2/sayi1; // 53.0 / 23 = 2.391
                                      // (sayi2/sayi1) bu kısmı parantez içine alma
                                      // Java önce işlemi yaptığı için sonuç tamsayı olur

        System.out.println(sayi4); // 2.391304347826087





    }
}
