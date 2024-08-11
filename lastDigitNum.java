import java.util.Scanner;

class RemoveLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int Number = num % 10;
        System.out.println("Number last digit: " + Number);
    }
}
