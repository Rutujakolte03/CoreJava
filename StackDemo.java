import java.util.Stack;
public class StackDemo {
    public static void main (String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("America");
        stack.push("India");
        stack.push("Japan");
        System.out.println("Original stack is: " + stack);
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Now the stack looks like: " + stack);
        String poppedElement1 = stack peek();
        System.out.println("Popped element:  " + poppedElement1);
    }
}
//In the stack LIFO is there Last In first Out
