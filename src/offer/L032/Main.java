package offer.L032;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/21
 * Time: 17:46
 */
public class Main {
    public String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0)
            return "";
        Arrays.sort(numbers);
        String str = String.valueOf(numbers[0]);

        for(int i = 1 ;i< numbers.length ;i++ ){
            String now = String.valueOf(numbers[i]);
            if(now.charAt(0) != '0' || str.charAt(0) != '0'){
                String temp1 = now+str;
                String temp2 = str+now;
                str = temp1.compareTo(temp2) < 0 && temp1.charAt(0) != '0'? temp1 : temp2;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int[] array = {3,5,1,4,2};
        System.out.println(new Main().PrintMinNumber(array));
    }
}
