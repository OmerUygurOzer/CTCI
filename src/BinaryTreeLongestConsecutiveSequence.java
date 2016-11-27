/**
 * Created by Omer on 11/25/2016.
 */
public class BinaryTreeLongestConsecutiveSequence {


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public int longestConsecutive(TreeNode root) {
        if(root==null){return 0;}
        int [] max = new int[]{1};
        helper(0,root.val,max,root);
        return max[0];
    }

    private void helper(int sofar,int parent,int[] max,TreeNode node){
        if(node==null){return;}
        if(node.val==parent+1){
            sofar++;
            max[0]=Math.max(sofar,max[0]);
        }else{
            sofar = 1;
        }
        parent = node.val;
        helper(sofar,parent,max,node.left);
        helper(sofar,parent,max,node.right);

    }
}
