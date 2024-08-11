class P8 {
    static String name;
    static char ch;
    public static void qSpiders(){
        System.out.println("qSpiders begin");
        System.out.println("name:"+ name);
        System.out.println("char:"+ch);
        System.out.println("qSpiders ends");
    }
    static {
        System.out.println("SIB-1");
    }
    public static void main(String[] args) {
        System.out.println("MB");
        char ch = 'a';
        qSpiders();
        System.out.println("name:"+name);
        System.out.println("char:"+ch);
        System.out.println("ME");
        }
        static {
            System.out.println("SIB-2");
        }

}
