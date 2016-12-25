import java.util.HashMap;


/**
 * Created by Omer on 12/23/2016.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(s.equals(t)){return s;}
        int left = 0 , curLen = t.length(), d = Integer.MAX_VALUE,  head = 0;

        HashMap<Character,Integer> countMap = new HashMap<>();

        for(char c: t.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }

        char c;
        char f;

        for(int i = 0 ; i < s.length(); i++){
            c = s.charAt(i);
            if(countMap.containsKey(c)){
                if(countMap.get(c)>0){
                    curLen--;
                }
                countMap.put(c,countMap.get(c)-1);
            }
            while (curLen==0){
                if(i-left < d){d = i-left; head=left;}
                f = s.charAt(left);
                if(countMap.containsKey(f)){
                    if(countMap.get(f)==0){
                        curLen++;
                    }
                    countMap.put(f,countMap.get(f)+1);
                }
                left++;
            }
        }
//        System.out.println(head +" - " + d);
        return d==Integer.MAX_VALUE? "":s.substring(head,head + d + 1);
    }
}
