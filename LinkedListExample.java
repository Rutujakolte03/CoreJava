import java.util.LinkedList;

public class LinkedListExample { // Renamed the class to avoid conflict
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        System.out.println(list); // Prints the list after adding 1 and 2
        list.add(5); // Adds 5 to the end of the list
        list.add(2, 3); // Inserts 3 at index 2
        System.out.println(list); // Prints the list after adding 5 and inserting 3 at index 2
    }
}
