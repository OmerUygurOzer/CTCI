import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Omer on 12/14/2016.
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        List<Integer>  result = new ArrayList<>();

        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        

        for(int i = 0 ; i<k ; i++){

        }

        return result;
    }


}
