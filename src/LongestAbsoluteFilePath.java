import java.util.Stack;

/**
 * Created by Omer on 11/14/2016.
 */
public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        String[] paths = input.split("\n");
        int[] stack = new int[paths.length+1];
        int max = 0;
        int cur = 0;
        for(String s: paths){
            int level = s.lastIndexOf("\t")+1;
            cur = stack[level+1] = stack[level]+s.length()-level+1;
            if(s.contains(".")){max=Math.max(cur-1,max);}
        }
        return max;
    }
}
