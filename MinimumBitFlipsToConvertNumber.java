public class MinimumBitFlipsToConvertNumber {
    /*
     leetcode 2220  https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
     
     */
      public int minBitFlips(int start, int goal) {
          int ans = 0; 
      
        int xor = start ^ goal;

        while(xor!=0){
   
            ans += xor & 1;

            xor >>=1;
        }
        return ans; 
    }
    public static void main(String[] args) {
        
    }
}
