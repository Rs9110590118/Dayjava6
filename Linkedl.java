import java.util.LinkedList;
public class Linkedl{
    public static void main(String[]args){
        //creating linkedlist
        LinkedList<String>songs=new LinkedList();
        //adding elements
        songs.add("srivalli");
        songs.add("neno butterfly");
        songs.add("boss where is the party");
        songs.add("ranu bombay ki ranu");
        songs.add("deepali");
        //displaying list
        System.out.println("Linkedlist"+songs);
        System.out.println("First element:"+songs.get(0));
        System.out.println("Last element:"+songs.get(4));
        //removing an element
        songs.remove("deepali");
        //adding element at first position
        songs.addFirst("om namo venkatesha");
        //adding element in last position
        songs.addLast("nuvey naku lokam");
        //size of linkedlist
        System.out.println("size:"+songs.size());
    }
}