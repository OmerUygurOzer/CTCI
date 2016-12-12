import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Omer on 12/11/2016.
 */
public class LettersAndNumbers {
    //CTCI
    public String longestSubArrayWithEqualNumbersAndChars(String s){
        int[] differences = getDifferences(s);
        int[] match      = findMatch(differences);
        return s.substring(match[0],match[1]);
    }

    private int[] getDifferences(String s){
        int [] res = new int[s.length()];
        int dif = 0;
        for(int i = 0; i <s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                dif++;
            }else{
                dif--;
            }
            res[i] = dif;
        }
        return res;
    }

    private int[] findMatch(int[] difs){
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxLen = 0;

        for(int i = 0; i <difs.length;i++){
           if(!map.containsKey(difs[i])){
               map.put(difs[i],i);
           }else{
                int curLen =  i - map.get(difs[i]);
                if(curLen>maxLen){
                    res[0] = map.get(difs[i]);
                    res[1] = i;
                }
           }
        }


        return res;
    }
}
