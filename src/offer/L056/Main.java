package offer.L056;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 10:29
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next ==null)
            return pHead;

        ListNode now = pHead;
        ListNode pre = new ListNode(0);
        ListNode begin = pre;

        boolean flag = true;
        while (now!=null) {
            if(now.next == null)
                break;

            if(now.val == now.next.val) {
                while (now.next!=null && now.val == now.next.val) {
                    now.next = now.next.next;
                }
                pre.next = now.next;
                now = now.next;
            } else {
                if(flag) {
                    begin.next = now;
                    flag = false;
                }
                pre = now;
                now = now.next;
            }
        }
        return begin.next;
    }

    public static void main(String[] args) {
        ListNode now = new ListNode(1);
        now.next = new ListNode(1);
        now.next.next = new ListNode(1);
        now.next.next.next = new ListNode(1);
//        now.next.next.next.next = new ListNode(4);
//        now.next.next.next.next.next = new ListNode(4);
//        now.next.next.next.next.next.next = new ListNode(5);
        new Main().deleteDuplication(now);
    }
}
