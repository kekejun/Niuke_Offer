package offer.L047;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/26
 * Time: 18:33
 */
public class Main {
    public int Sum_Solution(int n) {
        int ans = n;

        boolean b = (n>0) && (ans += Sum_Solution(n-1))>0;

        return ans;
    }
}
