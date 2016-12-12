import java.util.HashSet;
import java.util.Set;

/**
 * Created by Omer on 12/8/2016.
 */
public class ScrambleString {


    public boolean isScramble(String s1, String s2) {
        if(s1.isEmpty() || s2.isEmpty()){ return false;}
        Set<String> found = new HashSet<>();
        found.add(s1);
        scramble(s1,s1,0,s1.length(),found);
        return found.contains(s2);
    }

    private void scramble(String word,String part,int l,int r,Set<String> found){
        StringBuilder builder;

        for(int i = 1; i<part.length();i++) {
            builder = new StringBuilder();
            String leftW = part.substring(0, i);
            String rightW = part.substring(i, part.length());

            builder.append(word.substring(0, l));
            builder.append(rightW);
            builder.append(leftW);
            builder.append(word.substring(r, word.length()));


            found.add(builder.toString());
            System.out.println(found);

            int mid = l + i;
            scramble(word, leftW, l, mid, found);
            scramble(word, rightW, mid, r, found);
        }
    }


}
