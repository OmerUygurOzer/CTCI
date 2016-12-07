import java.util.*;

/**
 * Created by Omer on 12/6/2016.
 */
public class WordLadderII {
//        public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
//            List<List<String>> result = new ArrayList<>();
//            if(wordList.isEmpty()){return result;}
//            HashMap<String,HashSet<String>> memo = new HashMap<>();
//            wordList.add(beginWord);
//            wordList.add(endWord);
//            processDictionary(wordList,memo);
//            helper(memo,result,new LinkedHashSet<>(),beginWord,endWord);
//            return result;
//        }

//        private void helper(HashMap<String,HashSet<String>> memo,List<List<String>> result,HashSet<String> cur,String beg,String end){
//            if(beg.equals(end)){
//                cur.add(end);
//                if(result.isEmpty()){
//                    result.add(new ArrayList<>(cur));
//                } else{
//                    if(cur.size()<result.get(0).size()){
//                        result.clear();
//                        result.add(new ArrayList<>(cur));
//                    } else if(cur.size()==result.get(0).size()) {
//                        result.add(new ArrayList<>(cur));
//                    }
//                }
//                return;
//            }
//            cur.add(beg);
//            for(String m: memo.keySet()){
//                if(memo.get(m).contains(beg)){
//                    for(String s: memo.get(m)){
//                        if(!s.equals(beg) && !cur.contains(s)) {
//                            cur.add(s);
//                            helper(memo, result, cur, s, end);
//                            cur.remove(s);
//                        }
//                    }
//                }
//            }
//        }
//
//        private void processDictionary(Set<String> wordList,HashMap<String,HashSet<String>> memo){
//            for(String s: wordList){
//                for(int i = 0 ; i<s.length(); i++){
//                    String key = s.substring(0,i) + '#' + s.substring(i+1,s.length());
//                    if(!memo.containsKey(key)){memo.put(key,new HashSet<>());}
//                    memo.get(key).add(s);
//                }
//            }
//        }


    //Faster
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        if(wordList.isEmpty()){return result;}
        wordList.remove(beginWord);
        wordList.remove(endWord);
        Set<String> cur = new LinkedHashSet<>(); cur.add(beginWord);
        iterate(wordList,result,cur,beginWord,endWord);
        return result;
    }

    private void iterate(Set<String> wordList,List<List<String>> result,Set<String> curSet,String beg,String end){
        if(isClose(beg,end)){
            curSet.add(end);
            if(result.isEmpty()){
                result.add(new ArrayList<>(curSet));
            } else{
                if(curSet.size()<result.get(0).size()){
                    result.clear();
                    result.add(new ArrayList<>(curSet));
                } else if(curSet.size()==result.get(0).size()) {
                    result.add(new ArrayList<>(curSet));
                }
            }
            return;
        }

        for (String cur : wordList) {
            if (isClose(beg, cur)) {
                curSet.add(cur);
                Set<String> rem = new HashSet<>(wordList); rem.removeAll(curSet);
                iterate(rem, result, curSet ,cur, end);
                curSet.remove(cur);
            }
        }
    }

    private boolean isClose(String a,String b){
        int c = 0;
        for(int i = 0;i<a.length();i++){
            c = a.charAt(i)!=b.charAt(i) ? c+1:c;
            if (c>1){return false;}
        }
        return true;
    }
}
