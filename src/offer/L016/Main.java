package offer.L016;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 21:39
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return  list2;
        if(list2 == null)
            return list1;

        ListNode one,two,begin;
        if(list1.val < list2.val) {
            one = list1;
            two = list2;
        } else {
            one = list2;
            two = list1;
        }
        begin = one;

        while (one.next!=null && two!=null){
            if(one.val <= two.val && one.next.val > two.val){
                ListNode next = two.next;
                two.next = one.next;
                one.next = two;
                two = next;
            } else {
                one = one.next;
            }
        }

        if(two!=null) {
            one.next = two;
        }
        return begin;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode result = new Main().Merge(list1,list2);

        while(result!=null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
