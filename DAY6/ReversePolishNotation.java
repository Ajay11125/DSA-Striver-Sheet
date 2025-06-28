package DAY6;
import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
    Stack<Integer> stack=new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b); // integer division
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop(); // final
    }
}
