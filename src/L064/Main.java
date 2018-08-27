package L064;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/27
 * Time: 20:19
 */
public class Main {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if(num.length < size || size == 0)
            return result;

        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i< size ;i++ ){
            if(num[i] > max)
                max = num[i];
        }
        result.add(max);

        for(int i = size ;i< num.length ;i++ ) {
            if(num[i] >= max) {
                max = num[i];
                result.add(max);
            } else if(max > num[i-size]) {
                result.add(max);
            } else {
                max = Integer.MIN_VALUE;
                for(int j = i-size+1 ;j<=i ;j++ ){
                    if(num[j] > max)
                        max = num[j];
                }
                result.add(max);
            }
        }
        return result;
    }

}
