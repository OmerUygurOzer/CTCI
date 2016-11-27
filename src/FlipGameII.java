

import java.util.HashMap;

/**
 * Created by Omer on 11/26/2016.
 */
public class FlipGameII {
    public boolean canWin(String s) {
       if( s==null || s.length() < 2 ){
           return false;
       }
        return helper(new HashMap<String,Boolean>(),s);
    }


    private boolean helper(HashMap<String,Boolean> memo,String s){
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='+') {
                String cur = s.substring(0, i) + "--" + s.substring(i+2,s.length());
                if (!helper(memo,cur)) {
                    memo.put(s, true);
                    return true;
                }
            }
        }
        memo.put(s, false);
        return false;
    }


}
