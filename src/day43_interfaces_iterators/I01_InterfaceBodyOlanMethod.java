package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();

    public void yakit();

    public abstract String aku();

    /*
    normal bir class'da oldugumuzu dusunursek
    iki tane access modifier kullanma ihtimali OLAMAZ

    asagidaki method'da goreceginiz gibi
    interface'de istisnai olarak body'si olan method'lar olusturulabilir
    Bu ozellik Java 8'den sonra kullanilmaya baslamistir
    bu ozellikten once bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tum class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi

    bu ozellik sayesinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu method'un child class'lar tarafindan override edilme MECBURIYETI OLMAZ

    Bu istisnai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz

    Bu method'larin body'si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur.

    buradaki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir.

    O zaman nicin 2 keyword (static ve default) tanimlanmistir ?
    Bu iki farkli kelimenin amaci
    child class'lardan bu method'a nasil erisebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'tan bu method'a erismek icin
    interfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismke icin obbje olusturulmalidir.
     */

    public default void teker() {

        System.out.println("default....tum arabalarin tekeri vardir");
    }

    public static void direksiyon() {
        System.out.println("static....tum arabalarin direksiyonu vardir");
    }

}
