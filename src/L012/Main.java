package L012;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 20:51
 */
public class Main {
    public double Power(double base, int exponent) {
        int flag = exponent < 0 ? 1: 0;
        exponent = Math.abs(exponent);
        if(exponent == 0)
            return 1;
        else {
            double temp = base;
            for(int i = 1 ;i< exponent ;i++ )
                base *= temp;
        }
        if(flag == 1)
            base = 1.0/base;
        return base;
    }
}
