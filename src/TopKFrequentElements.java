import java.util.*;

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

        List[] buckets = new List[nums.length+1];

        for(Integer i : map.keySet()){
            int b = map.get(i);
            if(buckets[b]==null){buckets[b] = new LinkedList<>();}
            buckets[b].add(i);
        }

        for (int pos = buckets.length - 1; pos >= 0 && result.size() < k; pos--) {
            if (buckets[pos] != null) {
                result.addAll(buckets[pos]);
            }
        }

        return result;
    }


}
