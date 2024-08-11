//Q1. Write a java program to check whether the number is Spy or not (Spy number is the number in which suppose 123 in that addition of 123 is 6 and multiplication of 123 is 6)

import java.util.Scanner;
public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int prod = 1;
        int rem = 0;
        while(num>0) {
            rem=num%10;
            sum=sum+rem;
            prod=prod*rem;
            num=num/10;
        }
        if (sum==prod)
        {
            System.out.println("The number is Spy");
        }
        else 
        {
            System.out.println("The number is not Spy");
        }
    }
}
