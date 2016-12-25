import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Omer on 11/5/2016.
 */
public class LongestSubStringWithAtMostKDistinct {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(k==0 || s.isEmpty()){return 0;}
        HashSet<Character>         characterSet = new HashSet<>();
        HashMap<Character,Integer> countMap     = new HashMap<>();

        int result = 1;
        int left = 0;

        char c;
        char b;

        for(int i = 0; i <s.length(); i++){
            c = s.charAt(i);
            if(!countMap.containsKey(c)){countMap.put(c,0);}
            characterSet.add(c);
            countMap.put(c,countMap.get(c)+1);
            while(characterSet.size()>k) {
                b = s.charAt(left);
                countMap.put(b,countMap.get(b)-1);
                if(countMap.get(b)==0){characterSet.remove(b);}
                left++;
            }
            result = Math.max(i-left+1,result);
        }

        return result;
    }
}
