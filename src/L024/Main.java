package L024;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/18
 * Time: 19:46
 */

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Main {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null )
            return null;
        RandomListNode now = new RandomListNode(pHead.label);
        now.next = Clone(pHead.next);
        now.random = pHead.random;

        return now;
    }

    public static void main(String[] args) {
        RandomListNode now = new RandomListNode(1);
        now.next = new RandomListNode(2);
        now.random = new RandomListNode(3);

        RandomListNode temp= new Main().Clone(now);
        System.out.println(temp.label);
        System.out.println(temp.next.label);
        System.out.println(temp.random.label);
    }
}
