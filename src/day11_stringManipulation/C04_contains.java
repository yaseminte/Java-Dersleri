package day11_stringManipulation;

public class C04_contains {
    public static void main(String[] args) {

        /*
        Soru
        2 Kullanicidan bir cumle isteyin Cumle “ kelimesi iceriyorsa tum
        cumleyi buyuk harf olarak,“ kelimesi iceriyorsa tum cumleyi kucuk harf olarak
        yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
        yazdirin
         */

        String cumle = "Java buyuk, dunya kucuk";
        // requirements'de buyuk harf kucuk harf hassasiyeti hakkinda bir sey soylememis
        // ikinci olarak da her iki kelimeyi de içerme durumu aciklanmamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim

        // ek requirements : ikisini de iceriyorsa "karar ver buyuk mu yazdirayim, kucuk mu?"
        // case sensitive olmasin

        if (cumle.contains("kucuk") && (cumle.contains("buyuk"))){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu?");
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }

    }
}
