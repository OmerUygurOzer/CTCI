import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 12/27/2016.
 */
public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++){
                if(nums[i]>0){result.add(i+1);}
        }

        return result;
    }
}
