package seventeen.jingdong.t2;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/4
 * Time: 20:17
 */
public class Main {

    public static int getMaxYue(int x,int y) {
        if(y == 0)
            return x;
        return x % y == 0 ? y :getMaxYue(y,x%y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 2;
        int[] data = new int[5001];
        int[] child = new int[5001];
        while (scanner.hasNext()) {
            int now = scanner.nextInt();
            if(now < index) {
                System.out.println(data[now]+"/"+child[now]);
            } else {
                int sum = 0;
                for(int i = index ;i< now ;i++ ) {
                    int temp = now;
                    while (temp != 0) {
                        sum += temp%i;
                        temp /= i;
                    }
                    int gcd = getMaxYue(data[index-1]+sum,child[index-1]+i-index+1);
                    data[i] = (data[index-1]+sum)/gcd;
                    child[i] = (child[index-1]+i-index+1)/gcd;
                }
                System.out.println(data[now-1]+"/"+child[now-1]);
                index = now+1;
            }
        }
    }
}
