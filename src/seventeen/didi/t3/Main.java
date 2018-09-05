package seventeen.didi.t3;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/5
 * Time: 22:34
 */
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int sum = 1;
        for(int i = 1 ;i<= n ;i++ ) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
