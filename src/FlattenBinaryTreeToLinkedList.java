/**
 * Created by Omer on 12/12/2016.
 */
public class FlattenBinaryTreeToLinkedList {


      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public void flatten(TreeNode root) {
        helper(root);
    }

    private TreeNode helper(TreeNode node){
        if(node==null){return null;}

        if(node.left == null && node.right == null){
            return node;
        }

        if(node.right==null){
            node.right = node.left;
            node.left  = null;
            return helper(node.right);
        }

        if(node.left == null){
            return helper(node.right);
        }

        TreeNode left = helper(node.left);
        TreeNode right= helper(node.right);
        left.right = node.right;
        node.right = node.left;
        node.left  = null;
        return right;
    }
}
