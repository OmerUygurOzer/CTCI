import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 1/1/2017.
 */
public class PalindromePairs {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        TrieNode trie = new TrieNode();
        buildTree(trie,words);
        for(int i = 0 ; i < words.length; i++){search(trie,words[i],i,result);}
        return result;
    }


    private void search(TrieNode tree,String word,int index,List<List<Integer>> result){
        TrieNode cur;
        for(char c : word.toCharArray()){
            cur = tree.nodes[c-'a'];
            if(cur==null){return;}
        }

    }

    private void buildTree(TrieNode root,String[] words){
        TrieNode cur = null;
        for(int i = 0; i < words.length; i++){
            cur = root;
            char c;
            for(int j = words[i].length()-1; j>=0; j--){
                c = words[i].charAt(j);
                if(cur.nodes[c-'a']==null){cur.nodes[c-'a'] = new TrieNode();}
                cur = cur.nodes[c-'a'];
            }
            cur.index = i;
            cur.indices.add(i);
        }
    }

    private class TrieNode{
        TrieNode nodes[] = new TrieNode[26];
        int index;
        List<Integer> indices = new ArrayList<>();
    }

    private boolean isPalindrome(String word){
        if(word.length()==1){return true;}
        for(int i = 0 ; i <word.length()/2 ; i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){return false;}
        }
        return true;
    }
}
