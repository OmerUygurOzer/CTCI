import java.util.Set;

/**
 * Created by Omer on 12/13/2016.
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean memo[] = new boolean[s.length()+1];
        memo[0] = true;

        for(int i  = 1; i <= s.length() ; i++){
            for(int j = 0 ; j < i; j++){
                if(memo[j]&&wordDict.contains(s.substring(j,i))){
                   memo[i] = true;
                   break;
                }
            }
        }


        return memo[s.length()];
    }


}
