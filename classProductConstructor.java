import java.util.Scanner;
class Product {
    int Product_id;
    String Product_name;
    double Product_price;

    Product() {
        System.out.println("No-argument Constructor");
    }

    Product(int Product_id) {
        this();
        this.Product_id = Product_id;
        System.out.println("1FA Constructor");
    }

    Product(int Product_id, String Product_name) {
        this(Product_id);
        this.Product_name = Product_name;
        System.out.println("2FA Constructor");
    }

    Product(int Product_id, String Product_name, double Product_price) {
        this(Product_id, Product_name);
        this.Product_price = Product_price;
        System.out.println("3FA Constructor");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Product p1:");
        System.out.print("Enter Product ID: ");
        int Product_id1 = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Product Name: ");
        String Product_name1 = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double Product_price1 = sc.nextDouble();
        Product p1 = new Product(Product_id1, Product_name1, Product_price1);

        System.out.println("Enter details for Product p2:");
        System.out.print("Enter Product ID: ");
        int Product_id2 = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Product Name: ");
        String Product_name2 = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double Product_price2 = sc.nextDouble();
        Product p2 = new Product(Product_id2, Product_name2, Product_price2);

        System.out.println("Enter details for Product p3:");
        System.out.print("Enter Product ID: ");
        int Product_id3 = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Product Name: ");
        String Product_name3 = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double Product_price3 = sc.nextDouble();
        Product p3 = new Product(Product_id3, Product_name3, Product_price3);

        System.out.println("Enter details for Product p4:");
        System.out.print("Enter Product ID: ");
        int Product_id4 = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Product Name: ");
        String Product_name4 = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double Product_price4 = sc.nextDouble();
        Product p4 = new Product(Product_id4, Product_name4, Product_price4);

        System.out.println("Product_ID: " + p1.Product_id + ", Product_Name: " + p1.Product_name + ", Product_Price: " + p1.Product_price);
        System.out.println("Product_ID: " + p2.Product_id + ", Product_Name: " + p2.Product_name + ", Product_Price: " + p2.Product_price);
        System.out.println("Product_ID: " + p3.Product_id + ", Product_Name: " + p3.Product_name + ", Product_Price: " + p3.Product_price);
        System.out.println("Product_ID: " + p4.Product_id + ", Product_Name: " + p4.Product_name + ", Product_Price: " + p4.Product_price);
    }
}
