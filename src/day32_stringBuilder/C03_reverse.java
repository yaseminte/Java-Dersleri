package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {

        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun

        String input = "Hey gidi for loop gunleri";

        String tersInput = tersineCevirip(input);
        System.out.println(tersInput);

    }

    public static String tersineCevirip(String input) {

        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString();

    }
}
