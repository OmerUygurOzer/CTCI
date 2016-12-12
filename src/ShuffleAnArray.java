import java.util.Arrays;
import java.util.Random;

/**
 * Created by Omer on 12/10/2016.
 */
public class ShuffleAnArray {

    int[] raw ;
    int[] cur;
    Random random = new Random();

    public ShuffleAnArray(int[] nums) {
        this.raw = new int[nums.length];
        for(int i = 0; i < nums.length; i++){this.raw[i] = nums[i];}
        this.cur = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        if(cur.length==0){return cur;}
        for(int i = 0 ; i < raw.length; i++){cur[i] = raw[i];}
        return cur;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(cur.length==0){return cur;}
        shuffler(0);
        return cur;
    }

    private void shuffler(int index){
        if(index == raw.length-1){return;}
        int swapIndex = getRandom(index,raw.length);
        int temp = cur[index];
        cur[index] = cur[swapIndex];
        cur[swapIndex] = temp;
        shuffler(index+1);
    }

    private int getRandom(int min,int max){
        return random.nextInt(max-min)+min;
    }

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(nums);
     * int[] param_1 = obj.reset();
     * int[] param_2 = obj.shuffle();
     */
}
