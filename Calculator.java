class Main{
    public static void Addition(int a, int b, int c, int d) {
        int e = a+b+c+d;
        System.out.println(e);
    }
    public static void Multiplication(int a, int b, int c, int d, int e) {
        int f = a*b*c*d*e;
        System.out.println(f);
    }
    public static void Substraction(int a, int b, int c, int d, int e, int f) {
        int g = a-b-c-d-e-f;
        System.out.println(g);
    }
    public static void Division(int a, int b) {
        int c = a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Addition(10,20,30,40);
        Multiplication(10,20,30,40,50);
        Substraction(10,20,30,40,50,60);
        Division(10,20);

    }
}
