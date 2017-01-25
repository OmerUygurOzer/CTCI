import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Omer on 11/16/2016.
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(result,new ArrayList<>(),0,nums);
        result.add(new ArrayList<>());
        return result;
    }

    private void helper(List<List<Integer>> result,List<Integer> cur,int index,int[] nums){
        if(index==nums.length){return;}

        for(int i=index;i<nums.length;i++){
            cur.add(nums[i]);
            result.add(new ArrayList<>(cur));
            helper(result,cur,i+1,nums);
            cur.remove(cur.size()-1);
            while(i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        }
    }
}

