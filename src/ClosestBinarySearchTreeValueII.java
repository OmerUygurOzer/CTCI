import java.util.*;

/**
 * Created by Omer on 11/20/2016.
 */
public class ClosestBinarySearchTreeValueII {



     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    //Kind of brute forcy
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Integer> result = new ArrayList<>();
        traverse(root,result);
        Collections.sort(result,new MyComparator(target));
        return result.subList(0,k);
    }

    private void traverse(TreeNode node,List<Integer> closest){
        if(node==null){return;}
        closest.add(node.val);
        traverse(node.left,closest);
        traverse(node.right,closest);
    }

    public class MyComparator implements Comparator<Integer>{

        double target;

        public MyComparator(double target){
            this.target = target;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            return Double.compare(Math.abs(o1-target),Math.abs(o2-target));
        }
    }



//Less than O(n)

}
