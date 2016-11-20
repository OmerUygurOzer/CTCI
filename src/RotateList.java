/**
 * Created by Omer on 11/18/2016.
 */
public class RotateList {


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null){return head;}
        int count = 0;

        ListNode cur = head;
        ListNode tail = cur;

        while (cur!=null){
            tail = cur;
            cur = cur.next;
            count++;
        }


        int c = k%count;
        int headI = count - c;

        ListNode dummyHead = head;

        while(headI >1){
            dummyHead = dummyHead.next;
            headI--;
        }

        tail.next = head;
        head = dummyHead.next;
        dummyHead.next = null;

        return head;
    }
}
