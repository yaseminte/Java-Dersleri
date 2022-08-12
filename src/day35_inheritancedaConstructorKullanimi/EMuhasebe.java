package day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel {

    public EMuhasebe() {

        System.out.println("Parametresiz EMuhasebe cons");
    }
    public  EMuhasebe(String isim){

        System.out.println("Parametreli EMuhasebe cons");
    }
}
