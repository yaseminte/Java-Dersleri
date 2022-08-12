package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{

    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;



    protected void maasIsci(){
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai) + " maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        BMuhasebe isc1 = new DIsci();

        /*
        Bir obje olusturulurken
        Data turu ve constructor ayni class'tan ise
        direk o class'a gidiyorduk

        Eger data turu ve constructor farkli ise
        Obje constructor'in oldugu class'in objesidir
        ancak, bizden istenen
        Isci class'indaki spesifik ozellikler degil
        Bir iscinin muhasebe class'indaki
        tum calisanlarla beraber sahip oldugu
        genel ozellikleri yazdirir

         */

        System.out.println(isc1.gunlukMesai); // 8 Muhasebe class'indan
        System.out.println(isc1.saatUcreti); // 10 Muhasebe
        isc1.maas(); // Muhasebe -- Personel minimum : 2400 maas alir
        isc1.ozelSigorta(); // Muhasebe -- Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); // Personel -- Tum personelimize sigorta yapilir

        System.out.println(isc1.isim); // Personel -- isim belirtilmedi
        System.out.println(isc1.soyisim); // Personel -- Soyisim belirtilmedi
        System.out.println(isc1.departman); // Personel -- Departman belirtilmedi

        APersonel isc2 = new DIsci();


        //System.out.println(isc2.gunlukMesai);
        //System.out.println(isc2.saatUcreti);
        //isc2.ozelSigorta();
        isc2.maas(); //
        isc2.sigorta(); // Personel -- Tum personelimize sigorta yapilir

        System.out.println(isc2.isim); // Personel -- isim belirtilmedi
        System.out.println(isc2.soyisim); // Personel -- Soyisim belirtilmedi
        System.out.println(isc2.departman); // Personel -- Departman belirtilmedi

        /*
        Eger data turu olan class'ta aradigimiz ozellik varsa
        onun parent'ina gidebilir
        ama child'a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1 = new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 list gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */

    }

}
