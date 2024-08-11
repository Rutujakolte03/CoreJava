class P5 {
    public static int Smallest(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    } public static int Smallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }
    public static int Smallest(int a, int b, int c, int d) {
        if (a < b ) {
            return a;
        } else if (c < d) {
            return c;
        } else  {
            return d;
        }
    }
        public static void main(String[] args) {
            int result = Smallest(10,20);
            System.out.println(result);
            int result1 = Smallest(200,300,150);
            System.out.println(result1);
            int result2 = Smallest(45, 90, 305, 201);
            System.out.println(result2);
        }
    
}
