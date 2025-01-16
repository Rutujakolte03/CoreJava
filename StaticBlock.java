import java.util.Scanner;

public class StaticBlock {
    
    // Static variables
    static int B, H;

    static {
        // Initialize static variables in the static block
        B = 10;
        H = 10;
        System.out.println("Static block initialized with default values of B and H: " + B + " and " + H);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting user input for Breadth (B) and Height (H)
        System.out.print("Enter the Breadth of the Parallelogram: ");
        B = sc.nextInt();
        System.out.print("Enter the Height of the Parallelogram: ");
        H = sc.nextInt();

        // Display the values of Breadth and Height
        System.out.println("Breadth of the Parallelogram: " + B);
        System.out.println("Height of the Parallelogram: " + H);

        // Calculate and display the area if both values are positive
        if (B >= 0 && H >= 0) {
            System.out.println("Area of the Parallelogram: " + (B * H));
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        sc.close();
    }
}
