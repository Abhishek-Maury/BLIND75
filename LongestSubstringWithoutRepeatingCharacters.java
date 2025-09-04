import java.util.HashMap;

// Approach --> Two pointer, Sliding Window, HashMap

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int maxLength=0;
        
        int left=0;
        for(int right=0;right<n;right++){
            if(!map.containsKey(s.charAt(right))|| map.get(s.charAt(right))<left){
                map.put(s.charAt(right),right);
                maxLength=Math.max(maxLength,right-left+1);
            }else{
                left=map.get(s.charAt(right))+1;
                map.put(s.charAt(right),right);
            }
        }
        
        return maxLength;
    }
    public static void main(String[] args) {
        
    }
}
