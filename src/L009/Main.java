package L009;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 20:26
 */
public class Main {
    public int JumpFloorII(int target) {
        if(target <= 0)
            return 0;
        else {
            int sum = 1;
            for(int i = 1 ;i< target ;i++ )
                sum = sum*2;
            return sum;
        }
    }
}
