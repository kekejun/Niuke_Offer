package L015;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 21:12
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null )
            return head;

        ListNode pre = head;
        ListNode now = head.next;
        pre.next = null;

        while(now != null) {
            ListNode next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }

        return pre;
    }
}
