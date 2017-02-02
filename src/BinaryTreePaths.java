import java.util.LinkedList;
import java.util.List;

/**
 * Created by Omer on 2/1/2017.
 */
public class BinaryTreePaths {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        if(root==null){return result;}
        helper("",root,result);
        return result;
    }

    private void helper(String cur,TreeNode node,List<String> result){
        if(node.left == null && node.right== null){
            result.add(cur.isEmpty()?""+node.val:cur+"->"+node.val);
            return;
        }
        if(node.right!=null){
            helper(cur.isEmpty()?""+node.val:cur+"->"+node.val,node.right,result);
        }
        if(node.left!=null){
            helper(cur.isEmpty()?""+node.val:cur+"->"+node.val,node.left,result);
        }
    }
}
