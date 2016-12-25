import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Omer on 12/25/2016.
 */
public class FindAllAnagrams {
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> result = new ArrayList<>();
//        if(p.length() > s.length()){return result;}
//
//        for(int i = 0; i < s.length()-p.length(); i++){
//            if(isAnagram(s.substring(i,i+p.length()),p)){
//                result.add(i);
//            }
//        }
//
//
//        return result;
//    }

//    private boolean isAnagram(String p,String c){
//        char[] pAry = p.toCharArray();
//        char[] cAry = c.toCharArray();
//        Arrays.sort(pAry);
//        Arrays.sort(cAry);
//        return Arrays.equals(pAry,cAry);
//    }

    //Faster
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(p.length() > s.length()){return result;}

        int [] map = new int[26];
        for(char c :p.toCharArray()){
            map[c-'a']++;
        }

        int cur = p.length();
        int left = 0;

        for(int i = 0; i < s.length() ; i++){
            if (i - left == p.length() && map[s.charAt(left++)-'a']++ >= 0) cur++;
            if(--map[s.charAt(i)-'a']>=0){cur--;}
            if(cur==0){result.add(left);}
        }

        return result;
    }


}
