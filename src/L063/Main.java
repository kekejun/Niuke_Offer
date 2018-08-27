package L063;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 13:51
 */
public class Main {

    private int count = 0;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });

    public void Insert(Integer num) {
        if(count % 2 == 0 ) {
            maxHeap.add(num);
            int temp = maxHeap.poll();
            minHeap.add(temp);
        } else {
            minHeap.add(num);
            int temp = minHeap.poll();
            maxHeap.add(temp);
        }
        count++;
    }

    public Double GetMedian() {
        if(count % 2 == 0) {
            return ((double) (maxHeap.peek() + minHeap.peek())) /2;
        } else {
            return (double) minHeap.peek();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Insert(5);
        System.out.println(main.GetMedian());
        main.Insert(2);
        System.out.println(main.GetMedian());
    }

}
