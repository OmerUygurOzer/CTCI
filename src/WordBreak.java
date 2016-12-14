import java.util.Set;

/**
 * Created by Omer on 12/13/2016.
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean memo[] = new boolean[s.length()+1];
        return helper(s,0,memo,wordDict);
    }

    private boolean helper(String s,int index ,boolean[] memo,Set<String> wordDict){
        if(index == s.length()){return true;}
        if(memo[index]){return true;}
        for(int i = index+1 ; i <= s.length(); i++){
            String cur = s.substring(index,i);
            System.out.println(cur);
            if(wordDict.contains(cur)){
                memo[i] = helper(s,i+1,memo,wordDict);
                if(memo[i]){return true;}
            }
        }
        return false;
    }
}
