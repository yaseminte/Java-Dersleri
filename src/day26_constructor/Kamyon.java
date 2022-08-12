package day26_constructor;

public class Kamyon {
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(String marka, String model, int yil, int fiyat) {

        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

        /*
        Bizim temel amacımız KamyonRunner'dan argument olarak girilen degerin
        Kamyon class'inda instance variable'a atanmasi
        Ancak scope konusunda ogrendigimiz gibi
        Kamyon Constructor scope'unda marka oldugu icin
        instance markaya gitmiyor

        Bu karisikligi gidermek icin instance variable'lari
        belirli hale getirmemiz lazim
        Java bunun icin this keyword'u olusturmustur

        Genel kullanim acisindan this keywordu kodu herkesin anlamasini
        kolaylastirdigi icin tercih edilir.
         */

    }

    Kamyon(){

    }

    @Override
    public String toString() {
        return
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat;
    }
}
