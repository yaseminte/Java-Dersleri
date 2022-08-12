package day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{
   protected int saatUcreti = 12;
   protected int gunlukMesai = 9;



    protected void maas(){
        System.out.println("Memurlar : " + (30*saatUcreti*gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();

        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); // Memurlar : 3240 maas alir
        mmr1.ozelSigorta(); //Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); // Personel class'indan alir

        System.out.println(mmr1.isim); // Personel class'indan alir
        System.out.println(mmr1.soyisim); // Personel class'indan
        System.out.println(mmr1.departman); //Personel class

        BMuhasebe mhsb1 = new BMuhasebe();

        /*
        Her ne kadar memur class'inin icinde olsam da
        olusturdugum obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe

        String str = "Murat";
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer sayi =20;
        Bmuhasebe class'i da obje olusturulabilen

         */
        System.out.println(mhsb1.gunlukMesai); // 8 Muhasebe class'indan
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Muhasebe class_Personel minimum : 2400 maas alir
        mhsb1.ozelSigorta(); // Muhasebe-Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta(); // //Personel-Tum personelimize sigorta yapilir

        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departman); // Personel



    }

}