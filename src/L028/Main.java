package L028;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/18
 * Time: 21:32
 */
public class Main {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0)
            return 0;
        int num = array[0],count = 1;
        for(int i = 1 ;i< array.length ;i++ ) {
            if(array[i] != num)
                count--;
            else
                count++;
            if(count == 0 ){
                num = array[i];
                count = 1;
            }
        }
        count = 0;
        for(int i = 0 ;i< array.length ;i++ ){
            if(array[i] == num)
                count++;
        }
        if(array.length/2 < count)
            return num;
        else
            return 0;
    }
}
