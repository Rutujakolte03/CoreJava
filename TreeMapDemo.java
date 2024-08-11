import java.util.TreeMap;
class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> demo = new TreeMap<>();
        demo.put("apple", 3);
        demo.put("banana" ,1);
        demo.put("cherry" , 2);
        System.out.println(demo);
    }
}