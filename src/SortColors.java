import java.util.Arrays;

/**
 * Created by Omer on 2/1/2017.
 */

//This is basically the dutch flag problem
public class SortColors {


    void sortColors(int[] nums) {
        int j = 0, k = nums.length-1;
        for (int i=0; i <= k; i++) {
            if (nums[i] == 0) swap(i, j++,nums);
            else if (nums[i] == 2) swap(i--, k--,nums);
        }
    }

    private void swap(int i,int j,int[]nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
