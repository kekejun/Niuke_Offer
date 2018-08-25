package L042;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/25
 * Time: 16:55
 */
public class Main {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array == null || array.length < 2)
            return list;

        int i = 0,j = array.length -1;
        while ( i<j ) {
            if(array[i]+array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);
                break;
            } else if(array[i] +array[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
        return list;
    }
}
