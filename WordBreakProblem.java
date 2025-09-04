public class WordBreakProblem {
   static class Node {
        Node[] children = new Node[26];
        Boolean endOfWord = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

     public static Node root =new Node();

    public static void insert(String s){
        Node curr=root;
        for (int level = 0; level < s.length(); level++) {
            int idx=s.charAt(level)-'a';
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node();
            }
           
                curr=curr.children[idx];
            
        }
        curr.endOfWord=true;
    }

    public static boolean search(String key){
         Node curr=root;
        for (int i = 0; i < key.length(); i++) {
            int idx=key.charAt(i)-'a';
            if (curr.children[idx]==null) {
                return false;
            }
           
                curr=curr.children[idx];
            
        }
       return curr.endOfWord==true;
    }

    public static boolean wordBreak(String s){
        if (s.length()==0) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (search(s.substring(0,i)) && wordBreak(s.substring(i))) {
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
      String[] words={"the","a","there","their","any","three"};
      for (int i = 0; i < words.length; i++) {
           insert(words[i]);
      }
      System.out.println(search("any"));
      String key="anythree";
      System.out.println(wordBreak(key));
      
    }
}
