package day42_abstractClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {

    int SAYI = 30;
    String ISIM = "Yildiz Koleji";

    /*
    Interface bir class degildir

    Abstract class'lar java'da abstraction (Soyutlastirma / Kural Koyma)
    islevini yapiyordu
    Ancak abstract bir class'da abstract olmayan methodlar da olabilir
    bu da full abstraction yapmaya izin vermez

    Eger Java'da icinde hic concrete method olmasin
    dedigimiz bir class olusturmak istiyorsaniz
    bunu class degil Interface yapmalisiniz

    1- INTERFACELERDE CONCRETE METHOD OLMAZ
    2- Interface'ler full abstraction yaptigindan interface'lerden obje olusturulamaz

        Hatirladiginiz gibi interface olan List'ten direk obje olusturamıyorduk
        List<String> liste = new List<>(); ==> calismaz
        Bunun yerine constructor'i List'in child'i olan ArrayList'ten seceriz
        List<String> liste = new ArrayList<>();

    3- Class'larda bir child birden fazla parent edinemez
       Ancak interface'lerde concrete method olmadigindan
       biz her method'u child class'tan override etmek zorundayiz,
       override ederken kimin soyledigini override ettigimizin onemi yok

    4- Interfece'ler neyin yapilmasi gerektigini soyler
       ama nasil yapilacagina karismaz

     */


}
