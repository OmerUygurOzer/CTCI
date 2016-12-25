import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Omer on 12/15/2016.
 */
public class PalindromePartitioningII {
    public int minCut(String s) {
        if(s.isEmpty()){return 0;}
        int [] max = new int[]{Integer.MAX_VALUE};
        boolean[][] memo = new boolean[s.length()+1][s.length()+1];
        helper(s,memo,max,new LinkedList<>(),0);
        return max[0];
    }

    private void helper(String s,boolean[][] memo,int [] max, List<String> cur,int index){
        if(index==s.length()){max[0] = Math.min(max[0],cur.size()-1);}

        for(int i = index; i<=s.length();i++){
            String candidate = s.substring(index,i);
            if(memo[index][i]){
                cur.add(candidate);
                helper(s,memo,max,cur,i);
                cur.remove(cur.size()-1);
                continue;
            }
            if(isPalindrome(candidate)){
                memo[index][i] = true;
                cur.add(candidate);
                helper(s,memo,max,cur,i);
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
