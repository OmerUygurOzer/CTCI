import java.util.HashSet;
import java.util.Random;

/**
 * Created by Omer on 12/10/2016.
 */
public class RandomSet {
   //CTCI
    public HashSet<Integer> generateSet(int [] nums, int size){
        HashSet<Integer> result = new HashSet<>();
        int index = 0;

        while (result.size() <= size){
            int selectionIndex = getRandom(index,nums.length-1);
            result.add(nums[selectionIndex]);
            int temp = nums[index];
            nums[index] = nums[selectionIndex];
            nums[selectionIndex] = temp;
            index++;
        }
        return result;
    }


    private int getRandom(int min,int max){
        return new Random().nextInt(max-min)+min+1;
    }
}
