import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 1/8/2017.
 */
public class PreOrderTraversal {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList<>();
         helper(root,result);
        return result;
    }

    private void helper(TreeNode node,List<Integer> result){
        if(node==null){return;}
        result.add(node.val);
        helper(node.left,result);
        helper(node.right,result);
    }
}
