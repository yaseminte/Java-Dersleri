package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    // getter method'u da tek satirlik islem yapiyor
    // baska class'larin private oldugu icin erisemedigi
    // tasit turu bilgisini, class icinden alip
    // istenen farkli class'lara return ediyor

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }
    // return olmadigi icin bu method'un cagirildigi tasitRunner class'indan yazdirilamaz
    // burada bir satirlik islem yapiyor
    // bizim gonderdigimiz parametreyi instance variable

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    // boolean variable'lar icin olusturulan getter method'larinin
    // isVariableIsmi seklinde olur

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
