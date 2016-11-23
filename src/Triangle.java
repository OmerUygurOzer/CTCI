import java.util.List;

/**
 * Created by Omer on 11/22/2016.
 */
public class Triangle {

//
//    public int minimumTotal(List<List<Integer>> triangle) {
//        if(triangle==null){return 0;}
//        int[] max = new int[]{Integer.MAX_VALUE};
//        helper(triangle,max,0,0,0);
//        return max[0];
//    }
//
//    private void helper(List<List<Integer>> triangle,int [] max,int cur,int index,int depth){
//        cur+=triangle.get(depth).get(index);
//        if(depth<triangle.size()-1){
//            helper(triangle,max,cur,index,depth+1);
//            helper(triangle,max,cur,index+1,depth+1);
//            return;
//        }
//        max[0] = Math.min(cur,max[0]);
//    }


    //O(n) solutions


    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null){return 0;}
        int width = triangle.get(triangle.size()-1).size();
        int depth = triangle.size();
        int[][] memo = new int[depth][width];
        for(int i = depth-1; i >= 0; i--){
            List<Integer> row = triangle.get(i);
            for(int j = 0; j < row.size(); j++){
                if(i==depth-1) {
                    memo[i][j] = row.get(j);
                }else {
                    memo[i][j] = Math.min(memo[i+1][j]+ row.get(j),memo[i+1][j+1]+row.get(j));
                }
            }
        }
        return memo[0][0];
    }





}
