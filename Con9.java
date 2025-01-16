public class Con9 {
    public static void main(String[] args) {
        int a = 20;
        switch (a % 5) {
            case 1: 
                System.out.println("The number is divisible by 5");
                break;
            case 2: 
                System.out.println("The number is not divisible by 5");
                break;
            default:
                System.out.println("Invalid case");
        }
    }
}
