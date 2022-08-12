package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    /*
    Her class'da gorunmese bile bir constructor vardir
    Bu class'dan obje olusturmak istedigimizde
    default constructor devreye girecektir.

    Default constructor'i gozlemleyemeyecegimiz icin
    onun yerine kullanabilecek parametresiz constructor olusturalim
     */

    protected String grandPaKulupAdi = "Grandpa Kulubu";

    AGrandParent (){

        System.out.println("Grandpa constructor calisti");
    }


}
