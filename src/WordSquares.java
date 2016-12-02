import java.util.*;

/**
 * Created by Omer on 11/30/2016.
 */
public class WordSquares {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> result = new LinkedList<>();
        TrieNode trie = new TrieNode();
        buildTrie(words,trie);
        findSquares(result,words,new ArrayList<String>(),trie);
        return result;
    }

    private void buildTrie(String[] words,TrieNode root){
        TrieNode cur = root;
        for(String word: words){
            for(int i = 0; i < word.length();i++){
                int itr = word.charAt(i) - 'a';
                cur.nodes[itr] = cur.nodes[itr]==null?new TrieNode():cur.nodes[itr];
                cur.words.add(word);
                cur = cur.nodes[itr];
            }
            cur = root;
        }
    }

    private void findSquares(List<List<String>> result,String[] words,List<String> cur,TrieNode trie){
        for(String word:words){
             cur.add(word);
             helper(result,words,cur,trie);
             cur.remove(cur.size()-1);
        }
    }

    private void helper(List<List<String>> result,String[] words,List<String> cur,TrieNode trie){
        if(cur.size()==words[0].length()){result.add(new ArrayList<>(cur));return;}

        int itr = cur.size();
        StringBuilder prefs = new StringBuilder();
        for(String w : cur){
            prefs.append(w.charAt(itr));
        }
        HashSet<String> set = findWords(trie,prefs.toString());
        for(String s : set){
            cur.add(s);
            helper(result,words,cur,trie);
            cur.remove(cur.size()-1);
        }

    }

    private HashSet<String> findWords(TrieNode root,String pref){
        TrieNode node = root;
        for(char c : pref.toCharArray()){
            TrieNode temp =  node.nodes[c - 'a'];
            if(temp!=null){
                node = temp;
            }else{
                return new HashSet<>();
            }
        }
        return node.words;
    }

    private class TrieNode{
        TrieNode [] nodes = new TrieNode[26];
        HashSet<String> words = new HashSet<>();
    }



}
