import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Omer on 11/18/2016.
 */
public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        HashMap<Character,Integer> mapping = new HashMap<>();

        int rec,left = 0;
        for(int i = 0;i<s.length();i++){
            rec = mapping.getOrDefault(s.charAt(i),-1);
            if(left <= rec && rec<i){
                max = Math.max(max,i-left);
                left = rec+1;
            }
            mapping.put(s.charAt(i),i);
        }
        return Math.max(max,s.length()-left);
    }
}
