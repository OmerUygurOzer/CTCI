/**
 * Created by Omer on 11/15/2016.
 */
public class ConstructBinaryTreeFromPreOrderAndInOrder {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,preorder.length,preorder,inorder);
    }

    public TreeNode helper(int cur,int left,int right,int[] preorder,int[] inorder){

        if(cur>=preorder.length || left>right){return null;}

        int index;
        TreeNode node = new TreeNode(preorder[cur]);
        index = search(inorder,preorder[cur]);
        node.left = helper(cur+1,left,index-1,preorder,inorder);
        node.right= helper(cur + index - left + 1,index+1,right,preorder,inorder);

        return node;
    }

    public int search(int[] nums,int val){
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==val){
                return i;
            }
        }
        return -1;
    }
}
