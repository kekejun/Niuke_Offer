package seventeen.didi.t2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/5
 * Time: 22:04
 */
class Node {
    int count;
    int money;
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] data = new Integer[n];
        Node[] node = new Node[m];

        for(int i = 0 ;i< n ;i++ ) {
            data[i] = sc.nextInt();
        }

        Arrays.sort(data,new ArraysComparator());

        for(int i = 0 ;i< m ;i++ ) {
            node[i] = new Node();
            node[i].count = sc.nextInt();
            node[i].money = sc.nextInt();
        }

        Arrays.sort(node, new NodeComparator());

        int sum = 0;
        for(int i = 0,j = 0 ;i< m && j< n ;i++ ) {
            if(node[i].count < data[j]) {
                sum += node[i].money;
                j++;
            }
        }
        System.out.println(sum);

    }
}
class ArraysComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

}
class NodeComparator implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        if(o1.count == o2.count)
            return o2.money - o1.money;
        return o2.count - o1.count;
    }
}