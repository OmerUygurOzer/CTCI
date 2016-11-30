import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Omer on 11/29/2016.
 */
public class MergeKSortedLists {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null){return null;}
        if(lists.length==0){return null;}
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val,o2.val);
            }
        });

        for(ListNode n:lists){
            if(n!=null)queue.offer(n);
        }

        ListNode start = null;
        ListNode cur   = null;

        while (!queue.isEmpty()){
          if(start==null){
              start=queue.poll();
              cur  = start;
              if(start.next!=null)queue.offer(start.next);
              continue;
          }
            cur.next = queue.poll();
            if(cur.next.next!=null)queue.offer(cur.next.next);
            cur = cur.next;
        }
        return start;
    }

}
