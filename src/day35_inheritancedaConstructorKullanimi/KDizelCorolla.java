package day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{

    KDizelCorolla(){

        System.out.println("KDizelCorola parametresiz cons");
    }
    KDizelCorolla(String isim){
        super(isim);
        System.out.println("KDizelCorolla parametreli cons");

    }

    public static void main(String[] args) {

        KDizelCorolla obj1=new KDizelCorolla("Hasan");
    }
}
