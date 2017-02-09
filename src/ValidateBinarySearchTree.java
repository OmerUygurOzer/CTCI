/**
 * Created by Omer on 2/6/2017.
 */
public class ValidateBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node,long min,long max){
        if(node == null){return true;}
        if(node.val <= min || node.val>=max){return false;}
        return isValid(node.left,min,node.val) && isValid(node.right,node.val,max);
    }
}
