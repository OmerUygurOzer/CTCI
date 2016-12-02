import java.util.Arrays;

/**
 * Created by Omer on 11/29/2016.
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<=0){return nums.length;}
        int result = 1;
        int memo[] = new int[nums.length];
        Arrays.fill(memo,1);
        for(int i = 1; i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if (nums[i]>nums[j]){
                    memo[i]= Math.max(memo[i],memo[j]+1);
                    result = Math.max(result,memo[i]);
                }
            }
        }

       return result;
    }
  }
