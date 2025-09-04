import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/* 
 Leetcode 103
  https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

 Approach -> If you know the Level order traversal then it is a hint for you because this Question 
            is also solved by BFS approach but here we not use the queue, instead of queue we use
             Deque and a boolean type variable that track that how we will put the elements if it
             is false then left to right and if its true then right to left.
*/
public class BinaryTreeZigzagLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> q = new LinkedList<>();
        q.addFirst(root);
        boolean reverse = false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (!reverse) {
                    TreeNode curr = q.pollFirst();
                    current.add(curr.val);
                    if (curr.left != null)
                        q.addLast(curr.left);
                    if (curr.right != null)
                        q.addLast(curr.right);
                } else {
                    TreeNode curr = q.pollLast();
                    current.add(curr.val);
                    if (curr.right != null)
                        q.addFirst(curr.right);
                    if (curr.left != null)
                        q.addFirst(curr.left);
                }
            }
            res.add(current);
            reverse = !reverse;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
