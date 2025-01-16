public class Bike {
    Bike (int cost) {
        System.out.println("cost:" + cost);
    }
    public static void main(String[] args) {
        System.out.println("Start");
        Bike b1 = new Bike(10000000);
        System.out.println("End");
    }
}
