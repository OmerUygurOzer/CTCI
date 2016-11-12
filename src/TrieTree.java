
import java.util.HashMap;

/**
 * Created by Omer on 10/24/2016.
 */
public class TrieTree {

    private class Node{
      public HashMap<Character,Node> next = new HashMap<>();
    }

    private Node root;

    public TrieTree(){
        root = new Node();
    }


    public void addWord(String word){
        addWord(root,word,0);
    }

    private void addWord(Node cur,String word, int itr){
        if(itr==word.length()){return;}
        if(cur.next.containsKey(word.charAt(itr))){
            addWord(cur.next.get(word.charAt(itr)),word,itr+1);
        }else{
            Node node = new Node();
            cur.next.put(word.charAt(itr),node);
            addWord(node,word,itr+1);
        }
    }


    public boolean hasWord(String word){
        int itr = 0;
        Node cur = root;
        while(itr<word.length()){
            if(cur.next.containsKey(word.charAt(itr))){
                cur = cur.next.get(word.charAt(itr));
                itr++;
            }else{
                return false;
            }
        }
        return true;
    }

    public void printTree(){
        Node cur = root;
        for(Character c: cur.next.keySet()){
            System.out.println(c);
            printNode(cur);
        }
    }

    private void printNode(Node node){
        for(Character c: node.next.keySet()){
            printNode(node.next.get(c));
            System.out.print(c);
        }
    }



}
