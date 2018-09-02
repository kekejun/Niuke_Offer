package offer.L010;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 20:36
 */
public class Main {
    public int RectCover(int target) {
        if(target == 0 )
            return 0;
        else if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        return RectCover(target-1) + RectCover(target-2);
    }
}
