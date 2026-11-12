import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {

        // Creating HashSet
        LinkedHashSet<String> names = new LinkedHashSet<>();

        // Adding elements
        names.add("john");
        names.add("alice");
        names.add("david");
        names.add("robert");

        // Adding duplicate elements
        names.add("john");

        // Displaying set
        System.out.println("linkedHashSet: " + names);

        // Removing elements
        names.remove("david");

        // Checking element
        System.out.println("Contains alice: " + names.contains("alice"));

        // Checking size
        System.out.println("Size: " + names.size());

        // Checking whether set is empty
        System.out.println("isEmpty: " + names.isEmpty());
    }
}
