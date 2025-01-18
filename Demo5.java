public class Demo5 {
    int x = 100;

    Demo5() {
        x = 20; // Assign value to the instance variable
    }

    public static void main(String[] args) {
        Demo5 d5 = new Demo5();
        System.out.println(d5.x); // Now this will print 20
    }
}

