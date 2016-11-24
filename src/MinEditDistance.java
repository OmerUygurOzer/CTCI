/**
 * Created by Omer on 11/23/2016.
 */
public class MinEditDistance {
    public int minDistance(String word1, String word2) {
        if(word1 == null || word2 == null){return 0;}
        if(word1.length() == 0){return word2.length();}
        if(word2.length() == 0){return word1.length();}

        int l1 = word1.length();
        int l2 = word2.length();
        int[][] memo = new int[l1][l2];
        return helper(word1,word2,l1-1,l2-1,memo);
    }

    private int helper(String w1,String w2,int l1,int l2,int[][] memo){
        if(l2<0 && l1>=0){
            return l1+1;
        }
        if(l1<0 && l2>=0){
            return l2+1;
        }
        if(l2<0 &&l1<0){
            return 0;
        }
        if(memo[l1][l2]!=0){
            return memo[l1][l2];
        }

        if(l1 >= 0 && l2>=0 && w1.charAt(l1)==w2.charAt(l2)){
            memo[l1][l2]=helper(w1,w2,l1-1,l2-1,memo);
            return memo[l1][l2];
        }

        int replace = 1 + helper(w1,w2,l1-1,l2-1,memo);
        int insert  = 1 + helper(w1,w2,l1,l2-1,memo);
        int delete  = 1 + helper(w1,w2,l1-1,l2,memo);
        memo[l1][l2] = Math.min(replace,Math.min(insert,delete));
        return memo[l1][l2];
    }
}
