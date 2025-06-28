
import java.util.Stack;
    
    

class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> Index=new Stack<>();
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(temperatures[i]);
                Index.push(i);
                continue;
            }
        
            while(!stack.isEmpty()&&stack.peek()<=temperatures[i]){
                stack.pop();
                Index.pop();
            }
           
            if(stack.isEmpty()){
                ans[i]=0;
            }else{
                ans[i]=Index.peek()-i;
            }
            stack.push(temperatures[i]);
            Index.push(i);
            
        }
        return ans;
    }
}