package day09_ternary_Switch;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin
        haftaici veya haftasonu oldugunu yazdirin
         */

        String input = "cumartesi";
        input = input.toLowerCase();

        switch (input){
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("Haftaici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Haftasonu");
                break;
            default :
                System.out.println("Lutfen gecerli bir gun giriniz");
        }

    }
}
