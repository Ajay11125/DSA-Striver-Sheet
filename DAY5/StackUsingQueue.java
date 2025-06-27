import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue=new LinkedList<>();
    Queue<Integer> store=new LinkedList<>();
    
    public void push(int x) {
        queue.add(x);
       
    }
    
    public int pop() {
        int ans=-1;
        int cnt=0;
        while(!queue.isEmpty()){
            int temp=queue.remove();
            ans=temp;
            store.add(temp);
            cnt++;
        }
        cnt--;
        while(cnt>0){
            int temp=store.remove();
            queue.add(temp);
            cnt--;
        }
        store.remove();
       
        return ans;


    }
    
    public int top() {
        int ans=-1;
        int cnt=0;
        while(!queue.isEmpty()){
            int temp=queue.remove();
            ans=temp;
            store.add(temp);
            cnt++;
        }

        while(cnt>0){
            int temp=store.remove();
            queue.add(temp);
            cnt--;
        }
        return ans;

        
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

