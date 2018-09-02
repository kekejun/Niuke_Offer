package offer.L001;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/15
 * Time: 19:16
 */
public class Main {
    public static boolean Find(int target, int [][] array) {

        int rowCount = array.length;
        int colCount = array[0].length;
        int i = 0 ,j = 0;
        int now = rowCount-i-1;

        while (now>=0 && j<colCount){

            if(array[now][j] == target)
                return true;
            if(array[now][j] < target){
                j++;
            } else if(array[now][j] > target) {
                i++;
            }
            now = rowCount-i-1;
        }
        return false;
    }

}
