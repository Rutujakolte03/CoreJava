import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Creating a Stack of Strings
        Stack<String> stack = new Stack<>();
        
        // Pushing elements onto the stack
        stack.push("America");
        stack.push("India");
        stack.push("Japan");
        
        // Displaying the original stack
        System.out.println("Original stack is: " + stack);
        
        // Popping the top element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        
        // Displaying the stack after popping an element
        System.out.println("Now the stack looks like: " + stack);
        
        // Peeking the top element (without removing it)
        String peekedElement = stack.peek();
        System.out.println("Peeked element: " + peekedElement);
    }
}
