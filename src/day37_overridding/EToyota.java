package day37_overridding;

public class EToyota extends DAraba{


    @Override
    void marka() {
        System.out.println("Markamiz Toyota");
    }

    @Override
    void motor() {
        System.out.println("Toyota marka motor kullanir");
    }
}
