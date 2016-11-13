import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 11/13/2016.
 */
public class InOrderTraversalValues {


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }



    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        inOrder(inOrderList,root);
        return inOrderList;
    }

    private void inOrder(List<Integer> list, TreeNode node){
        if(node==null){return;}
        inOrder(list,node.left);
        list.add(node.val);
        inOrder(list,node.right);
    }
}
