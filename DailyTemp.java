import java.util.Stack;

public class DailyTemp {
     public int[] dailyTemperatures(int[] temperatures) {
        // same approach as next greater element
        int n=temperatures.length;
        int[] result=new int[n];
        Stack<Integer> s= new Stack<>();
        for(int i=n-1;i>=0;i--){
           while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
            s.pop();
           }
           if(!s.isEmpty()){
            result[i]=s.peek()-i;
           }
           s.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
