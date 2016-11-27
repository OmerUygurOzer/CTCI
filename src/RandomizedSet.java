import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Omer on 11/25/2016.
 */
public class RandomizedSet {
    /** Initialize your data structure here. */

    private HashMap<Integer,Integer> dataToId;
    private HashMap<Integer,Integer> IdToData;
    private int id;


    public RandomizedSet() {
        id = 0;
        dataToId = new HashMap<>();
        IdToData = new HashMap<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean contains = dataToId.containsKey(val);
        if(!contains){
            dataToId.put(val,id);
            IdToData.put(id,val);
        }
        return !contains;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean contains = dataToId.containsKey(val);
        if(contains){
            int id = dataToId.get(val);
            dataToId.remove(val);
            IdToData.remove(id);
        }
        return contains;
    }

    /** Get a random element from the set. */
    public int getRandom() {
    return 1;
    }

    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */
}
