/**
 * Created by Omer on 12/16/2016.
 */
public class OddEvenLinkedList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public ListNode oddEvenList(ListNode head) {
        if(head==null){return null;}

        ListNode cur = head;
        ListNode oddsHead = null;
        ListNode odds = null;
        ListNode evensHead =null;
        ListNode evens=null;

        boolean odd = true;
        while(cur!=null){
            if(odd){
                if(odds==null){
                    oddsHead = cur;
                    odds = cur;
                }else{
                    odds.next = cur;
                    odds = odds.next;
                }
                odd=!odd;
            }else{
                if(evens==null){
                    evensHead = cur;
                    evens = cur;
                }else{
                    evens.next = cur;
                    evens = evens.next;
                }
                odd=!odd;
            }
            cur = cur.next;
        }

        odds.next = evensHead;
        return oddsHead;
    }
}
