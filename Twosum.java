import java.util.HashMap;

// Approach ->  HashMap

// its MATH logic 

public class Twosum {
     public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        
    }
}
