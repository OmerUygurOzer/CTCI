import java.util.*;

/**
 * Created by Omer on 2/13/2017.
 */
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        List<CachedLinkedHashSet<String>> bfs = new LinkedList<>();
        CachedLinkedHashSet<String> init = new CachedLinkedHashSet<>(); init.add(beginWord);
        bfs.add(init);
        int level = 0;
        int newLevel = 1;
        while(level != newLevel) {
            level = newLevel;
            for (CachedLinkedHashSet<String> cur : bfs) {
                for (String s : wordList) {
                    if (!cur.contains(s)) {
                        if(cur.getLast().equals(endWord)){return cur.size()+1;}
                        if (oneDist(s, cur.getLast())) {
                            newLevel++;
                            cur.add(s);
                            bfs.add(new CachedLinkedHashSet<>(cur));
                        }
                    }
                }
            }
        }
        return 0;
    }

//    private void helper(int [] res, String begWord, String endWord, Set<String> cur, List<String> wordList){
//        if(begWord.equals(endWord)){res[0] = Math.min(res[0],cur.size());return;}
//        for(String s : wordList){
//            if(!cur.contains(s)) {
//                if (oneDist(s, begWord)) {
//                    cur.add(s);
//                    helper(res, s, endWord, cur, wordList);
//                    cur.remove(s);
//                }
//            }
//        }
//    }

    private boolean oneDist(String s1,String s2){
        int d = 0;
        for(int i = 0; i <s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){d++;}
        }
        return d == 1;
    }

    class CachedLinkedHashSet<String> extends LinkedHashSet<String> {
        private String last = null;

        public CachedLinkedHashSet(CachedLinkedHashSet<String> c){
            super(c);
            this.last = c.last;
        }

        public CachedLinkedHashSet(){
            super();
        }

        @Override
        public boolean add(String e) {
            last = e;
            return super.add(e);
        }

        public String getLast() {
            return last;
        }

    }
}
