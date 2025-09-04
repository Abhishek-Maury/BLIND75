public class LongestPalindromicSubstring {
    // 
    // Approach--> Two pointer
    
    // "b" -> a single character is also a palindrome itself and it is odd
    // "bb" -> it is a even palindrome.
    // so this is a concept of even odd palindrome

     public String longestPalindrome(String s) {
        String maxStr=s.substring(0,1);
        for(int i=0;i<s.length();i++){
           String odd=expandFromCounter(s,i,i);
           String even=expandFromCounter(s,i,i+1);
           if(odd.length()>maxStr.length()){
               maxStr=odd;
           }
           if(even.length()>maxStr.length()){
            maxStr=even;
           }
        }
        return maxStr;
    }

    public String expandFromCounter(String s,int left,int right){
        while(left>=0 &&right<s.length() &&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public static void main(String[] args) {
        
    }
}
