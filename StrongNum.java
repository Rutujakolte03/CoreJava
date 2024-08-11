//Q2. Write a java program to check whether the number is Strong number or not (Strong number is the number in which sum of the factorial of each number is same as the original number supppose 145 factorial of 1 is 1, 4 is 24, 5 is 120 addition of 1+24+120 is 145)
import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int rem = 0;
        int temp = num;
      
    while(num>=0) {
        rem=num%10;
        int fact = 1;
        while(rem>=1) {
            fact=fact*rem;
            rem--;
        }
        sum = sum+fact;
        num = num/10;

    }
    if(sum==temp) {
        System.out.println("The Number is Strong Number");
    }
    else {
        System.out.println("The Number is not Strong Number");
    }
}
}