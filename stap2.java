import java.util.Stack;

public class stap2 {
    public static void insertAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, data);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        insertAtBottom(stack, 4);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}