package L013;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/16
 * Time: 20:57
 */
public class Main {
    public void reOrderArray(int [] array) {
        for(int i = 0 ;i< array.length ;i++ ){
            for(int j = 0;j < array.length -i -1 ;j++ ) {
                if(array[j]%2 == 0 && array[j+1]%2 == 1) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
