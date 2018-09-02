package offer.L040;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/25
 * Time: 16:06
 */
public class Main {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length < 2 )
            return;

        int result = 0;
        int flag = 1;
        for(int now : array) {
            result ^= now;
        }

        while ((result & flag) == 0)
            flag <<= 1;

        for(int now : array ) {
            if((flag & now) == 0)
                num2[0] ^= now;
            else
                num1[0] ^= now;
        }
    }

    public static void main(String[] args) {
        new Main().FindNumsAppearOnce(new int[]{2,2,3,12},new int[1],new int[1]);
    }
}
