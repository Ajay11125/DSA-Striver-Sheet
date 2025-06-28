package DAY6;

import java.util.ArrayList;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack=new Stack<>();
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        ArrayList<Integer> arr=new ArrayList<>();
        int ans=-1;
        while(!stack.isEmpty()){
            int temp=stack.pop();
            arr.add(temp);
            ans=temp;
        }
        int i=arr.size()-2;
        while(i>=0){
            stack.push(arr.get(i));
            i--;
        }
        return ans;
    }
    
    public int peek() {
         ArrayList<Integer> arr=new ArrayList<>();
        int ans=-1;
        while(!stack.isEmpty()){
            int temp=stack.pop();
            arr.add(temp);
            ans=temp;
        }
        int i=arr.size()-1;
        while(i>=0){
            stack.push(arr.get(i));
            i--;
        }
        return ans;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

