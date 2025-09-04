public class PalindromicSubstrings {
    // Approach--> Two pointer
    
    // "b" -> a single character is also a palindrome itself and it is odd
    // "bb" -> it is a even palindrome.
    // so this is a concept of even odd palindrome

    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int odd=isPalndromic(s,i,i);
            int even=isPalndromic(s,i,i+1);
            ans+=odd+even;
        }
        return ans;
    }
    public int isPalndromic(String s,int left,int right){
        int count=0;
        while(left>=0 && right<s.length() &&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
