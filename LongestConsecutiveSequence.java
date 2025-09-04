import java.util.HashSet;
import java.util.Set;

// Approach --> HashSet
public class LongestConsecutiveSequence {
      public static int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }
        int longest =0;
        for(int num:numset){
            if(!numset.contains(num-1)){
                int currentNum = num;
                int currlength =1;
                while(numset.contains(currentNum+1)){
                    currentNum++;
                    currlength++;
                }
                longest=Math.max(longest,currlength);
            }
            
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
