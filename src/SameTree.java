import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Omer on 11/12/2016.
 */
public class SameTree {


     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder pTree = new StringBuilder();
        StringBuilder  qTree = new StringBuilder();
        inOrder(p,pTree);
        inOrder(q,qTree);
        return pTree.toString().equals(qTree.toString());
    }

    private void inOrder(TreeNode node,StringBuilder stringBuilder){
        if(node==null){
            stringBuilder.append("N");
            return;
        }
        stringBuilder.append(Integer.toString(node.val));
        inOrder(node.left,stringBuilder);
        inOrder(node.right,stringBuilder);
    }
}
