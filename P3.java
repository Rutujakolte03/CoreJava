 class P3 {
public static int add(int a, int b) {
    int c = a+b;
    return c;
}    
public static int add(int a, int b, int c) {
    int d = a+b+c;
    return d;
}
public static int add(int a, int b, int c, int d) {
    int e = a+b+c+d;
    return e;
}
public static int add(int a, int b, int c, int d,int e) {
int f = a+b+c+d+e;
return f;
} 

public static void main(String[] args) {
    int result = add(10,20);
    int result1 = add(10,20,30);
    int result2 = add(10,20,30,40);
    int result3 = add(10,20,30,40,50);
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);


}
}
