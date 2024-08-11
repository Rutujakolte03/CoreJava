class challenge {
    static boolean a;
    static double b;
    public static void qSpiders() {
        System.out.println("qSpiders begins");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a = true;
        b = 10.5;
        System.out.println("qSpiders ends");
    }
    public static void jSpiders() {
        System.out.println("jSpiders begins");
        qSpiders();
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a = false;
        b = 20.5;
        System.out.println("jSpiders ends");
    }
    static {
        System.out.println("SIB:-1");
    }
    public static void main(String[] args) {
        System.out.println("MB");
        float c = 10;
        jSpiders();
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("ME");
    }
    static {
        qSpiders();
    }
}
