package L050;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/26
 * Time: 19:00
 */
public class Main {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i = 0 ;i< length ;i++ ) {
            int now = numbers[i];
            if(now >= length) {
                now -= length;
            }
            if(numbers[now] >= length) {
                duplication[0] = now;
                return true;
            } else {
                numbers[now] += length;
            }
        }
        return false;
    }
}
