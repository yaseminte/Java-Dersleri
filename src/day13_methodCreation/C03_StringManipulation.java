package day13_methodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String str = "  Java ogrenmek123 Cok guzel@  ";

        str = str.trim();//Java ogrenmek123 Cok guzel@
        str = str.replaceAll("\\d", "");//Java ogrenmek Cok guzel@
        str = str.replaceAll("@", ".");//Java ogrenmek Cok guzel.
        str = str.replace("C", "c");//Java ogrenmek cok guzel.


        System.out.println(str.length());
        System.out.println(str);
    }
}
/*
String str = " Java ogrenmek123 Cok guzel@ ";
       str = str.replaceAll("\\d","") // " Java ogrenmek Cok guzel@ "
                .replace(" ","x")     // "xJavaxogrenmekxCokxguzel@x"
                .replaceAll("\\W","") // "xJavaxogrenmekxCokxguzelx"
                .replace("C","c")     // "xJavaxogrenmekxcokxguzelx"
                .replace("x"," ")     // " Java ogrenmek cok guzel "
                .trim();                              // "Java ogrenmek cok guzel"
System.out.println(str);
 */