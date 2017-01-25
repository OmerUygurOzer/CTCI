import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Omer on 1/4/2017.
 */
public class BinaryTreeLevelOrderTraversalI {



      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            helper(root,0,result);
            Collections.reverse(result);
            return result;
    }

    private void helper(TreeNode node,int level,List<List<Integer>> result){
          if(node==null){return;}
        if(level<result.size()){
            result.get(level).add(node.val);
        }else{
            List<Integer> newLevel = new ArrayList<>();
            newLevel.add(node.val);
            result.add(newLevel);
        }
        helper(node.left,level+1,result);
        helper(node.right,level+1,result);
    }
}
