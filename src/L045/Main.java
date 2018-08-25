package L045;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/25
 * Time: 18:46
 */
public class Main {
    public boolean isContinuous(int [] numbers) {

        if(numbers == null || numbers.length == 0)
            return false;

        int[] data = new int[14];
        for(int now : numbers) {
            data[now]++;
        }
        boolean flag = true,nowFlag = true;
        int j = 5-data[0];

        for(int i = 1 ;i< data.length && j>0 ;i++ ) {
            if(nowFlag && data[i] != 0 ) {
                nowFlag = false;
                j--;
                if(data[i] > 1) {
                    flag = false;
                    break;
                }
            } else if(!nowFlag){
                if(data[i] == 0) {
                    if(data[0] > 0) {
                        data[0]--;
                    } else {
                        flag = false;
                        break;
                    }
                }  else {
                    j--;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        new Main().isContinuous(new int[]{0,3,2,6,4});
    }
}
