import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>(3); 
        list.add("Rutu");
        list.add(1, 2);
        list.add(9);
        System.out.println(list);
        list.remove("Rutu");
        System.out.println(list);
    }
}
