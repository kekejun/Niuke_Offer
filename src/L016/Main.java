package L016;

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
        ListNode begin = list1;
        ListNode temp = null;
        while(list2 != null && list1 != null){
            if(list1 == begin && list1.val >= list2.val){
                temp = list2.next;
                list2.next = list1;
                list1 = list2;
                list2 = temp;
                begin = list1;
            }

            if(list1.next.val >= list2.val ){
                temp = list2.next;
                list2.next = list1.next;
                list1.next = list2;
                list2 = temp;
            } else {
                list1 = list1.next;
            }
        }
        return begin;
    }
}
