/**
 * Created by Omer on 12/3/2016.
 */
public class BinaryTreeMaximumPathSum {

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public int maxPathSum(TreeNode root) {
        int [] max = new int[]{Integer.MIN_VALUE};
        helper(root,max);
        return max[0];
    }

    private int helper(TreeNode node,int[] max){
        if(node.left == null && node.right ==null){
            max[0] = Math.max(max[0],node.val);
            return node.val;
        }

        if(node.left == null){
            int right = helper(node.right,max);
            int val   = node.val;
            int temp  = Math.max(val,right+val);
            max[0] = Math.max(max[0],temp);
            return temp;
        }

        if(node.right == null){
            int left = helper(node.left,max);
            int val  = node.val;
            int temp = Math.max(val,left+val);
            max[0] = Math.max(max[0],temp);
            return temp;
        }

        int left = helper(node.left,max);
        int right= helper(node.right,max);
        int val  = node.val;
        int temp = Math.max(val,Math.max(right+left+val,Math.max(right+val,left+val)));
        max[0] = Math.max(max[0],temp);
        return Math.max(val,Math.max(right+val,left+val));
    }
}
