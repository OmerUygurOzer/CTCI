import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Omer on 11/29/2016.
 */
public class InvertBinaryTree {



      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public TreeNode invertTree(TreeNode root) {
        if(root==null){return null;}
        helper(root);
        return root;
    }

    public void helper(TreeNode node){
        if(node==null){return;}
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        helper(node.left);
        helper(node.right);
    }



}
