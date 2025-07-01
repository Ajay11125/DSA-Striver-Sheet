import java.util.Stack;

class stackMin{
    Stack<Integer> stack;
    Stack<Integer> minStack; // To track minimum element.
    
    public stackMin() {
        stack = new Stack<>();
        minStack = new Stack<>(); 
    }
    
    public void push(int val) {
        stack.push(val);
    
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val); 
            // if current val is less than peek of minStack, then we have a
            // new minimum, so push it to minStack.
            // minStack.peek() always stores the min value found so far,
            // If more minimum value is pushed on to stack, then we compare it to minStack peek,
            // To check if this new value is the minimum, if so we push this new value to minStack,
            // Thus keeping minimum value found so far at minStack.peek()
        }
    }
    
    public void pop() {
        int currVal = stack.pop();
        if(currVal == minStack.peek()){
            // it means minimum element is popped.
            // so remove it from minStack as well.
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

