import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 11/14/2016.
 */
public class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        helper(nums.length,nums,new ArrayList<>(),permutations);
        return permutations;
    }

    private void helper(int len,int[] nums,List<Integer> cur,List<List<Integer>> permutations){
        for(int i = 0;i<len;i++){
            if(!cur.contains(nums[i])){
                cur.add(nums[i]);
                if(cur.size()==len){permutations.add(new ArrayList<>(cur));}else{
                    helper(len,nums,cur,permutations);
                }
                cur.remove(cur.size()-1);
            }
        }
    }


}
