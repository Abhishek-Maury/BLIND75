import java.util.ArrayList;
import java.util.List;

public class GenrateParenthesis {
     public List<String> generate(int n) {
        List<String> res=new ArrayList<>();

        dfs(0, 0, n, "", res);
        return res;
    }
    public void dfs(int openP,int closeP,int n,String s,List<String> res ){
       if (openP==closeP && closeP+openP==n*2) {
          res.add(s);
          return;
       }
       if (openP<n) {
          dfs(openP+1, closeP, n, s+"(", res);
       }
       if (closeP<openP) {
         dfs(openP, closeP+1, n, s+")", res);
       }
    }

    public static void main(String[] args) {
        
    }
}
