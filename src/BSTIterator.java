import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by Omer on 2/9/2017.
 */
public class BSTIterator {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        push(root);
    }

    private void push(TreeNode node){
        while(node!=null){
            stack.push(node);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.size()>0;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        if(node.right!=null){push(node.right);}
        return node.val;
    }
}
