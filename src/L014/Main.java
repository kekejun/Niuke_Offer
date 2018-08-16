package L014;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 21:02
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode nowK = head;
        for(int i = 0 ;i< k ;i++ ) {
            if(head == null)
                return head;
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            nowK = nowK.next;
        }
        return nowK;
    }
}
