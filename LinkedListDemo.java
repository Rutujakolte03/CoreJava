import java.util.LinkedList;

public class LinkedListDemo { 
    public static void main(String[] args) {
        String initialSize = "7";
      //  LinkedList<String> list = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
       
        list.add(1);
        list.add(2);
        list.add(5); 
        list.add(3, 3);
        list.addLast(4);
        list.addFirst(6);
        list.add(5, 10);
        System.out.println(list);
        
       /*  list.addFirst("Rutu");
        list.add(1, "Shweta");
        list.add("Vrushali");
        list.add("Shraddha");
        list.addLast("Sakshi");
        list.add("Sid");
      */
    //System.out.println(list);
}
}
