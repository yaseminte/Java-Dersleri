package day33_encapsulation;

public class Araba {

    String marka = "marka belirtilmedi"; // marka'nin access modifie'i default access modifier
                                         // oldugundan, package icerisinde kullanilabilir
    private String model = "model belirtilmedi";
    private String yakit = "Elektrikli"; // tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor(getter)
    // bunun icin

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
