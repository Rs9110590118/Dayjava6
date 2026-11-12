import java.util.LinkedList;
public class Linkedlist{
    public static void main(String[]args){
        //creating linkedlist
        LinkedList<String>names=new LinkedList();
        //adding elements
        names.add("john");
        names.add("alice");
        names.add("david");
        names.add("robert");
        //displaying list
        System.out.println("Linkedlist"+names);
        System.out.println("First element:"+names.get(0));
        //updating element
        names.set(1,"peter");
        //removind element
        names.remove("david");
        //updating ana element
        names.set(1,"peter");
        //removing an element
        names.remove("david");
        //adding element at first position
        names.addFirst("sam");
        //adding element in last position
        names.addLast("tom");
        //size of linkedlist
        System.out.println("size:"+names.size());
    }
}