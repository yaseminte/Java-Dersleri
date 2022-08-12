package day45_collections;

import java.util.*;

public class C02_CollectionsDataTuru {

    public static void main(String[] args) {

        /*
        Collections <dataTuru> nu object seçmeniz durumunda
        Collection'a farklı data turlerinden objeler koymanıza izin verir
        Bu depolama açısından bize esneklik sağlar
        Ancak işlem yaparken tüm objeleri Object olarak tanımladığımızdan
        çok fazla casting yapmamız gerekebilir
         */

        List<String> liste = new ArrayList();
        // liste.add(5);
        // liste.add('s');
        // liste.add(true);

        List<Object> list = new ArrayList();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println(list);

        list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(3)+" Can");
        System.out.println(list);

        System.out.println(list);

        Set<Object> set1 = new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');




    }
}
