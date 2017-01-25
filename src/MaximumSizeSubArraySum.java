import java.util.HashMap;

/**
 * Created by Omer on 1/25/2017.
 */
public class MaximumSizeSubArraySum {
    public int maxSubArrayLen(int[] nums, int k) {
        int res = 0;
        int curSum = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length; i++){
            curSum += nums[i];
            if( curSum == k ) {res = i+1;}
            else if(map.containsKey(curSum-k)){ res = Math.max(res,i-map.get(curSum-k));}
            if (!map.containsKey(curSum)) map.put(curSum, i);
        }

        return res;
    }


}
