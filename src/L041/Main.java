package L041;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/25
 * Time: 16:38
 */
public class Main {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 1 ; i<= (sum+1)/2 ;i++ ){
            for(int j = 2 ;j*(j-1)*0.5+i*j <= sum;j++ ) {
                if(j*(j-1)*0.5+i*j == sum ) {
                    ArrayList<Integer> now = new ArrayList<>();
                    for(int k = i ; k< i+j ; k++ )
                        now.add(k);
                    result.add(now);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new Main().FindContinuousSequence(100);
    }
}
