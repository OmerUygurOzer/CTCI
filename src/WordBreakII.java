import java.util.*;

/**
 * Created by Omer on 11/23/2016.
 */
public class WordBreakII {

    public List<String> wordBreak(String s, Set<String> wordDict) {
        HashMap<String,LinkedList<String>> memo = new HashMap<>();
        return helper(s,wordDict,memo);
    }

    private LinkedList<String> helper(String s,Set<String> wordDict,HashMap<String,LinkedList<String>> memo){
        if(memo.containsKey(s)){
            return memo.get(s);
        }

        LinkedList<String> result = new LinkedList<>();
        if(s.length()==0){
            result.add("");
            return result;
        }

        for(String word : wordDict){
            if(s.startsWith(word)){
                List<String> cur = helper(s.substring(word.length()),wordDict,memo);
                for(String w : cur){result.add(word + (w.isEmpty()? ""  : " ")+w);}
            }
        }
        memo.put(s,result);
        return result;
    }




}
