
import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {

        // Creating a HashMap
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        // Adding key-value pairs
        students.put(101, "john");
        students.put(102, "alice");
        students.put(103, "david");
        students.put(104, "robert");

        // Displaying map
        System.out.println("LinkedHashMap: " + students);

        // Accessing values using key
        System.out.println("Student 101: " + students.get(101));

        // Updating value
        students.put(102, "peter");

        // Removing element
        students.remove(103);

        // Checking key
        System.out.println("Contains key 101: " + students.containsKey(101));

        // Checking value
        System.out.println("Contains value john: " + students.containsValue("john"));

        // Checking size
        System.out.println("Size: " + students.size());
    }
}
