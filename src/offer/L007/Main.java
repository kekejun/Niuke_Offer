package offer.L007;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 20:09
 */
public class Main {
    public int Fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int pre = 0,now = 1;
        for(int i = 2 ;i<= n ;i++ ) {
            now = pre+now;
            pre = now - pre;
        }
        return now;
    }

    public static void main(String[] args) {
        System.out.println(new Main().Fibonacci(7));
    }
}
