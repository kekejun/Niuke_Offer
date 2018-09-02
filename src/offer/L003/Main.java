package offer.L003;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/15
 * Time: 20:01
 */

 class ListNode {
     int val;
     ListNode next = null;

     ListNode(int val) {
         this.val = val;
     }
 }

public class Main {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while(listNode != null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        for(int i = 0 ;i< list.size()/2 ;i++ ){
            int temp = list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp);
        }
        return list;
    }

}
