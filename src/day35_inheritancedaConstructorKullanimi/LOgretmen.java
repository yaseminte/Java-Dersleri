package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){

        System.out.println("LOgretmen parametresiz cons");
    }

    LOgretmen(String isim){
        this();
        System.out.println("Logretmen parametreli cons.");
    }
}
