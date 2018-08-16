package L008;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 20:14
 */
public class Main {
    public int JumpFloor(int target) {
        return Floor(0,target);
    }
    public int Floor(int now , int target) {
        if(now == target)
            return 1;
        if(now > target)
            return 0;
        int total = Floor(now+1,target);
        total += Floor(now+2,target);

        return total;
    }

    public static void main(String[] args) {
        System.out.println(new Main().JumpFloor(4));
    }

}
