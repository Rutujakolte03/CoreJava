 class P9 {
static int a = 10;
static float b = 55.5f;
char c = 'A';
double d = 1.0; 
static {
    System.out.println(P9.a);
    System.out.println(P9.b);
}
public static void main(String args[] ) {
    
int a = 20;
float b = 66.6f;
char c = 'B';
double d = 2.0;
    P9 ref = new P9();
    System.out.println(P9.a);
    System.out.println(P9.b);
    System.out.println(c);
    System.out.println(d);
  
}  
 }
