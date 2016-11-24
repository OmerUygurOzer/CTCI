import java.util.HashMap;

/**
 * Created by Omer on 11/23/2016.
 */
public class CopyListWithRandomPointer {

      class RandomListNode {
          int label;
          RandomListNode next, random;
          RandomListNode(int x) { this.label = x; }
      };


    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null){return null;}
        HashMap<RandomListNode,RandomListNode> memo = new HashMap<>();
        RandomListNode cur = head;
        while (cur!=null){
            memo.put(cur,new RandomListNode(cur.label));
            cur = cur.next;
        }

        cur = head;

        while(cur!=null){
            memo.get(cur).next = memo.get(cur.next);
            memo.get(cur).random = memo.getOrDefault(cur.random,null);
            cur = cur.next;
        }

        return memo.get(head);
    }


}
