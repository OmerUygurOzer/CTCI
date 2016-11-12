import java.util.Stack;

/**
 * Created by Omer on 11/5/2016.
 */
public class LongestSubStringWithAtMostKDistinct {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        String [] dirs = s.split("\n");
        int maxLen = dirs[0].length();
        Stack<String> stack = new Stack<>();
        stack.push(dirs[0]);

        for(int i = 1; i <dirs.length;i++ ){
            
        }


        return 0;
    }
}
