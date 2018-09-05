package seventeen.jingdong.t3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/2
 * Time: 18:14
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthA = sc.nextInt();
        int lengthB = sc.nextInt();

        int[] result = new int[lengthA+lengthB];

        for(int i = 0 ;i < lengthA+lengthB ;i++ ) {
            result[i] = sc.nextInt();
        }

        Arrays.sort(result);

        System.out.print(result[0]);
        int temp = result[0];
        for(int i = 1 ;i< lengthA + lengthB ;i++ ) {
            if(temp == result[i])
                continue;
            temp = result[i];
            System.out.print(" "+result[i]);
        }
        System.out.println();
    }
}
