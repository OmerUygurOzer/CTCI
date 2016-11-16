import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Omer on 11/15/2016.
 */
public class AddTwoNumbers {

    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node1 = l1;
        ListNode node2 = l2;

        int carry = 0;

        ListNode cur = new ListNode(0);
        ListNode result = cur;

        while (node1 !=null || node2!=null || carry!=0){
            int val = carry;

            if(node1 !=null){
                val += node1.val;
                node1 = node1.next;
            }

            if(node2 !=null){
                val +=node2.val;
                node2 = node2.next;
            }

        ListNode temp = new ListNode(val%10);
        carry    = val/10;
        result.next = temp;
        result = result.next;


        }


        return cur.next;
    }
}
