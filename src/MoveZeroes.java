/**
 * Created by Omer on 11/26/2016.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int itr = 0, leftMostNonZero = 0;
        while (itr < nums.length) {
            if (nums[itr] != 0) {
                int temp = nums[leftMostNonZero];
                nums[leftMostNonZero++] = nums[itr];
                nums[itr] = temp;
            }
            itr++;
        }
    }
}
