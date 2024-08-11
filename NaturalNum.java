import java.util.Scanner; 
class Number {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the starting range");
  int m =   sc.nextInt();
  System.out.println("Enter the ending range");
  int n = sc.nextInt();
    if(m == 1 && m!=n) {
        System.out.println("The number is natural");
    {
    for (int i = m; i<n; i++) {
        System.out.println(i);
    }
}
 } else 
    {
        System.out.println("The number is not natural");
    }
}

}
