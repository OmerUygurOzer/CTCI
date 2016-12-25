/**
 * Created by Omer on 11/15/2016.
 */
public class KthSmallestElementInBST {



      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public int kthSmallest(TreeNode root, int k) {
        StringBuilder builder = new StringBuilder();
        inOrder(builder,root);
        return Integer.parseInt(builder.toString().split("/")[k-1]);
    }

    public void inOrder(StringBuilder builder,TreeNode node){
        if(node==null){
            return;
        }
        inOrder(builder,node.left);
        builder.append(node.val+"/");
        inOrder(builder,node.right);
    }

}
