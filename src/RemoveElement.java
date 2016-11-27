/**
 * Created by Omer on 11/26/2016.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int found = 0;
        for(int i = 0; i <nums.length; i++){
            if(nums[i]!=val){
                nums[found++]=nums[i];
            }
        }
        return found;
    }
}
