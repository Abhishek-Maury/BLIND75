import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
   Leetcode 56   https://leetcode.com/problems/merge-intervals/ 
   Approch -> when i solve the question I'll take pen and paper and make a line because i want 
              to scrach line from staring point to ending point.
           1>   Main Approach is that you want to sort the array basis of begaining[0] element
                then you compare ending point of 0 index and starting point of the 1 index element
                
                               0     1      2      3
                intervals = [[1,3],[2,6],[8,10],[15,18]]


 */

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
          Arrays.sort(intervals, (a, b) -> Integer.compare(a[0] , b[0]));
          int [] prev =intervals[0];
          List<int[]> merged=new ArrayList<>();
          for(int i=1;i<intervals.length;i++){
              int[] interval=intervals[i];
              if(interval[0]<=prev[1]){
                prev[1]=Math.max(prev[1],interval[1]);
              }else{
                merged.add(prev);
                prev=interval;
              }
             
          }
           merged.add(prev);
             return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {
        
    }
}
