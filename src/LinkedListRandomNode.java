import java.util.Random;

/**
 * Created by Omer on 11/13/2016.
 */
public class LinkedListRandomNode {

    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
    }

    private ListNode head;
    private int size;

    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        this.size = 0;

        ListNode cur = head;

        while(cur!=null){
                size++;
                cur = cur.next;
        }
    }


    public int getRandom() {
        Random random = new Random();
        int randomVal = random.nextInt(size);
        ListNode cur = head;

        for(int i = 0; i <randomVal;i++){
            cur = cur.next;
        }

        return cur.val;
    }
}
