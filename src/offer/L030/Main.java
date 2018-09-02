package offer.L030;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/21
 * Time: 16:43
 */
public class Main {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        System.arraycopy(array,0,dp,0,array.length);
        int max = Integer.MIN_VALUE;
        for(Integer temp : array) {
            if(temp > max)
                max = temp;
        }

        for(int i = 1; i< array.length; i++ ){
            for(int j = 0 ; j+i <array.length ;j++) {
                dp[j] += array[j+i];
                if(max < dp[j])
                    max = dp[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        new Main().FindGreatestSumOfSubArray(array);
    }
}
