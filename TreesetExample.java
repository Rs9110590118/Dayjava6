import java.util.TreeSet;

public class TreesetExample {
    public static void main(String[] args) {

        // Creating HashSet
        TreeSet<String> names = new TreeSet<>();

        // Adding elements
        names.add("john");
        names.add("alice");
        names.add("david");
        names.add("robert");

        // Adding duplicate elements
        names.add("john");

        // Displaying set
        System.out.println("TreeSet: " + names);

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
