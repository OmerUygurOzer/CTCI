/**
 * Created by Omer on 12/5/2016.
 */
public class ShortestPalindrome {

    //Inspired by manacher's algorithm

    public String shortestPalindrome(String s) {
        if(s.isEmpty()){return s;}
        StringBuilder result = new StringBuilder();

        int rem = 0;
        for(double i =0; i <= s.length()/2 ; i+=0.5D){
             int l = (int)Math.floor(i);
             int r = (int)Math.ceil(i);
             while (l >= 0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                    rem = l==0 ?  Math.max(rem,r-l) : rem;
                    l--;
                    r++;
             }
        }
        result.append(new StringBuilder(s.substring(rem+1,s.length())).reverse());
        result.append(s);
        return result.toString();
    }




}
