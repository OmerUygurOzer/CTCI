import java.util.HashMap;

/**
 * Created by Omer on 11/17/2016.
 */
public class SingleNumberII {

//    With extra memory
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int n:nums){
            if(!maps.containsKey(n)){
                maps.put(n,0);
            }
            int val = maps.get(n)+1;
            if (val==3){
                maps.remove(n);
                continue;
            }
            maps.put(n,val);
        }
        return maps.keySet().iterator().next();
    }


    //Without extra memory



}
