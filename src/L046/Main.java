package L046;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/25
 * Time: 19:16
 */
public class Main {
    public int LastRemaining_Solution(int n, int m) {
        if(n < 1 || m < 1)
            return -1;
        int[] array = new int[n];
        int i = -1,step = 0,count = n;
        while (count > 0) {
            i++;
            if(i>=n)
                i = 0;
            if(array[i] == -1)
                continue;
            step++;
            if(step == m) {
                array[i] = -1;
                step = 0;
                count--;
            }
        }
        return i;
    }
}
