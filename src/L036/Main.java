package L036;


/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/21
 * Time: 19:54
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null)
            return null;

        int sum1 = getLength(pHead1);
        int sum2 = getLength(pHead2);

        if(sum1 > sum2) {
            for(int i = 0 ;i< sum1-sum2 ;i++ )
                pHead1 = pHead1.next;
        } else {
            for(int i = 0 ;i< sum2-sum1 ;i++ )
                pHead2 = pHead2.next;
        }

        while(pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return pHead1;
    }
    int getLength(ListNode node) {
        int sum = 0;
        while (node != null ){
            node = node.next;
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Main main = new Main();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);

        ListNode node1 = new ListNode(4);
        node1.next = new ListNode(5);

        ListNode node2 = new ListNode(6);
        node2.next = new ListNode(7);

        node.next.next.next = node2;
        node1.next.next = node2;

        main.FindFirstCommonNode(node1,node2);
    }
}
