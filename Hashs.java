
import java.util.HashSet;

public class Hashs {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<String> employee = new HashSet<>();

        // Adding elements
        employee.add(101,"r");
        employee.add(102,"u");
        employee.add(103,"c");
        employee.add(104,"h");
        employee.add(105,"i");
        employee.add(106,"t");
        employee.add(107,"h");
        employee.add(108,"a");
        employee.add(109,"s");
        employee.add(110,"r");

        // Adding duplicate element
        employee.add("r");

        // Displaying set
        System.out.println("HashSet: " + employee);

        // Removing elements
        employee.remove("c");

        // Checking element
        System.out.println("Contains i: " + employee.contains("i"));

        // Checking size
        System.out.println("Size: " + employee.size());

        // Checking whether set is empty
        System.out.println("isEmpty: " + employee.isEmpty());
    }
}

