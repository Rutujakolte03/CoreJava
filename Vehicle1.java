public class Vehicle1 {
    // Constructors
    Vehicle1(String brand, int cost) {
        System.out.println("Brand: " + brand + " Cost: " + cost);
    }

    Vehicle1(String brand) {
        System.out.println("Brand: " + brand);
    }

    Vehicle1() {
        System.out.println("No Argument Constructor");
    }

    Vehicle1(String brand, String fuel) {
        System.out.println("Brand: " + brand + " Fuel: " + fuel);
    }

    Vehicle1(int cost, String brand) {
        System.out.println("Cost: " + cost + " Brand: " + brand);
    }

    public static void main(String[] args) {
        // Correct object creations
        Vehicle1 v1 = new Vehicle1("BMW");
        Vehicle1 v2 = new Vehicle1("Audi", 45000); // Correct constructor exists now
        new Vehicle1(8999, "Suzuki");
        new Vehicle1("Honda", "Petrol");
        new Vehicle1(); // Calling no-argument constructor 
    }
}
