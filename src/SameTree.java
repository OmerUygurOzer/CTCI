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
        preOrder(p,pTree);
        preOrder(q,qTree);
        return pTree.toString().equals(qTree.toString());
    }

    private void preOrder(TreeNode node,StringBuilder stringBuilder){
        stringBuilder.append(node==null?"N":Integer.toString(node.val));
        stringBuilder.append(Integer.toString(node.val));
        preOrder(node.left,stringBuilder);
        preOrder(node.right,stringBuilder);
    }
}
