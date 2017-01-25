import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Omer on 1/25/2017.
 */
public class BinaryTreeVerticalOrderTraversal {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){return result;}
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> resMap = new TreeMap<>();
        helper(resMap,0,0,root);
        for(TreeMap<Integer,List<Integer>> m : resMap.values()){
            List<Integer> t = new LinkedList<>();
            for(List<Integer> i : m.values()){
                t.addAll(i);
            }
            result.add(t);
        }
        return result;
    }

    private void helper(TreeMap<Integer,TreeMap<Integer,List<Integer>>> resMap,int horizontalLevel,int verticalLevel,TreeNode node){
        if(node==null){return;}
        helper(resMap,horizontalLevel+1,verticalLevel-1,node.left);
        if(!resMap.containsKey(verticalLevel)){resMap.put(verticalLevel,new TreeMap<>());}
        if(!resMap.get(verticalLevel).containsKey(horizontalLevel)){resMap.get(verticalLevel).put(horizontalLevel,new LinkedList<>());}
        resMap.get(verticalLevel).get(horizontalLevel).add(node.val);
        helper(resMap,horizontalLevel+1,verticalLevel+1,node.right);
    }

}
