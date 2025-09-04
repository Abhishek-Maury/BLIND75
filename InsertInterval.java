import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 Leetcode 57  https://leetcode.com/problems/insert-interval/

 Approch -> same as we do in merge interval here we add new interval in intervals and then 
            sort them based on starting element and do same as we do in merge interval question

 */
public class InsertInterval {
     public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalList=new ArrayList<>(Arrays.asList(intervals));
         intervalList.add(newInterval);
         Collections.sort(intervalList, (a,b) -> Integer.compare(a[0],b[0]));
         List<int[]> merge=new ArrayList<>();
         int[] prev=intervalList.get(0);
        for(int i=0;i<intervalList.size();i++){
            int[] interval=intervalList.get(i);
            if(interval[0]<=prev[1]){
                prev[1]=Math.max(interval[1],prev[1]);
            }else{
                merge.add(prev);
                prev=interval;
            }
        }
         merge.add(prev);
         return merge.toArray(new int[merge.size()][]);
    }
    public static void main(String[] args) {
        
    }
}
