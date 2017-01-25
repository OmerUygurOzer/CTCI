import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Omer on 1/8/2017.
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character,Integer> frequencies = new HashMap<>();
        ArrayList<Character>[] buckets = new ArrayList[s.length()];

        int f;
        for(char c: s.toCharArray()){
            f = frequencies.getOrDefault(c,0)+1;
            frequencies.put(c,f);
        }

        int itr;
        for(char c: frequencies.keySet()){
            f   = frequencies.get(c);
            itr = s.length() - f;
            if(buckets[itr]==null)buckets[itr]=new ArrayList<>();
            while (f > 0) {
                buckets[itr].add(c);
                f--;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;  i < s.length() ; i++){
            if(buckets[i]==null){continue;}
            for(Character c: buckets[i]){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
