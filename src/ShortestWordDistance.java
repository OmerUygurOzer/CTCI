/**
 * Created by Omer on 11/23/2016.
 */
public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int cur1 = -1;
        int cur2 = -1;
        for(int i = 0; i<words.length;i++){
                if(words[i].equals(word1)) {cur1 = i;}
                if(words[i].equals(word2)) {cur2 = i;}
                min = cur1 !=-1 && cur2!= -1 ? Math.min(min,Math.abs(cur1-cur2)) : min;
        }
        return min;
    }
}
