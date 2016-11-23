
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 11/22/2016.
 */
public class InOrderSuccessor {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null || p==null){return null;}
        ArrayList<TreeNode> list = new ArrayList<>();
        int[] index = new int[]{0};
        helper(root,p,index,list);
        return index[0]==list.size()-1?null:list.get(index[0]+1);
    }

    private void helper(TreeNode node,TreeNode p,int[] index,List<TreeNode> nodeList){
        if(node==null){
            return;
        }
        helper(node.left,p,index,nodeList);
        nodeList.add(node);
        if(node.val == p.val){
            index[0] = nodeList.size()-1;
        }
        helper(node.right,p,index,nodeList);
    }
}
