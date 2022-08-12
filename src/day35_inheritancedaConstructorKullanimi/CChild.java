package day35_inheritancedaConstructorKullanimi;

public class CChild extends BParent {

    String isim = "Chil isim belirtilmedi";
    protected String childKulupAdi = "Child Kulubu";
    CChild(){
        System.out.println("Child constructor calisti");
    }

    public static <Child> void main(String[] args) {

        AGrandParent gp1 = new AGrandParent();
        // bu objeyi olusturmak icin Grandpa cons. calisir
        // Parent veya Child Cons calismaz

        CChild child1 = new CChild();
        child1.grandPaKulupAdi = "Child1";
        child1.parentKulupAdi = "Child2";

        // child1 objesi icin Child constructor calisir
        /*
        Java'da bir class'i kullanabilmek icin
        o class'dan obje olusturur, dolayisiyla o class'in constructor'ini kullanirdik

        Java inheritance'da parent class'lardaki
        ozellikleri kullanabilmek icin o class'larin constructor'larini
        otomatik calistiran bir yapi kurmustur

        Ornegin biz child class'inda
        Child class'indan bir obje olusturmak istedigimizde
        Child cons. ini kullaniriz

        Java Child(){} gordugunde
        once parent'in constructor'ini calistirmam lazim der
        buradan Parent cons'a gider
        Parent class'inda Parent(){} gorunce
        once bunun parent'inin yani GrandParent cons. calismasi gerekir der
        Boylece extends keyword olmayan class'a kadar gider
        ve oradan baslayarak tum constructorlari
        asagi dogru calistirir
         */
    }
}
