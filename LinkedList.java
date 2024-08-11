import java.util.LinkedList;

public class LinkedList { 
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.add(5); // Adds 5 to the end of the list
        list.add(2, 3); // Inserts 3 at index 2
        System.out.println(list);
    }
}
