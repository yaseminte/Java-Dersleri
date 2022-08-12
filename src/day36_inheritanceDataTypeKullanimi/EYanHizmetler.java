package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe{

    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;



    protected void maas(){
        System.out.println("Yan Hizmetliler : " + (30*saatUcreti*gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {

        /*
        Overriding child class'daki bir method'un
        parent class'daki ayni isimdeki method'u
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir

        Overriding'i nerede dikkate aliyoruz?

        eger bir obje olusturulurken
        data turu ve constructor farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz

        1- Obje constructor'in oldugu class'da olusur
        2- Objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
           orada da bulamazsak CTE verir.

        3- eger aranan ozellik variable ise overridding ihtimali olmadigi icin
           buldugumuz ilk degeri yazdiririz

           aranan ozellik method ise
           degeri yazdirmadan once override edilmis mi diye kontrol etmemiz gerekir
           eger override edildiyse en guncel degeri yazdiririz
         */

        BMuhasebe yh1 = new EYanHizmetler();

        System.out.println(yh1.gunlukMesai); // 8 Variable old.icin Muhasebe class'indan alir
        System.out.println(yh1.saatUcreti); // 10 Muhasebe
        yh1.maas(); // Kendi class'inde override edilmis YanHizmetler class'indaki method calisir
        yh1.ozelSigorta(); // Muhasebe class'inda method var kendi methodunda o method yok Muhasebe class'dan alir
        yh1.sigorta(); // Personel -- Once Data turune gore belirlenen classa ve yoksa parent'ina bakar
        // Sonra kendi class'inda override edilip edilmedigine bakar ona gore parenttaki method calisir

        System.out.println(yh1.isim); // Personel
        System.out.println(yh1.soyisim); // Personel
        System.out.println(yh1.departman); // Personel
        // System.out.println(yh1.issizlikSigorta); ==> Bulamadigi icin override edemez
        // Aramaya muhasebeden basladigimizdan
        // issizlik sigortasi bulamadik CTE



    }


}
