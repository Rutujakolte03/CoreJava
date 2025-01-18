public class Demo6 {
    int x = 10;
{
    x = 20;
}
Demo6() {
    x = 30;
}
public static void main(String[] args) {
Demo6 d6 = new Demo6();
System.out.println(d6.x);
}
}

/* Instance variables (like x = 100) belong to the object and are global within the class.
Local variables (like x = 20 in the constructor) exist only temporarily in the block of code where they're declared. */
