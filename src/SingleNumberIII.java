import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Omer on 11/29/2016.
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i)){map.put(i,0);}
            map.put(i,map.get(i)+1);
            if(map.get(i)==2){map.remove(i);}
        }
        int[] result = new int[2];
        Iterator<Integer> itr = map.keySet().iterator();
        result[0] = itr.next();
        result[1] = itr.next();
        return result;
    }


}
