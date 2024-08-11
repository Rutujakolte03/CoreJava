import java.util.Scanner; 
class Num {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the starting range");
  int m =   sc.nextInt();
  System.out.println("Enter the ending range");
  int n = sc.nextInt();
    if(m == 0 && m!=n) {
        System.out.println("The number is whole number");
    {
    for (int i = m; i<n; i++) {
        System.out.println(i);
    }
}
 } else 
    {
        System.out.println("The number is not whole number");
    }
}

}
