package seventeen.jingdong.t4;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/9/4
 * Time: 20:52
 */
public class Main {

    public static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[18];
        data[0] = 1;

        int count = 1,dataSum = 1,sum = 1,temp = n;

        for(int i = 2 ;i<= n ;i++ ) {
            dataSum = i%10 == 0? getSum(i) :dataSum+1;
            int j = 0;
            data[j]++;
            sum++;
            while (data[j] != 1) {
                data[j++] = 0;
                data[j]++;
                sum--;
            }
            if(sum == dataSum) {
                count++;
            }
        }
        System.out.println(count);
    }
}
