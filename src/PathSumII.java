import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 11/14/2016.
 */
public class PathSumII {



      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result,new ArrayList<>(),root,0,sum);
        return result;
    }

    private void helper(List<List<Integer>> result,List<Integer> cur,TreeNode node,int sum,int target){
        if(node==null){return;}
        sum+=node.val;
        cur.add(node.val);
        if(sum==target){
            if(node.left==null && node.right==null) {
                result.add(new ArrayList<>(cur));
            }
        }
        helper(result,new ArrayList<>(cur),node.left,sum,target);
        helper(result,new ArrayList<>(cur),node.right,sum,target);
    }
}
