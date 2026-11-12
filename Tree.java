import java.util.TreeSet;

public class Tree{
    public static void main(String[] args) {

        // Creating HashSet
        TreeSet<Integer> marks = new TreeSet<>();

        // Adding elements
        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);
        marks.add(75);
        marks.add(80);
        System.out.println("Marks in ascending order: " + marks);

        // Displaying set
        System.out.println("TreeSet: " + marks);

        // Removing elements
        marks.remove(65);

        //display highestmarks
        System.out.println("Highest marks: " + marks.last());

        // Checking element
        System.out.println("Contains 90: " + marks.contains(90));

        // Checking size
        System.out.println("Unique marks count: " + marks.size());

        // Checking whether set is empty
        System.out.println("isEmpty: " + marks.isEmpty());
    }
}
