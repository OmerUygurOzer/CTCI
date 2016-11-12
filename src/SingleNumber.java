import java.util.HashMap;

/**
 * Created by Omer on 11/11/2016.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(Integer i :nums){
            if(!countMap.containsKey(i)){
                countMap.put(i,0);
            }
            countMap.put(i,countMap.get(i)+1);
        }

        for(Integer i : countMap.keySet()){
            if(countMap.get(i)%2 == 1){
                return i;
            }
        }
        return 0;
    }

    //Without extra memory;

    public int singleNumberNoMem(int[] nums) {
        int val = 0;
        for(Integer i :nums){
          val = val ^ i;
        }
        return val;
    }

}
