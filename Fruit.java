public class Fruit {
    double price = 200;
    void display() {
        double price = 300;
        System.out.println(price);
        System.out.println(this.price);

    }
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.display();
    }
}
