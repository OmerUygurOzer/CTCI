import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Omer on 12/17/2016.
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if(s.isEmpty()){return result;}
        boolean[][] memo = new boolean[s.length()+1][s.length()+1];
        helper(s,memo,result,new LinkedList<>(),0);
        return result;
    }

    private void helper(String s,boolean[][] memo,List<List<String>> result, List<String> cur,int index){
        if(index==s.length()){result.add(new LinkedList<>(cur));}
        for(int i = index; i<=s.length();i++){
            String candidate = s.substring(index,i);
            if(memo[index][i]){
                cur.add(candidate);
                helper(s,memo,result,cur,i);
                cur.remove(cur.size()-1);
                continue;
            }
            if(isPalindrome(candidate)){
                memo[index][i] = true;
                cur.add(candidate);
                helper(s,memo,result,cur,i);
                cur.remove(cur.size()-1);
            }
        }
    }

    private boolean isPalindrome(String word){
        if(word.isEmpty()){return false;}
        if(word.length()==1){return true;}
        for(int i = 0 ; i <word.length()/2 ; i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){return false;}
        }
        return true;
    }
}
