import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Omer on 11/29/2016.
 */
public class LetterCombinationsOfPhone {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.isEmpty()){return result;}
        HashMap<Character,char[]> t9 = new HashMap<>();
        t9.put('2',new char[]{'a','b','c'});
        t9.put('3',new char[]{'d','e','f'});
        t9.put('4',new char[]{'g','h','i'});
        t9.put('5',new char[]{'j','k','l'});
        t9.put('6',new char[]{'m','n','o'});
        t9.put('7',new char[]{'p','q','r','s'});
        t9.put('8',new char[]{'t','u','v'});
        t9.put('9',new char[]{'w','x','y','z'});


        helper(result,t9,digits,0,new StringBuilder());
        return result;
    }


    private void helper(List<String> result,HashMap<Character,char[]> t9,String digits,int index,StringBuilder cur){
        if(index==digits.length()){result.add(cur.toString());return;}
        for(Character c: t9.get(digits.charAt(index))){
            cur.append(c);
            helper(result,t9,digits,index+1,cur);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}
