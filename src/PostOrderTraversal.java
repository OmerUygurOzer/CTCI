import java.util.*;

/**
 * Created by Omer on 12/14/2016.
 */
public class PostOrderTraversal {


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result  = new ArrayList<>();
        if(root == null){return result;}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            root = stack.pop();
            result.add(root.val);
            if(root.left!=null){stack.push(root.left);}
            if(root.right!=null){stack.push(root.right);}
        }
        Collections.reverse(result);
        return result;
    }
}
