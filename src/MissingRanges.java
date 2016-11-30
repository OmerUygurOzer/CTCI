import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 11/27/2016.
 */
public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int rem = 0;
        for(int i =0 ;i < nums.length-1; i++){
             rem = nums[i+1]-nums[i];
            if(rem>2){
                result.add(Integer.toString(nums[i]+1)+"->"+Integer.toString(nums[i+1]-1));
            }else if(rem==2){
                result.add(Integer.toString(nums[i]+1));
            }
        }

        return result;
    }
}
