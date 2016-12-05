import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 12/4/2016.
 */
public class WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        if(words==null || words.length ==0){return result;}

        TrieNode trie = new TrieNode();
        buildTrie(trie,words);
        int width,height;
        height = board.length;
        width  = board[0].length;

        boolean [][] mark = new boolean[height][width];

        for(int i = 0 ; i < height; i++){
            for(int j = 0 ; j < width; j++){
                search(result,trie,board,mark,width,height,j,i);
            }
        }

        return result;
    }

    private void search(List<String> result,TrieNode trie,char[][] board,boolean[][] mark,int width,int height,int x,int y){
        if(x < 0 || x >=width || y<0 || y>=height ){return;}
        if(mark[y][x]){return;}
        char c = board[y][x];
        TrieNode cur = trie.nodes[c-'a'];
        if(cur==null){return;}
        if(cur.word!=null){
            result.add(cur.word);
            cur.word = null;
        }
        mark[y][x] = true;
        search(result,cur,board,mark,width,height,x-1,y);
        search(result,cur,board,mark,width,height,x+1,y);
        search(result,cur,board,mark,width,height,x,y-1);
        search(result,cur,board,mark,width,height,x,y+1);
        mark[y][x] = false;
    }

    private void buildTrie(TrieNode root,String[] words){
        TrieNode cur;
        for(String word: words){
            cur = root;
            for(char c: word.toCharArray()){
                if(cur.nodes[c-'a']==null){cur.nodes[c-'a'] = new TrieNode();}
                cur = cur.nodes[c-'a'];
            }
            cur.word = word;
        }
    }

    public class TrieNode{
        TrieNode[] nodes = new TrieNode[26];
        String word;
    }
}
