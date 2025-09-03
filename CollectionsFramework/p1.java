package CollectionsFramework;

import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {
        // Create a collection (ArrayList)
        ArrayList<String> names = new ArrayList<>();

        // insertion
        names.add("BoB");
        names.add("kilo Sepc");
        for (String i : names) {
            System.out.print(i + ' ');
        }
        // manipulation
        names.set(1, "bravo"); // replace kilo spec with bravo
        for (String i : names) {
            System.out.print(i + ' ');
        }
        // searching

        boolean hascharlie = names.contains("Charlie");
        System.out.println("\nis charlie there in the list ? " + hascharlie);

        boolean hasBravo = names.contains("bravo");
        System.out.println("is bravo there in the list ? " + hasBravo);

        System.out.println(names);
    }
}
