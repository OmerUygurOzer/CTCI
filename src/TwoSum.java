import java.util.HashMap;

/**
 * Created by Omer on 11/13/2016.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap<Integer,Integer> sumMap = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            if(sumMap.containsKey(target-nums[i])){
                result[0] = sumMap.get(target-nums[i]);
                result[1] = i;
            }
            sumMap.put(nums[i],i);
        }

        return result;
    }
}
