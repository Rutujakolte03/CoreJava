import java.util.Scanner; 
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int reversedNum = 0; 
        int remainder = 0;
        int originalNum = num; //use to store the original or current number variable can be anything
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if(originalNum == reversedNum) {
            System.out.println(originalNum + "is Palindrome");
        }
        else {
            System.out.println(originalNum + "is not Palindrome");
        }
    }
}