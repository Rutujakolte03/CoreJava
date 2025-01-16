import java.util.HashMap;
import java.util.Map;

public class MapEntryDemo {
    public static void main(String[] args) {
        // Create a HashMap instance
        Map<String, Integer> map = new HashMap<>();
        
        // Adding entries to the map
        map.put("a", 1);
        map.put("b", 2);

        // Printing the size of the map and the map itself
        System.out.println(map.size()); // Prints the size of the map (2)
        System.out.println(map); // Prints the map content
    }
}
