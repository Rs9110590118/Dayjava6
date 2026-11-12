
import java.util.HashMap;

public class Hashmap2 {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "john");
        students.put(102, "alice");
        students.put(103, "david");
        students.put(104, "robert");
        students.put(105,"ruchi");

        // Displaying map
        System.out.println("HashMap: " + students);

        // Accessing values using key
        System.out.println("Student 101: " + students.get(102));

        // Updating value
        students.put(103, "pravalika");

        // Removing element
        students.remove(105);

        // Checking key
        System.out.println("Contains key 101: " + students.containsKey(101));

        // Checking value
        System.out.println("Contains value john: " + students.containsValue("john"));

        // Checking size
        System.out.println("Size: " + students.size());
        //display the values 
        System.out.println("display the id of students:"+students.keySet());
        //display the keys
        System.out.println("display the names of students:"+students.values());
    }
}