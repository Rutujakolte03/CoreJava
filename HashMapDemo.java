import java.util.HashMap;
import java.util.Map;
class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map  = new HashMap<>();
        map.put("Ru", 1);
        map.put("Shraddha", 2);
        map.put("Shakila", 3);
        System.out.println("Size of the map: " + map.size()); 
        System.out.println(map);
        if (map.containsKey("Ru")) {
            Integer Ru = map.get("Ru");
            System.out.println("Value of Ru is: " + Ru);
        }
        for(String key: map.keySet()) {
            System.out.println("key: " + key);
        }
    }
}