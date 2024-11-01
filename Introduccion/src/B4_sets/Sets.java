package B4_sets;

import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        // conjunto.add("Carlos");
        conjunto.add("KArla");
        conjunto.add("Vicotoria");

        System.out.println("Elementos del set");
        conjunto.forEach(System.out::println);

        //Remover
        conjunto.remove("KArla");
        System.out.println("\nElementos nuevos del set");
        conjunto.forEach(System.out::println);

    }
}
