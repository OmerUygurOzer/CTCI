import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Omer on 11/23/2016.
 */
public class WordBreak {

    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> result = new ArrayList<>();
        if(s.isEmpty() || wordDict.isEmpty()){return result;}
        helper(result,s,new ArrayList<>(),wordDict);
        return result;
    }

    private void helper(List<String> result,String s,List<String> soFar,Set<String> wordDict){
        if(s.isEmpty()){
            result.add(flatten(soFar));
            return;
        }
        String substr;
        for(int i = 1;i<s.length()+1;i++){
            substr = s.substring(0,i);
            if(wordDict.contains(substr)){
                soFar.add(substr);
                helper(result,s.substring(i,s.length()),new ArrayList<>(soFar),wordDict);
                soFar.remove(soFar.size()-1);
            }

        }
    }


    private String flatten(List<String> nonflat){
        StringBuilder stringBuilder = new StringBuilder();
        for(String sf : nonflat){
            stringBuilder.append(sf);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }




}
