
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Omer on 1/8/2017.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        result.add(new LinkedList<>());
        if(nums.length==0){return result;}
        helper(nums,0,new LinkedList<>(),result);
        return result;
    }

    private void helper(int [] nums,int index,LinkedList<Integer> cur,List<List<Integer>> result){
        if(index==nums.length){return;}
        for(int i = index; i <nums.length;i++){
            cur.add(nums[i]);
            result.add(new LinkedList<>(cur));
            helper(nums,i+1,cur,result);
            cur.remove(cur.size()-1);
        }
    }
}
